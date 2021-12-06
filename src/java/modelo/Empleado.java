
package modelo;

public class Empleado {
    
    private Integer Id_Empleado;
    private String Tipo_Empleado;
    private Integer Cedula_Empleado;
    private String Nombre_Empleado;
    private String Direccion_Empleado;
    private String Telefono_Empleado;
    private String Email_Empleado;
    private String Imagen_Empleado;

    public Empleado(Integer Id_Empleado, String Tipo_Empleado, Integer Cedula_Empleado, String Nombre_Empleado, String Direccion_Empleado, String Telefono_Empleado, String Email_Empleado, String Imagen_Empleado) {
        this.Id_Empleado = Id_Empleado;
        this.Tipo_Empleado = Tipo_Empleado;
        this.Cedula_Empleado = Cedula_Empleado;
        this.Nombre_Empleado = Nombre_Empleado;
        this.Direccion_Empleado = Direccion_Empleado;
        this.Telefono_Empleado = Telefono_Empleado;
        this.Email_Empleado = Email_Empleado;
        this.Imagen_Empleado = Imagen_Empleado;
    }

    public Empleado(Integer Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public Empleado() {
    }

    public Integer getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(Integer Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public String getTipo_Empleado() {
        return Tipo_Empleado;
    }

    public void setTipo_Empleado(String Tipo_Empleado) {
        this.Tipo_Empleado = Tipo_Empleado;
    }

    public Integer getCedula_Empleado() {
        return Cedula_Empleado;
    }

    public void setCedula_Empleado(Integer Cedula_Empleado) {
        this.Cedula_Empleado = Cedula_Empleado;
    }

    public String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public void setNombre_Empleado(String Nombre_Empleado) {
        this.Nombre_Empleado = Nombre_Empleado;
    }

    public String getDireccion_Empleado() {
        return Direccion_Empleado;
    }

    public void setDireccion_Empleado(String Direccion_Empleado) {
        this.Direccion_Empleado = Direccion_Empleado;
    }

    public String getTelefono_Empleado() {
        return Telefono_Empleado;
    }

    public void setTelefono_Empleado(String Telefono_Empleado) {
        this.Telefono_Empleado = Telefono_Empleado;
    }

    public String getEmail_Empleado() {
        return Email_Empleado;
    }

    public void setEmail_Empleado(String Email_Empleado) {
        this.Email_Empleado = Email_Empleado;
    }

    public String getImagen_Empleado() {
        return Imagen_Empleado;
    }

    public void setImagen_Empleado(String Imagen_Empleado) {
        this.Imagen_Empleado = Imagen_Empleado;
    }

    
}
