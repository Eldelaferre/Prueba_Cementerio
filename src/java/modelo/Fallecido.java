package modelo;

public class Fallecido {
    
    private Integer Codigo_digitado;
    private Integer Codigo_fallecido;
    private Integer Codigo_Tumba;
    private String Fecha_Ingreso_Fallecido;
    private String Nombre_Fallecido;
    private String Fecha_Nacimiento;
    private String Fecha_Muerte;
    private String Hora_Muerte;
    private String Responsable_Fallecido;
    private String Email_Responsable;
    private Integer Telefono_Responsable;
    private String Ubicacion;
    private Integer Codigo_Estado_Fallecido;

    public Fallecido(Integer Codigo_fallecido, Integer Codigo_Tumba, String Fecha_Ingreso_Fallecido, String Nombre_Fallecido, String Fecha_Nacimiento, String Fecha_Muerte, String Hora_Muerte, String Responsable_Fallecido, String Email_Responsable, Integer Telefono_Responsable, Integer Codigo_Estado_Fallecido) {
        this.Codigo_fallecido = Codigo_fallecido;
        this.Codigo_Tumba = Codigo_Tumba;
        this.Fecha_Ingreso_Fallecido = Fecha_Ingreso_Fallecido;
        this.Nombre_Fallecido = Nombre_Fallecido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Fecha_Muerte = Fecha_Muerte;
        this.Hora_Muerte = Hora_Muerte;
        this.Responsable_Fallecido = Responsable_Fallecido;
        this.Email_Responsable = Email_Responsable;
        this.Telefono_Responsable = Telefono_Responsable;
        this.Codigo_Estado_Fallecido = Codigo_Estado_Fallecido;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    

    public Fallecido(Integer Codigo_fallecido, Integer Codigo_Tumba, String Fecha_Ingreso_Fallecido, String Nombre_Fallecido, String Fecha_Nacimiento, String Fecha_Muerte, String Hora_Muerte, String Responsable_Fallecido, String Email_Responsable, Integer Telefono_Responsable, String Ubicacion, Integer Codigo_Estado_Fallecido) {
        this.Codigo_fallecido = Codigo_fallecido;
        this.Codigo_Tumba = Codigo_Tumba;
        this.Fecha_Ingreso_Fallecido = Fecha_Ingreso_Fallecido;
        this.Nombre_Fallecido = Nombre_Fallecido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Fecha_Muerte = Fecha_Muerte;
        this.Hora_Muerte = Hora_Muerte;
        this.Responsable_Fallecido = Responsable_Fallecido;
        this.Email_Responsable = Email_Responsable;
        this.Telefono_Responsable = Telefono_Responsable;
        this.Ubicacion = Ubicacion;
        this.Codigo_Estado_Fallecido = Codigo_Estado_Fallecido;
    }
    
    

    public Fallecido(Integer Codigo_digitado) {
        this.Codigo_digitado = Codigo_digitado;
    }

    public Integer getCodigo_digitado() {
        return Codigo_digitado;
    }

    public void setCodigo_digitado(Integer Codigo_digitado) {
        this.Codigo_digitado = Codigo_digitado;
    }

    
    

    public Integer getCodigo_fallecido() {
        return Codigo_fallecido;
    }

    public void setCodigo_fallecido(Integer Codigo_fallecido) {
        this.Codigo_fallecido = Codigo_fallecido;
    }

    public Integer getCodigo_Tumba() {
        return Codigo_Tumba;
    }

    public void setCodigo_Tumba(Integer Codigo_Tumba) {
        this.Codigo_Tumba = Codigo_Tumba;
    }

    public String getFecha_Ingreso_Fallecido() {
        return Fecha_Ingreso_Fallecido;
    }

    public void setFecha_Ingreso_Fallecido(String Fecha_Ingreso_Fallecido) {
        this.Fecha_Ingreso_Fallecido = Fecha_Ingreso_Fallecido;
    }

    public String getNombre_Fallecido() {
        return Nombre_Fallecido;
    }

    public void setNombre_Fallecido(String Nombre_Fallecido) {
        this.Nombre_Fallecido = Nombre_Fallecido;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getFecha_Muerte() {
        return Fecha_Muerte;
    }

    public void setFecha_Muerte(String Fecha_Muerte) {
        this.Fecha_Muerte = Fecha_Muerte;
    }

    public String getHora_Muerte() {
        return Hora_Muerte;
    }

    public void setHora_Muerte(String Hora_Muerte) {
        this.Hora_Muerte = Hora_Muerte;
    }

    public String getResponsable_Fallecido() {
        return Responsable_Fallecido;
    }

    public void setResponsable_Fallecido(String Responsable_Fallecido) {
        this.Responsable_Fallecido = Responsable_Fallecido;
    }

    public String getEmail_Responsable() {
        return Email_Responsable;
    }

    public void setEmail_Responsable(String Email_Responsable) {
        this.Email_Responsable = Email_Responsable;
    }

    public Integer getTelefono_Responsable() {
        return Telefono_Responsable;
    }

    public void setTelefono_Responsable(Integer Telefono_Responsable) {
        this.Telefono_Responsable = Telefono_Responsable;
    }

    public Integer getCodigo_Estado_Fallecido() {
        return Codigo_Estado_Fallecido;
    }

    public void setCodigo_Estado_Fallecido(Integer Codigo_Estado_Fallecido) {
        this.Codigo_Estado_Fallecido = Codigo_Estado_Fallecido;
    }

}
