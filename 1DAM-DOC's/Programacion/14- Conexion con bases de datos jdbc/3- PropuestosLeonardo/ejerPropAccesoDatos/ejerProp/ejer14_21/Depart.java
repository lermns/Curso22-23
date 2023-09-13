package ejerProp.ejer14_21;

public class Depart {
    private int intDeptNo;
    private String strDnombre;
    private String strLoc;

    public Depart(int intDeptNo, String strDnombre, String strLoc) {
        this.intDeptNo = intDeptNo;
        this.strDnombre = strDnombre;
        this.strLoc = strLoc;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "Numero de departamento = " + intDeptNo +
                ", Nombre = '" + strDnombre + '\'' +
                ", Localidad = '" + strLoc + '\'' +
                "}\n";
    }
}
