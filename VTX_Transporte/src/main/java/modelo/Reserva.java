package modelo;

public class Reserva {
    
    private String codigo;
    private Cliente cliente;
    private Vuelo vuelo;
    private String tipoAsiento;
    
    // Datos de la Ida
    public static String horaIda = "";
    public static String asientoIda = "";
    public static String claseIda = ""; // Premium o Economica

    // Datos de la Vuelta
    public static String horaVuelta = "";
    public static String asientoVuelta = "";
    public static String claseVuelta = "";
    
    public Reserva(String codigo, Cliente cliente, Vuelo vuelo, String tipoAsiento) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.tipoAsiento = tipoAsiento;
    }

    public String getCodigo() { 
        return codigo; 
    }
    public Cliente getCliente() { 
        return cliente; 
    }
    public Vuelo getVuelo() { 
        return vuelo; 
    }
    public String getTipoAsiento() { 
        return tipoAsiento; 
    }
    
}
