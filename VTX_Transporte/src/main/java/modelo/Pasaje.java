package modelo;

public class Pasaje {
    
    private String numero;
    private Reserva reserva;
    private double precioFinal;

    public Pasaje(String numero, Reserva reserva, double precioFinal) {
        this.numero = numero;
        this.reserva = reserva;
        this.precioFinal = precioFinal;
    }

    public String getNumero() { 
        return numero; 
    }
    public Reserva getReserva() { 
        return reserva; 
    }
    public double getPrecioFinal() { 
        return precioFinal; 
    }
    
}
