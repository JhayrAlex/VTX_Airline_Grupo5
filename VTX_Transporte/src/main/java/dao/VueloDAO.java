package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Vuelo;

public class VueloDAO {
    private List<Vuelo> vuelos;

    public VueloDAO() {
        vuelos = new ArrayList<>();
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }
}
