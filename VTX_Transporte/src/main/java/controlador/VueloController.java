package controlador;

import dao.VueloDAO;
import modelo.Vuelo;
import java.util.List;
import java.util.stream.Collectors;


public class VueloController {
    private VueloDAO vueloDAO;

    public VueloController() {
        this.vueloDAO = new VueloDAO();
    }

    public List<Vuelo> buscarVuelos(String origen, String destino) {
        return vueloDAO.getVuelos().stream() 
                .filter(v -> v.getRuta().getOrigen().equalsIgnoreCase(origen) && 
                             v.getRuta().getDestino().equalsIgnoreCase(destino))
                .collect(Collectors.toList());
    }
    
    public void registrarAsiento(String asiento, boolean esIda) {
    if (esIda) {
        modelo.DatosVuelo.asientoIda = asiento;
    } else {
        modelo.DatosVuelo.asientoVuelta = asiento;
    }
}
    
}
