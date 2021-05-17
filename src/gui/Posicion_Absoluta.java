/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author MIGUE
 */
public class Posicion_Absoluta extends javax.swing.JFrame{
    
    public Posicion_Absoluta() {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.JButton botonTmp;
        getContentPane().setLayout(null);
        for (int i=0; i<4; i++){
            botonTmp= new javax.swing.JButton("Botón ".concat(String.valueOf(i+1)));
            botonTmp.setSize(80, 20);
            botonTmp.setLocation(5, i*35);
            getContentPane().add(botonTmp);
        }
    }
 }
