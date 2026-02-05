package util;

import java.util.ArrayList;
import java.util.List;

public class DatosReserva {

    // [persona, asiento, hora, precio]
    public static List<Object[]> vuelosIda = new ArrayList<>();
    public static List<Object[]> vuelosRegreso = new ArrayList<>();

    public static double total = 0;

    public static void limpiar() {
        vuelosIda.clear();
        vuelosRegreso.clear();
        total = 0;
    }
}

