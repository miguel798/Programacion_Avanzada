/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.FlowLayout;

/**
 *
 * @author MIGUE
 */
public class FlowLayout1 extends javax.swing.JFrame{
    
    public FlowLayout1() {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.JButton boton1 = new javax.swing.JButton("Botón 1");
        javax.swing.JButton boton2 = new javax.swing.JButton("Botón 2");
        javax.swing.JButton boton3 = new javax.swing.JButton("Botón 3");
        javax.swing.JButton boton4 = new javax.swing.JButton("Botón 4");
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(boton1);
        getContentPane().add(boton2);
        getContentPane().add(boton3);
        getContentPane().add(boton4); 
    }
}
