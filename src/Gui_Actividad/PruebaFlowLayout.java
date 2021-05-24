package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaFlowLayout {
    public static void main( String args[] ) {
        FlowLayout1 marcoFlowLayout = new FlowLayout1(); 
        marcoFlowLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoFlowLayout.setSize( 350, 75 ); // establece el tamaño del marco
        marcoFlowLayout.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase PruebaFlowLayout
