package cl.santotomas.tarjetacredito.ENTIDADES;

public class Persona {

    private Integer id;
    private String nombre;
    private String apellido;
    private String numerotarjeta;
    private String mestarjeta;
    private String anhotarjeta;
    private String codigotarjeta;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigopostal;

    public Persona(Integer id, String nombre, String apellido, String numerotarjeta, String mestarjeta, String anhotarjeta, String codigotarjeta, String direccion, String ciudad, String estado, String codigopostal) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numerotarjeta = numerotarjeta;
        this.mestarjeta = mestarjeta;
        this.anhotarjeta = anhotarjeta;
        this.codigotarjeta = codigotarjeta;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigopostal = codigopostal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public String getMestarjeta() {
        return mestarjeta;
    }

    public void setMestarjeta(String mestarjeta) {
        this.mestarjeta = mestarjeta;
    }

    public String getAnhotarjeta() {
        return anhotarjeta;
    }

    public void setAnhotarjeta(String anhotarjeta) {
        this.anhotarjeta = anhotarjeta;
    }

    public String getCodigotarjeta() {
        return codigotarjeta;
    }

    public void setCodigotarjeta(String codigotarjeta) {
        this.codigotarjeta = codigotarjeta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }
}
