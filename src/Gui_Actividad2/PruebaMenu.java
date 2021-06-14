// Prueba de MarcoMenu.
package Gui_Actividad2;

import javax.swing.JFrame;

public class PruebaMenu{
    public static void main( String args[] ){
        MarcoMenu marcoMenu = new MarcoMenu(); // crea objeto MarcoMenu 
        marcoMenu.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoMenu.setSize( 600, 200 ); // establece el tamaño del marco
        marcoMenu.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase PruebaMenu
