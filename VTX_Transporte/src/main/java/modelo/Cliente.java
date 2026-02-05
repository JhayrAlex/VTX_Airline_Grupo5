package modelo;

public class Cliente {
    
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;

    public Cliente(String cedula, String nombres, String apellidos, String correo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public String getCedula() { 
        return cedula; 
    }
    public String getNombres() { 
        return nombres; 
    }
    public String getApellidos() { 
        return apellidos; 
    }
    public String getCorreo() { 
        return correo; 
    }
    
}
