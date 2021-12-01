package modelo;

public class Tumba {

    private Integer Codigo_Tumba;
    private String Ubicacion_Tumba;

    public Tumba(Integer Codigo_Tumba, String Ubicacion_Tumba) {
        this.Codigo_Tumba = Codigo_Tumba;
        this.Ubicacion_Tumba = Ubicacion_Tumba;
    }

    public Integer getCodigo_Tumba() {
        return Codigo_Tumba;
    }

    public void setCodigo_Tumba(Integer Codigo_Tumba) {
        this.Codigo_Tumba = Codigo_Tumba;
    }

    public String getUbicacion_Tumba() {
        return Ubicacion_Tumba;
    }

    public void setUbicacion_Tumba(String Ubicacion_Tumba) {
        this.Ubicacion_Tumba = Ubicacion_Tumba;
    }
    
    
    
}
