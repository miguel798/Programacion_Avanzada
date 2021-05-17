/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridLayout;
import java.awt.LayoutManager;

/**
 *
 * @author MIGUE
 */
public class GridLayout1 extends javax.swing.JFrame{
    
    public GridLayout1() {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.JPanel panel= new javax.swing.JPanel();
        javax.swing.JButton boton1 = new javax.swing.JButton("Botón 1");
        javax.swing.JButton boton2 = new javax.swing.JButton("Botón 2");
        javax.swing.JButton boton3 = new javax.swing.JButton("Botón 3");
        javax.swing.JButton boton4 = new javax.swing.JButton("Botón 4");
        panel.setLayout(new GridLayout(2,2));
        //panel.setLayout(new GridLayout(2,2,5,5)); para tener una pequeña separación 
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        getContentPane().add(panel);
    }
}
