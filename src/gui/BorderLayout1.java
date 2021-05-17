/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;

/**
 *
 * @author MIGUE
 */
public class BorderLayout1 extends javax.swing.JFrame{
    
    public BorderLayout1() {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.JButton boton1 = new javax.swing.JButton("Botón 1");
        javax.swing.JButton boton2 = new javax.swing.JButton("Botón 2");
        javax.swing.JButton boton3 = new javax.swing.JButton("Botón 3");
        javax.swing.JButton boton4 = new javax.swing.JButton("Botón 4");
        getContentPane().add(boton1, BorderLayout.NORTH);
        getContentPane().add(boton2, BorderLayout.WEST);
        getContentPane().add(boton3, BorderLayout.EAST);
        getContentPane().add(boton4, BorderLayout.SOUTH); 
    }
}
