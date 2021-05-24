package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaDetallesRaton {
    public static void main( String args[] ) {
        DetallesRaton marcoDetallesRaton = new DetallesRaton(); 
        marcoDetallesRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoDetallesRaton.setSize( 400, 150 ); // establece el tamaño del marco
        marcoDetallesRaton.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase DetallesRaton
