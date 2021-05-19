package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaCampoTexto {
    public static void main( String args[]){
        CampoTexto campoTextoMarco = new CampoTexto();
        campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        campoTextoMarco.setSize(350, 100);
        campoTextoMarco.setVisible(true);
    }   
}
