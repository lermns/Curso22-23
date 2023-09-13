package ficherosDeTexto.ejerProps.ejer10_19;

public enum MapaChar{
    A("e"), B("m"), C("s"), D("r"), E("c"), F("y"), G("j"), H("n"), I("f"), J("x"),
    K("i"), L("w"), M("t"), N("a"), O("k"), P("o"), Q("z"), R("d"), S("l"), T("q"),
    U("v"), V("b"), W("h"), X("u"), Y("p"), Z("g");
    
    private final String sustituto;
    
    MapaChar(String sustituto) {
        this.sustituto = sustituto;
    }
    
    public String getSustituto() {
        return sustituto;
    }
}