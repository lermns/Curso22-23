package tema14.ejerciciosPropuestos.ejercicioPropuesto14_18;

import java.time.LocalDate;

public class Empleado {
	private int intEMP_NO;	
	private String strAPELLIDO;	
	private String strOFICIO;
	private int intDIR;
	private LocalDate FECHA_ALT;	
	private int intSALARIO;
	private int intCOMISION;	
	private int intDEPT_NO;
	public Empleado(int intEMP_NO, String strAPELLIDO, String strOFICIO, int intDIR, String strFECHA_ALT, int intSALARIO,
			int intCOMISION, int intDEPT_NO) {
		super();
		this.intEMP_NO = intEMP_NO%10000;
		this.strAPELLIDO = strAPELLIDO.substring(0, Math.min(strAPELLIDO.length(),10));
		this.strOFICIO = strOFICIO.substring(0, Math.min(strOFICIO.length(),10));
		this.intDIR = intDIR%10000;
		FECHA_ALT = LocalDate.parse(strFECHA_ALT);
		this.intSALARIO = intSALARIO%10000000;
		this.intCOMISION = intCOMISION%10000000;
		this.intDEPT_NO = intDEPT_NO%100;
	}
	public int getIntEMP_NO() {
		return intEMP_NO;
	}
	public String getStrAPELLIDO() {
		return strAPELLIDO;
	}
	public String getStrOFICIO() {
		return strOFICIO;
	}
	public int getIntDIR() {
		return intDIR;
	}
	public LocalDate getFECHA_ALT() {
		return FECHA_ALT;
	}
	public int getIntSALARIO() {
		return intSALARIO;
	}
	public int getIntCOMISION() {
		return intCOMISION;
	}
	public int getIntDEPT_NO() {
		return intDEPT_NO;
	}	
	
	
}
