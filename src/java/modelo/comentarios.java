
package modelo;


public class comentarios {
    
    private Integer Cod_Comentario;
    private Integer Id_Usuario;
    private String Fecha_Comentario;
    private String Comentario;

    public comentarios(Integer Cod_Comentario, Integer Id_Usuario, String Fecha_Comentario, String Comentario) {
        this.Cod_Comentario = Cod_Comentario;
        this.Id_Usuario = Id_Usuario;
        this.Fecha_Comentario = Fecha_Comentario;
        this.Comentario = Comentario;
    }

    public Integer getCod_Comentario() {
        return Cod_Comentario;
    }

    public void setCod_Comentario(Integer Cod_Comentario) {
        this.Cod_Comentario = Cod_Comentario;
    }

    public Integer getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(Integer Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getFecha_Comentario() {
        return Fecha_Comentario;
    }

    public void setFecha_Comentario(String Fecha_Comentario) {
        this.Fecha_Comentario = Fecha_Comentario;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }
    
    
    
}
