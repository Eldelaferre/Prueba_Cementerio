
package modelo;

public class PQRS {
    
    private Integer Cod_Pqr;
    private Integer Id_Usuario;
    private String Fecha_Pqr;
    private String PQR;

    public PQRS(Integer Cod_Pqr, Integer Id_Usuario, String Fecha_Pqr, String PQR) {
        this.Cod_Pqr = Cod_Pqr;
        this.Id_Usuario = Id_Usuario;
        this.Fecha_Pqr = Fecha_Pqr;
        this.PQR = PQR;
    }

    public PQRS() {
    }

    public PQRS(Integer Id_Usuario, String Fecha_Pqr, String PQR) {
        this.Id_Usuario = Id_Usuario;
        this.Fecha_Pqr = Fecha_Pqr;
        this.PQR = PQR;
    }
    
    

    public Integer getCod_Pqr() {
        return Cod_Pqr;
    }

    public void setCod_Pqr(Integer Cod_Pqr) {
        this.Cod_Pqr = Cod_Pqr;
    }

    public Integer getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(Integer Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getFecha_Pqr() {
        return Fecha_Pqr;
    }

    public void setFecha_Pqr(String Fecha_Pqr) {
        this.Fecha_Pqr = Fecha_Pqr;
    }

    public String getPQR() {
        return PQR;
    }

    public void setPQR(String PQR) {
        this.PQR = PQR;
    }
    
    
    
}
