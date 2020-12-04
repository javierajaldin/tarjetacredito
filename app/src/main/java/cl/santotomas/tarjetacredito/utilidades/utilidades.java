package cl.santotomas.tarjetacredito.utilidades;

public class utilidades {

    public static final String TABLA_PERSONA="persona";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_NUMEROTARJETA="numerodetarjeta";
    public static final String CAMPO_MESTARJETA="mestarjeta";
    public static final String CAMPO_ANOTARJETA="anotarjeta";
    public static final String CAMPO_CODIGOTARJETA="codigodetarjeta";
    public static final String CAMPO_DIRECCION="direccion";
    public static final String CAMPO_CIUDAD="ciudad";
    public static final String CAMPO_ESTADO="estado";
    public final static String CAMPO_CODIGOPOSTAL="codigopostal";


   public static final String CREAR_TABLA_PERSONA= "CREATE TABLE " +TABLA_PERSONA+" ("+CAMPO_ID+" INTEGER, "+CAMPO_NOMBRE+" TEXT, "+CAMPO_APELLIDO+" TEXT, "+CAMPO_NUMEROTARJETA+" TEXT, "+CAMPO_MESTARJETA+" TEXT, "+CAMPO_ANOTARJETA+" TEXT, "+CAMPO_CODIGOTARJETA+" TEXT, "+CAMPO_DIRECCION+" TEXT, "+CAMPO_CIUDAD+" TEXT, "+CAMPO_ESTADO+" TEXT, "+CAMPO_CODIGOPOSTAL+" TEXT)";

}
