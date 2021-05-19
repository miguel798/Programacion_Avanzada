package Gui_Actividad;

import javax.swing.JFrame;
 
 public class PruebaCuadroCombinado
 {
     public static void main( String args[] ){
        CuadroCombinado marcoCuadroCombinado = new CuadroCombinado(); 
        marcoCuadroCombinado.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoCuadroCombinado.setSize( 350, 150 ); // establece el tamaño del marco
        marcoCuadroCombinado.setVisible( true ); // muestra el marco
    } 
 } 
