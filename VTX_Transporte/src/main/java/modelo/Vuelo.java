package modelo;

public class Vuelo {
    
    private String codigo;
    private Ruta ruta;
    private Avion avion;
    private String fecha;
    private double precioEconomy;
    private double precioPremium;
    private String tipoVuelo;

    public Vuelo(String codigo, Ruta ruta, Avion avion, String fecha,
                 double precioEconomy, double precioPremium) {
        this.codigo = codigo;
        this.ruta = ruta;
        this.avion = avion;
        this.fecha = fecha;
        this.precioEconomy = precioEconomy;
        this.precioPremium = precioPremium;
    }

    public String getCodigo() { 
        return codigo; 
    }
    public Ruta getRuta() { 
        return ruta; 
    }
    public Avion getAvion() { 
        return avion; 
    }
    public String getFecha() { 
        return fecha; 
    }
    public double getPrecioEconomy() { 
        return precioEconomy; 
    }
    public double getPrecioPremium() { 
        return precioPremium; 
    }
    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
        
}
