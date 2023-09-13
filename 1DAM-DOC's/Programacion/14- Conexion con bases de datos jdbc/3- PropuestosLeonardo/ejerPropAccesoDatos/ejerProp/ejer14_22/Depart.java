package ejerProp.ejer14_22;

public class Depart {
    private int intDeptNo;
    private String strLoc;

    public Depart(int intDeptNo, String strLoc) {
        this.intDeptNo = intDeptNo;
        this.strLoc = strLoc;
    }

    public int getIntDeptNo() {
        return intDeptNo;
    }

    @Override
    public String toString() {
        return "Depart { " +
                "Numero de departamento = " + intDeptNo +
                ", Localidad = '" + strLoc + '\'' +
                "}\n";
    }
}
