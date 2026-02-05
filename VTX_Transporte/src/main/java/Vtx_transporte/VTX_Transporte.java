package Vtx_transporte;

import vista.Form_Principal;

public class VTX_Transporte {
    public static void main(String[] args) {
        // Uso de Lambda para mayor claridad
        java.awt.EventQueue.invokeLater(() -> {
            new Form_Principal().setVisible(true);
        });
    }
}
