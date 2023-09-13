package aaa.propuesto15;

public class Main {

	public static void main(String[] args) {
		
		SuperCola dudas = new SuperCola();
		
		dudas.push(1,1);
		dudas.push(1,2);
		dudas.push(2,3);
		dudas.push(2,4);
		
		System.out.println(dudas);
		
		System.out.println(dudas.pop(1));
		System.out.println(dudas);
		System.out.println(dudas.pop(2));
		System.out.println(dudas);
		System.out.println(dudas.pop(1));
		System.out.println(dudas);
		System.out.println(dudas.pop(1));
		System.out.println(dudas);
		System.out.println(dudas.pop(1));
		
		

	}

}
