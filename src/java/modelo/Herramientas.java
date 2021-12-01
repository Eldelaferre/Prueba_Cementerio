
package modelo;


public class Herramientas {
    private Integer Codigo_Herramienta;
    private Integer Id_Empleado;
    private String Nombre_Herramienta;
    private String Marca_Herramienta;
    private Double Precio_Herramienta;
    private Integer Existencias_Herramienta;
    private String Proveedor_Herramienta;

    public Herramientas(Integer Codigo_Herramienta, Integer Id_Empleado, String Nombre_Herramienta, String Marca_Herramienta, Double Precio_Herramienta, Integer Existencias_Herramienta, String Proveedor_Herramienta) {
        this.Codigo_Herramienta = Codigo_Herramienta;
        this.Id_Empleado = Id_Empleado;
        this.Nombre_Herramienta = Nombre_Herramienta;
        this.Marca_Herramienta = Marca_Herramienta;
        this.Precio_Herramienta = Precio_Herramienta;
        this.Existencias_Herramienta = Existencias_Herramienta;
        this.Proveedor_Herramienta = Proveedor_Herramienta;
    }

    public Integer getCodigo_Herramienta() {
        return Codigo_Herramienta;
    }

    public void setCodigo_Herramienta(Integer Codigo_Herramienta) {
        this.Codigo_Herramienta = Codigo_Herramienta;
    }

    public Integer getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(Integer Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public String getNombre_Herramienta() {
        return Nombre_Herramienta;
    }

    public void setNombre_Herramienta(String Nombre_Herramienta) {
        this.Nombre_Herramienta = Nombre_Herramienta;
    }

    public String getMarca_Herramienta() {
        return Marca_Herramienta;
    }

    public void setMarca_Herramienta(String Marca_Herramienta) {
        this.Marca_Herramienta = Marca_Herramienta;
    }

    public Double getPrecio_Herramienta() {
        return Precio_Herramienta;
    }

    public void setPrecio_Herramienta(Double Precio_Herramienta) {
        this.Precio_Herramienta = Precio_Herramienta;
    }

    public Integer getExistencias_Herramienta() {
        return Existencias_Herramienta;
    }

    public void setExistencias_Herramienta(Integer Existencias_Herramienta) {
        this.Existencias_Herramienta = Existencias_Herramienta;
    }

    public String getProveedor_Herramienta() {
        return Proveedor_Herramienta;
    }

    public void setProveedor_Herramienta(String Proveedor_Herramienta) {
        this.Proveedor_Herramienta = Proveedor_Herramienta;
    }

    
    
}