package modelo;

public class Visitante {

    private Integer Id_Usuario;
    private String Nombre_Visitante;
    private String Direccion_Visitante;
    private String Telefono_Visitante;
    private String Email_Visitante;
    private Integer Id_Usuario_Busqueda;
    private Integer Id_Usuario_vis;
    private String rol;
    private String user;
    private String clave;

    public Visitante(Integer Id_Usuario_Busqueda) {
        this.Id_Usuario_Busqueda = Id_Usuario_Busqueda;
    }

    public Integer getId_Usuario_vis() {
        return Id_Usuario_vis;
    }

    public void setId_Usuario_vis(Integer Id_Usuario_vis) {
        this.Id_Usuario_vis = Id_Usuario_vis;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    

    public Visitante(Integer Id_Usuario, String Nombre_Visitante, String Direccion_Visitante, String Telefono_Visitante, String Email_Visitante, Integer Id_Usuario_vis, String rol, String user, String clave) {
        this.Id_Usuario = Id_Usuario;
        this.Nombre_Visitante = Nombre_Visitante;
        this.Direccion_Visitante = Direccion_Visitante;
        this.Telefono_Visitante = Telefono_Visitante;
        this.Email_Visitante = Email_Visitante;
        this.Id_Usuario_vis = Id_Usuario_vis;
        this.rol = rol;
        this.user = user;
        this.clave = clave;
    }
    
    

    public Integer getId_Usuario_Busqueda() {
        return Id_Usuario_Busqueda;
    }

    public void setId_Usuario_Busqueda(Integer Id_Usuario_Busqueda) {
        this.Id_Usuario_Busqueda = Id_Usuario_Busqueda;
    }
    
    public Visitante(Integer Id_Usuario, String Nombre_Visitante, String Direccion_Visitante, String Telefono_Visitante, String Email_Visitante) {
        this.Id_Usuario = Id_Usuario;
        this.Nombre_Visitante = Nombre_Visitante;
        this.Direccion_Visitante = Direccion_Visitante;
        this.Telefono_Visitante = Telefono_Visitante;
        this.Email_Visitante = Email_Visitante;
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
