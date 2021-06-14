// Prueba de MarcoContextual.
package Gui_Actividad2;

import javax.swing.JFrame;

public class PruebaContextual2{
    public static void main( String args[] ){
        MarcoAparienciaVisual marcoContextual = new MarcoAparienciaVisual(); // crea MarcoContextual
        marcoContextual.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoContextual.setSize( 300, 200 ); // establece el tamaño del marco
        marcoContextual.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase PruebaContextual
