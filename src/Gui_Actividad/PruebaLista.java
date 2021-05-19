package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaLista {
    public static void main( String args[] ) {
        Lista marcoLista = new Lista(); // crea objeto MarcoLista
        marcoLista.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoLista.setSize( 350, 150 ); // establece el tamaño del marco
        marcoLista.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase PruebaLista
