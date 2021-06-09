/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipaleta.Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author MIGUE
 */
public class Metiche3 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem)e.getSource();
        
        if (item.getText().equals("Editores")){
            System.out.println("Se oprimió el botón Editores");
        }
        if (item.getText().equals("Barras de Herramientas")){
            System.out.println("Se oprimió el botón Barras de Herramientas");
        }
        if (item.getText().equals("Salir")){
            System.out.println("Se oprimió el botón Salir");
        }
    }
    
}
