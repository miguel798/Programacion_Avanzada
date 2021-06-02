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
public class Metiche1 implements ActionListener {

    public Metiche1() {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem)e.getSource();
        
        if (item.getText().equals("Nuevo")){
            System.out.println("Se oprimió el botón Nuevo");
        }
        if (item.getText().equals("Abrir")){
            System.out.println("Se oprimió el botón Abrir");
        }
        if (item.getText().equals("Guardar")){
            System.out.println("Se oprimió el botón Guardar");
        }
    }
}

