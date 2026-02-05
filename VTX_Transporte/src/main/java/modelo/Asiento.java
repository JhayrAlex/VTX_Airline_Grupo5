package modelo;
public class Asiento {
    
    private int numero;
    private String tipo;
    private boolean ocupado;

    public Asiento(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupado = false;
    }

    public int getNumero() { 
        return numero; 
    }
    public String getTipo() { 
        return tipo; 
    }
    public boolean isOcupado() { 
        return ocupado; 
    }

    public void ocupar() {
        this.ocupado = true;
    }
      
}
