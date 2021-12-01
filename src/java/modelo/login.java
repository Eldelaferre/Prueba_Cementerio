
package modelo;

public class login {
    
    private Integer Id_Usuario_log;
    private String  Rol_Usu_log;
    private String User_Usu_log;
    private String Clave_Usu_log;

    public login(Integer Id_Usuario_log, String Rol_Usu_log, String User_Usu_log, String Clave_Usu_log) {
        this.Id_Usuario_log = Id_Usuario_log;
        this.Rol_Usu_log = Rol_Usu_log;
        this.User_Usu_log = User_Usu_log;
        this.Clave_Usu_log = Clave_Usu_log;
    }

    public login() {
    }

    public login(String User_Usu_log, String Clave_Usu_log) {
        this.User_Usu_log = User_Usu_log;
        this.Clave_Usu_log = Clave_Usu_log;
    }
    
    public Integer getId_Usuario_log() {
        return Id_Usuario_log;
    }

    public void setId_Usuario_log(Integer Id_Usuario_log) {
        this.Id_Usuario_log = Id_Usuario_log;
    }

    public String getRol_Usu_log() {
        return Rol_Usu_log;
    }

    public void setRol_Usu_log(String Rol_Usu_log) {
        this.Rol_Usu_log = Rol_Usu_log;
    }

    public String getUser_Usu_log() {
        return User_Usu_log;
    }

    public void setUser_Usu_log(String User_Usu_log) {
        this.User_Usu_log = User_Usu_log;
    }

    public String getClave_Usu_log() {
        return Clave_Usu_log;
    }

    public void setClave_Usu_log(String Clave_Usu_log) {
        this.Clave_Usu_log = Clave_Usu_log;
    }

    
    
}
