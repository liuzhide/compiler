public class OfpType {
    public static final OfpType intType = new OfpType("int");
    public static final OfpType intArrType = new OfpType("int[]");
    public static final OfpType floatType = new OfpType("float");
    public static final OfpType floatArrType = new OfpType("float[]");
    public static final OfpType charType = new OfpType("char");
    public static final OfpType charArrType = new OfpType("char[]");
    public static final OfpType stringType = new OfpType("string");
    public static final OfpType boolType = new OfpType("bool");
    // Eventually, we will need to generate bytecode for Java main() method
    public static final OfpType argsType = new OfpType("String[]");
    public static OfpType getTypeFor(String typeName) {
	if(typeName==null)
	    return null;
	if(typeName.equals("int")) return intType;
	else if(typeName.equals("int[]")) return intArrType;
	else if(typeName.equals("float")) return floatType;
	else if(typeName.equals("float[]")) return floatArrType;
	else if(typeName.equals("char")) return charType;
	else if(typeName.equals("char[]")) return charArrType;
	else if(typeName.equals("string")) return stringType;
	else if(typeName.equals("bool")) return boolType;
	else if(typeName.equals("String[]")) return argsType;
	else return null;
    }
    private final String name;
    private OfpType(String name) {this.name = name;}
    public String getName() { return name; }
    public static boolean equal(OfpType tp1,OfpType tp2) {
	if(tp1==null || tp2==null)
	    return false;
	else
	    return tp1.name.equals(tp2.name);

    }
    @Override public String toString() { return name; }

}
