package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaPanel extends JFrame {
 public static void main( String args[] ) {
     Panel marcoPanel = new Panel(); 
     marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
     marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
     marcoPanel.setVisible( true ); // muestra el marco
 } // ﬁn de main
} // ﬁn de la clase DemoPanel
