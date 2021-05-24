package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaRastreadorRaton {
    public static void main( String args[] ) {
        RastreadorRaton marcoRastreadorRaton = new RastreadorRaton(); 
        marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoRastreadorRaton.setSize( 300, 100 ); // establece el tamaño del marco
        marcoRastreadorRaton.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase RastreadorRaton
