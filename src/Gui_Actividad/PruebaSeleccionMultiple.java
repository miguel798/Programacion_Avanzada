package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaSeleccionMultiple{
    public static void main( String args[] ){
        SeleccionMultiple marcoSeleccionMultiple =new SeleccionMultiple(); 
        marcoSeleccionMultiple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        marcoSeleccionMultiple.setSize( 350, 140 ); // establece el tamaño del marco
        marcoSeleccionMultiple.setVisible( true ); // muestra el marco
       } // ﬁn de main
} // ﬁn de la clase PruebaSeleccionMultiple
