package modelo;

public class Estado {
    private Integer Codigo_Estado;
    private String Tipo_Estado;
    private String Descripcion_Estado;

    public Estado(Integer Codigo_Estado, String Tipo_Estado, String Descripcion_Estado) {
        this.Codigo_Estado = Codigo_Estado;
        this.Tipo_Estado = Tipo_Estado;
        this.Descripcion_Estado = Descripcion_Estado;
    }

    public Integer getCodigo_Estado() {
        return Codigo_Estado;
    }

    public void setCodigo_Estado(Integer Codigo_Estado) {
        this.Codigo_Estado = Codigo_Estado;
    }

    public String getTipo_Estado() {
        return Tipo_Estado;
    }

    public void setTipo_Estado(String Tipo_Estado) {
        this.Tipo_Estado = Tipo_Estado;
    }

    public String getDescripcion_Estado() {
        return Descripcion_Estado;
    }

    public void setDescripcion_Estado(String Descripcion_Estado) {
        this.Descripcion_Estado = Descripcion_Estado;
    }
    

    

    
}

