package dao;


import modelo.Ruta;
import util.Constantes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class RutaDAO {
    
    private List<Ruta> rutas = new ArrayList<>();

    public RutaDAO() {
        cargarRutas();
    }

    private void cargarRutas() {
        try (BufferedReader br = new BufferedReader(new FileReader("data/rutas.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                String codigo = partes[0];
                String origen = partes[1];
                String destino = partes[2];
                int duracion = Integer.parseInt(partes[3]);

                // VALIDACIÓN REAL
                if (Constantes.PAISES_VALIDOS.contains(origen.toUpperCase())
                        && Constantes.PAISES_VALIDOS.contains(destino.toUpperCase())
                        && !origen.equalsIgnoreCase(destino)) {

                    Ruta ruta = new Ruta(codigo, origen, destino, duracion);
                    rutas.add(ruta);
                }
            }

        } catch (Exception e) {
            System.out.println("Error al cargar rutas: " + e.getMessage());
        }
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

}
