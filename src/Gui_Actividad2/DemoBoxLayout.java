// Demostración de BoxLayout.
package Gui_Actividad2;

import javax.swing.JFrame;

public class DemoBoxLayout {
    public static void main( String args[] ){ 
        MarcoBoxLayout marcoBoxLayout = new MarcoBoxLayout(); 
        marcoBoxLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBoxLayout.setSize( 400, 220 ); // establece el tamaño del marco
        marcoBoxLayout.setVisible( true ); // muestra el marco
    } // ﬁn de main
 } // ﬁn de la clase DemoBoxLayout
