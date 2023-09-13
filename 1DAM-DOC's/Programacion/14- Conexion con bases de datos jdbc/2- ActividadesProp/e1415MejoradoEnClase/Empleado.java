package aaa.e1415;

import java.time.LocalDate;

public class Empleado {
	private int intEMP_NO;	
	private String strAPELLIDO;	
	private String strOficio;
	private int DIR;
	private LocalDate FECHA_ALT;	
	private int SALARIO;
	private int COMISION;	
	private int DEPT_NO;
	
	public Empleado(int intEMP_NO) {
		this.intEMP_NO = intEMP_NO;
	}
	public void setStrAPELLIDO(String strAPELLIDO) {
		this.strAPELLIDO = strAPELLIDO;
	}
	public void setOFICIO(String strOficio) {
		this.strOficio = strOficio.substring(0,Math.min(strOficio.length(), 10));
	}
	public void setDIR(int dIR) {
		DIR = dIR;
	}
	public void setFECHA_ALT(String fECHA_ALT) {
		this.FECHA_ALT = LocalDate.parse(fECHA_ALT);
	}
	public void setSALARIO(int sALARIO) {
		SALARIO = sALARIO;
	}
	public void setCOMISION(int cOMISION) {
		COMISION = cOMISION;
	}
	public void setDEPT_NO(int dEPT_NO) {
		DEPT_NO = dEPT_NO;
	}
	@Override
	public String toString() {
		return "Empleado [intEMP_NO=" + intEMP_NO + ", strAPELLIDO=" + strAPELLIDO + ", strOficio=" + strOficio
				+ ", DIR=" + DIR + ", FECHA_ALT=" + FECHA_ALT + ", SALARIO=" + SALARIO + ", COMISION=" + COMISION
				+ ", DEPT_NO=" + DEPT_NO + "]";
	}
		
	
}
