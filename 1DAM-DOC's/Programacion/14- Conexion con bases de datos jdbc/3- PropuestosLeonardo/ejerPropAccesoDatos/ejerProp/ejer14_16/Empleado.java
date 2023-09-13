package ejerProp.ejer14_16;

import java.time.LocalDate;
import java.util.Date;

public class Empleado {
    private int intEmpNo;
    private String strApellido;
    private String strOficio;
    private int intDir;
    private Date fAlta;
    private int intSalario;
    private int intComision;
    private int intDeptNo;


    public Empleado(int intEmpNo, String strApellido, String strOficio, int intDir, int intSalario, int intComision, int intDeptNo) {
        this.intEmpNo = intEmpNo;
        this.strApellido = strApellido;
        this.strOficio = strOficio;
        this.intDir = intDir;
        this.intSalario = intSalario;
        this.intComision = intComision;
        this.intDeptNo = intDeptNo;
    }

    public int getIntEmpNo() {
        return intEmpNo;
    }

    public String getStrApellido() {
        return strApellido;
    }

    public String getStrOficio() {
        return strOficio;
    }

    public int getIntDir() {
        return intDir;
    }

    public int getIntSalario() {
        return intSalario;
    }

    public int getIntComision() {
        return intComision;
    }

    public int getIntDeptNo() {
        return intDeptNo;
    }

}
