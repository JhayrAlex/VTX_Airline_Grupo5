package modelo;

public class Avion {
    
    private String codigo;
    private String modelo;
    private int capacidadEconomy;
    private int capacidadPremium;

    public Avion(String codigo, String modelo, int capacidadEconomy, int capacidadPremium) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.capacidadEconomy = capacidadEconomy;
        this.capacidadPremium = capacidadPremium;
    }

    public String getCodigo() { 
        return codigo;
    }
    public String getModelo() {
        return modelo; 
    }
    public int getCapacidadEconomy() { 
        return capacidadEconomy; 
    }
    public int getCapacidadPremium() { 
        return capacidadPremium; 
    }
    
    
}
