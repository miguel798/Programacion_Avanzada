package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaBorderLayout {
    public static void main( String args[] ) {
        BorderLayout1 marcoBorderLayout = new BorderLayout1(); 
        marcoBorderLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBorderLayout.setSize( 375, 200 ); // establece el tamaño del marco
        marcoBorderLayout.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase PruebaBorderLayout
