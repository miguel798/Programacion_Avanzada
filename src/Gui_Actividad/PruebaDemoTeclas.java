/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Actividad;

import javax.swing.JFrame;

public class PruebaDemoTeclas {
    public static void main( String args[] ) {
        DemoTeclas marcoDemoTeclas = new DemoTeclas(); 
        marcoDemoTeclas.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoDemoTeclas.setSize( 350, 100 ); // establece el tamaño del marco
        marcoDemoTeclas.setVisible( true ); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase DemoTeclas
