// Demostración de MarcoBagLayout.
package Gui_Actividad2;

import javax.swing.JFrame;
public class DemoGridBag { 
    public static void main( String args[] ){ 
        MarcoGridBag marcoGridBag = new MarcoGridBag(); 
        marcoGridBag.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoGridBag.setSize( 300, 150 ); // establece el tamaño del marco
        marcoGridBag.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase DemoGridBag
