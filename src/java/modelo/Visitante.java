package modelo;

public class Visitante {

    private Integer Id_Usuario;
    private String Nombre_Visitante;
    private String Direccion_Visitante;
    private String Telefono_Visitante;
    private String Email_Visitante;

    public Visitante(Integer Id_Usuario, String Nombre_Visitante, String Direccion_Visitante, String Telefono_Visitante, String Email_Visitante) {
        this.Id_Usuario = Id_Usuario;
        this.Nombre_Visitante = Nombre_Visitante;
        this.Direccion_Visitante = Direccion_Visitante;
        this.Telefono_Visitante = Telefono_Visitante;
        this.Email_Visitante = Email_Visitante;
    }

    public Visitante(Integer Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public Visitante() {
    }
    

    public Integer getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(Integer Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getNombre_Visitante() {
        return Nombre_Visitante;
    }

    public void setNombre_Visitante(String Nombre_Visitante) {
        this.Nombre_Visitante = Nombre_Visitante;
    }

    public String getDireccion_Visitante() {
        return Direccion_Visitante;
    }

    public void setDireccion_Visitante(String Direccion_Visitante) {
        this.Direccion_Visitante = Direccion_Visitante;
    }

    public String getTelefono_Visitante() {
        return Telefono_Visitante;
    }

    public void setTelefono_Visitante(String Telefono_Visitante) {
        this.Telefono_Visitante = Telefono_Visitante;
    }

    public String getEmail_Visitante() {
        return Email_Visitante;
    }

    public void setEmail_Visitante(String Email_Visitante) {
        this.Email_Visitante = Email_Visitante;
    }

}
