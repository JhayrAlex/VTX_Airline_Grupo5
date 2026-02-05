package controlador;

import dao.RutaDAO;
import modelo.Ruta;
import java.util.List;

public class ReservaController {
    
    private RutaDAO rutaDAO;

    public ReservaController() {
        rutaDAO = new RutaDAO();
    }

    public List<Ruta> obtenerRutas() {
        return rutaDAO.getRutas();
    }
    
}
