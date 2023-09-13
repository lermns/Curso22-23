package ejerProp.ejer14_19;

public class Empleado {
    private int intEmpNo;
    private String strApellido;
    private int intDeptNo;


    public Empleado(int intEmpNo, String strApellido, int intDeptNo) {
        this.intEmpNo = intEmpNo;
        this.strApellido = strApellido;
        this.intDeptNo = intDeptNo;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "intEmpNo=" + intEmpNo +
                ", strApellido='" + strApellido + '\'' +
                ", intDeptNo=" + intDeptNo +
                "}\n";
    }
}
