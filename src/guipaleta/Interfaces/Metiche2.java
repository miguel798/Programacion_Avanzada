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
public class Metiche2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem)e.getSource();
        
        if (item.getText().equals("Copiar")){
            System.out.println("Se oprimió el botón Copiar");
        }
        if (item.getText().equals("Deshacer")){
            System.out.println("Se oprimió el botón Deshacer");
        }
        if (item.getText().equals("Borrar")){
            System.out.println("Se oprimió el botón Borrar");
        }
    }
    
}
