package examenOrdinariaMio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		int intOpcion=0;
		
		do {
			switch(intOpcion=menu()) {
				case 1 -> comprar();
				case 2 -> estadisticas();
			}
		}while(intOpcion!=0);
		
		System.out.println("Adios");
	}

	private static Object estadisticas() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void comprar() {
		Cliente objCliente = null;
		boolean blnContinuar = false;
		String strAux;
		
		System.out.println("Para hacer una compra debe identificarse");
		do {
			System.out.println("Introduzca el nif y su password");
			objCliente=ClienteDAO.confirmar(new Cliente(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine()));
			if(objCliente==null) {//sin no estaba bien nif o password preguntar si quiere seguir
				System.out.print("El nif o la password no son correctos, inserte 's' si desea volver a introducir los datos ");
				strAux=new Scanner(System.in).nextLine();
				blnContinuar = (strAux.length()>0 && strAux.charAt(0)=='s')?true:false;
			} else
				blnContinuar = false;
		}while(blnContinuar);
		
		if(objCliente!=null && objCliente.getNombre()!=null) {
			System.out.println("\nHola " + objCliente.getNombre() + " ahora seleccione los artículos a comprar\n");
			aniadirArticulos(objCliente);//seguimos con la compra
		}
	}

	private static void aniadirArticulos(Cliente objCliente) {
		Map<Integer,Integer> cestaCompra = new TreeMap<>();//clave zapatilla, cantidad
		Map<Integer, Articulo> listadoArticulos = new TreeMap<>();//articulos ya pedidos
		String strArticulo; //para leer los artículos que quiera insertar
		int intArticulo; //clave del artículo
		Integer intCantidad;
		
		ArticuloDAO.mostrar();
		
		do {
			System.out.println("Indica el código del artículo o pulsa enter para terminar");
			do {
				System.out.print("Tiene que ser un número de 4 dígitos: ");
				intArticulo=0;
				strArticulo=new Scanner(System.in).nextLine();
				try {
					intArticulo=Integer.parseInt(strArticulo);
				}catch(Exception e) {}
			}while(!strArticulo.equals("") && (intArticulo<999 || intArticulo>9999));
			
			if(!strArticulo.equals("")){//si ya no quiere compra más salgo de este punto
				System.out.print("Introduce la cantidad que deseas comprar: ");
				do {
					intCantidad=null;
					try {
						intCantidad=Integer.parseInt(new Scanner(System.in).nextLine())%99;
					}catch(Exception e) {}
				}while(intCantidad==null);
				
				if(intCantidad!=0)//si no ha puesto cantidad no hacer nada
					if(cestaCompra.containsKey(intArticulo)){//si el artículo ya está en la cesta
						intCantidad=(intCantidad + cestaCompra.get(intArticulo));//cambio la cantidad que ya tenía
						if(intCantidad>99)
							intCantidad=99;
						if(intCantidad>0)
							cestaCompra.put(intArticulo, intCantidad);//pongo la cantidad en la cesta de la compra
						else {//hay que eliminar el artículo de la cesta, ya que no tiene unidades
							cestaCompra.remove(intArticulo);
							listadoArticulos.remove(intArticulo);
						}
					}else {
						Articulo aux= ArticuloDAO.buscar(intArticulo);//para ver si existe
						if(aux!=null) {
							listadoArticulos.put(intArticulo, aux);//añado el artículos a los que ya teníamos
							cestaCompra.put(intArticulo, intCantidad);//pongo la cantidad en la cesta de la compra
						}else
							System.out.println("No existe el artículo");

				}
			}
			if(cestaCompra.size()>0) {
				System.out.println("\nCesta de la compra: ");
				for(Entry<Integer, Integer> valor:cestaCompra.entrySet())
					System.out.println(listadoArticulos.get(valor.getKey()).getStrNombre() + " cantidad= " + valor.getValue());
				System.out.println();
			}
		}while(!strArticulo.equals(""));
		
		if(cestaCompra.size()>0) //si ha comprado se genera la factura, sino vuelve al menú
			imprimeFactura(objCliente, cestaCompra, listadoArticulos);
	}

	private static void imprimeFactura(Cliente objCliente, Map<Integer, Integer> cestaCompra,
			Map<Integer, Articulo> listadoArticulos) {
		String strRuta = "src/examenOrdinaria/facturas";
		String strFichero = nombreFichero(strRuta);
		double rlnTotal = 0;
		Double rlnDescuento;
		int intParcial;
		
		//si no existe el directorio se crea
		if(!new File("src/examenOrdinaria/facturas").isDirectory())
			new File("src/examenOrdinaria/facturas").mkdir();
		
		if(strFichero!=null) 
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strRuta+"/"+strFichero))) {
				rlnDescuento = descuento();
				//primera línea
				bw.write(strFichero.substring(0,10) + "\t" + DateTimeFormatter.ofPattern("hh:mm dd/mm/yyyy ").format(LocalDateTime.now()));
				bw.newLine();
				bw.newLine();
				//títulos
				bw.write("Atículo" + espacios("Atículo",20) + "Cantidad Precio" + espacios("Total",20) + "Total");
				bw.newLine();
				for(Entry<Integer,Articulo> objArticulo:listadoArticulos.entrySet()) {
					intParcial=cestaCompra.get(objArticulo.getKey()) * objArticulo.getValue().getIntPrecio();
					bw.write(objArticulo.getValue().getStrNombre() + espacios(objArticulo.getValue().getStrNombre(),21));
					bw.write(espacios(String.valueOf(cestaCompra.get(objArticulo.getKey())),8) + cestaCompra.get(objArticulo.getKey()));
					bw.write(espacios(String.valueOf(objArticulo.getValue().getIntPrecio()),6) + objArticulo.getValue().getIntPrecio());
					bw.write(espacios(String.valueOf(intParcial),20) + intParcial);
					bw.newLine();
					rlnTotal += intParcial;
				}
				bw.newLine();
				bw.newLine();
				bw.write("Total: " + (int)rlnTotal);
				bw.newLine();
				if(rlnDescuento==null)
					rlnDescuento=0.0;
				bw.write("\t\tDescuento: " + rlnDescuento);
				bw.newLine();
				bw.newLine();
				bw.write("Total con descuento: " + (rlnTotal-(rlnTotal*rlnDescuento/100)));
				
			} catch (IOException e) {
				System.out.println("Se produjo un error ES");
			}
	}

	private static Double descuento() {
		Double rlnDevolver=null;
		String strDescuento=null;
		
		do {
			System.out.print("Si tienes algún descuento, indica el código: ");
			strDescuento = new Scanner(System.in).nextLine();
			if(strDescuento.length()>0) {//se podría crear el objetoDAO, pero no es necesario
				try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/examen1", "root", "");
					 Statement st = con.createStatement()){
					 ResultSet rs = st.executeQuery("select DESCUENTO from DESCUENTOS where ID='" + strDescuento + "'");
					 if(rs.next())
						 rlnDevolver = rs.getDouble(1);
				} catch (SQLException ex) {System.out.println("Error al conectar al SGBD.");}
			}
			
			if(rlnDevolver==null) {
				System.out.print("Código no válido, si deseas meter otro descuento pulsa's': ");
				strDescuento = new Scanner(System.in).nextLine();
			}
		}while(rlnDevolver==null && strDescuento.equals("s"));

		return rlnDevolver;
	}

	private static String espacios(String strCadena, int intNum) {
		String strDevolver = "";
		
		for(int intCont=strCadena.length(); intCont<=intNum; intCont++)
			strDevolver += " ";
		
		return strDevolver;
	}

	private static String nombreFichero(String strRuta){
		String strFichero = null;
		
		File[] arrFicheros = new File(strRuta).listFiles();
	
		if(arrFicheros!=null && arrFicheros.length>0) {
			Arrays.sort(arrFicheros);
			for(int intCont=arrFicheros.length-1; strFichero==null && intCont>=0; intCont--) {
				try{
					String strAux=arrFicheros[intCont].getName();
					if(strAux.length()==14 && strAux.substring(0,7).equals("factura") && strAux.substring(10).equals(".txt"))//no llamo con la mayoría de nombres de fichero
						strFichero="factura" + formatear(strAux.substring(7,10)) + ".txt";
				} catch (Exception e) {}
			}
		}
		if(strFichero==null)
			strFichero="factura001.txt";
		
		return strFichero;
	}

	private static String formatear(String strNumero) {
		String strValor;
		
		strValor = String.valueOf(Integer.parseInt(strNumero)+1);
		while(strValor.length()<3)//que tenga los tres digitos
			strValor="0"+strValor;

		return strValor;
	}

	private static int menu() {
		Integer intOpcion = null;
		do{
			System.out.println("\n\nSelecciona una opción \n" +
							   "1.- Hacer una compra  \n" + 
							   "2.- Mostrar análisis  \n" + 
							   "0.- Salir");
			try {
				intOpcion = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {}
		}while(intOpcion ==null || intOpcion<0 || intOpcion>2);
		
		return intOpcion;
	}

}
