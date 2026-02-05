package modelo;

public class Ruta {
    
    private String codigo;
    private String origen;
    private String destino;
    private int duracionMinutos;

    public Ruta(String codigo, String origen, String destino, int duracionMinutos) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.duracionMinutos = duracionMinutos;
    }

    public String getCodigo() { 
        return codigo; 
    }
    public String getOrigen() { 
        return origen; 
    }
    public String getDestino() { 
        return destino; 
    }
    public int getDuracionMinutos() { 
        return duracionMinutos; 
    }
    
    
}
