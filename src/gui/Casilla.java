package gui;

import static gui.Gato1.b1;
import static gui.Gato1.b2;
import static gui.Gato1.b3;
import static gui.Gato1.b4;
import static gui.Gato1.b5;
import static gui.Gato1.b6;
import static gui.Gato1.b7;
import static gui.Gato1.b8;
import static gui.Gato1.b9;
import static gui.Gato1.j1;
import static gui.Gato1.j2;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Casilla implements ActionListener {
    String turno="X";
    private JPanel juego;
    private int c1=0;
    private int c2=0;

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)e.getSource();
        
        if(boton.getText().equals("")){
            boton.setText(turno);
            cambiarturno();
            comprobar();
        }
        if(boton.getText().equals("Reiniciar")){
            Reiniciar();
        }
        if(boton.getText().equals("Reiniciar Juego")){
            ReiniciarJuego();
        }
        
    }
    
    public void cambiarturno(){
        if (turno.equals("X")){
            turno="O";
        }else{
            turno="X";
        }
    }
    
    public void comprobar(){
            //Ganador O
            if(b1.getText().equals("O")&&
                    b2.getText().equals("O")&&
                    b3.getText().equals("O")){
                b1.setBackground(Color.RED);
                b2.setBackground(Color.RED);
                b3.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            if(b4.getText().equals("O")&&
                    b5.getText().equals("O")&&
                    b6.getText().equals("O")){
                b4.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b6.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            if(b7.getText().equals("O")&&
                    b8.getText().equals("O")&&
                    b9.getText().equals("O")){
                b7.setBackground(Color.RED);
                b8.setBackground(Color.RED);
                b9.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            if(b1.getText().equals("O")&&
                    b4.getText().equals("O")&&
                    b7.getText().equals("O")){
                b1.setBackground(Color.RED);
                b4.setBackground(Color.RED);
                b7.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            if(b2.getText().equals("O")&&
                    b5.getText().equals("O")&&
                    b8.getText().equals("O")){
                b2.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b8.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            if(b3.getText().equals("O")&&
                    b6.getText().equals("O")&&
                    b9.getText().equals("O")){
                b3.setBackground(Color.RED);
                b6.setBackground(Color.RED);
                b9.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            if(b1.getText().equals("O")&&
                    b5.getText().equals("O")&&
                    b9.getText().equals("O")){
                b1.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b9.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            if(b3.getText().equals("O")&&
                    b5.getText().equals("O")&&
                    b7.getText().equals("O")){
                b3.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b7.setBackground(Color.RED);
                c1++;
                j1.setText("Jugador 1: "+c1);
                //System.out.println("Gano O");
            }
            
            //Ganador X
            if(b1.getText().equals("X")&&
                    b2.getText().equals("X")&&
                    b3.getText().equals("X")){
                b1.setBackground(Color.RED);
                b2.setBackground(Color.RED);
                b3.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
            if(b4.getText().equals("X")&&
                    b5.getText().equals("X")&&
                    b6.getText().equals("X")){
                b4.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b6.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
            if(b7.getText().equals("X")&&
                    b8.getText().equals("X")&&
                    b9.getText().equals("X")){
                b7.setBackground(Color.RED);
                b8.setBackground(Color.RED);
                b9.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
            if(b1.getText().equals("X")&&
                    b4.getText().equals("X")&&
                    b7.getText().equals("X")){
                b1.setBackground(Color.RED);
                b4.setBackground(Color.RED);
                b7.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
            if(b2.getText().equals("X")&&
                    b5.getText().equals("X")&&
                    b8.getText().equals("X")){
                b2.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b8.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
            if(b3.getText().equals("X")&&
                    b6.getText().equals("X")&&
                    b9.getText().equals("X")){
                b3.setBackground(Color.RED);
                b6.setBackground(Color.RED);
                b9.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
            if(b1.getText().equals("X")&&
                    b5.getText().equals("X")&&
                    b9.getText().equals("X")){
                b1.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b9.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
            if(b3.getText().equals("X")&&
                    b5.getText().equals("X")&&
                    b7.getText().equals("X")){
                b3.setBackground(Color.RED);
                b5.setBackground(Color.RED);
                b7.setBackground(Color.RED);
                c2++;
                j2.setText("Jugador 2: "+c2);
                //System.out.println("Gano X");
            }
    }
    
    public void ReiniciarJuego(){
        b1.setText("");
        b1.setBackground(Color.lightGray);
        b2.setText("");
        b2.setBackground(Color.lightGray);
        b3.setText("");
        b3.setBackground(Color.lightGray);
        b4.setText("");
        b4.setBackground(Color.lightGray);
        b5.setText("");
        b5.setBackground(Color.lightGray);
        b6.setText("");
        b6.setBackground(Color.lightGray);
        b7.setText("");
        b7.setBackground(Color.lightGray);
        b8.setText("");
        b8.setBackground(Color.lightGray);
        b9.setText("");
        b9.setBackground(Color.lightGray);
        
        if(c1>c2){
            JOptionPane.showMessageDialog(null, "El ganador es el Jugador 1"); 
        }
        else{
            JOptionPane.showMessageDialog(null, "El ganador es el Jugador 2");
        }
        
        j1.setText("Jugador 1:");
        j2.setText("Jugador 2:");
        c1=0;
        c2=0;
    }
    
    public void Reiniciar(){
        b1.setText("");
        b1.setBackground(Color.lightGray);
        b2.setText("");
        b2.setBackground(Color.lightGray);
        b3.setText("");
        b3.setBackground(Color.lightGray);
        b4.setText("");
        b4.setBackground(Color.lightGray);
        b5.setText("");
        b5.setBackground(Color.lightGray);
        b6.setText("");
        b6.setBackground(Color.lightGray);
        b7.setText("");
        b7.setBackground(Color.lightGray);
        b8.setText("");
        b8.setBackground(Color.lightGray);
        b9.setText("");
        b9.setBackground(Color.lightGray);
    } 
}
