// Demostración de JTabbedPane.
package Gui_Actividad2;

import javax.swing.JFrame;

public class DemoJTabbedPane{
    public static void main( String args[] ){
        MarcoJTabbedPane marcoPanelFichas = new MarcoJTabbedPane();
        marcoPanelFichas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoPanelFichas.setSize( 250, 200 ); // establece el tamaño del marco
        marcoPanelFichas.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase DemoJTabbedPane
