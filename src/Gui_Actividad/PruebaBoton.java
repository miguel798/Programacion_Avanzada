package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaBoton {
    public static void main(String args[]){
        Boton marcoBoton = new Boton(); 
        marcoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBoton.setSize(300, 100);
        marcoBoton.setVisible(true);
    }
}
