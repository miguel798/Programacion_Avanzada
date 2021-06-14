package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author MIGUE
 */
public class Gato1 extends JFrame{
    private JFrame Pantalla;
    static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, boton, reiniciar,reiniciar1;
    static JTextField j1,j2;
    private JPanel juego, p1, p2, p3,p4;
    private JLabel txt1,txt2;
    String turno="X";
    
    public Gato1() {
        //Puntuaciones();
        Reiniciar();
        Puntuador();
        Botones();
        Juego();
        
        Casilla turn = new Casilla();
        this.b1.addActionListener(turn);
        this.b2.addActionListener(turn);
        this.b3.addActionListener(turn);
        this.b4.addActionListener(turn);
        this.b5.addActionListener(turn);
        this.b6.addActionListener(turn);
        this.b7.addActionListener(turn);
        this.b8.addActionListener(turn);
        this.b9.addActionListener(turn);
        this.reiniciar.addActionListener(turn);
        this.reiniciar1.addActionListener(turn);
    }
    
    void Puntuador(){
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,1,5,5));
        j1 = new JTextField(5);
        j1.setText("Jugador 1:");
        j1.setEditable(false);
        j2 = new JTextField(5);
        j2.setText("Jugador 2:");
        j2.setEditable(false);
        
        p1.add(j1);
        p1.add(j2);
        
    }
    
    void Reiniciar(){
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        reiniciar= new JButton("Reiniciar");
        reiniciar1= new JButton("Reiniciar Juego");
        p3.setFont(new Font("tahoma", Font.ITALIC,16));
        
        p3.add(reiniciar);
        p3.add(reiniciar1);
    }
    
    void Botones(){
        juego = new JPanel();
        juego.setLayout(new GridLayout(3,3,5,5));
        
        b1 = new JButton("");
            b1.setFont(new Font("tahoma", Font.BOLD,20));
            b1.setBackground(Color.lightGray);
        b2 = new JButton("");
            b2.setFont(new Font("tahoma", Font.BOLD,20));
            b2.setBackground(Color.lightGray);
        b3 = new JButton("");
            b3.setFont(new Font("tahoma", Font.BOLD,20));
            b3.setBackground(Color.lightGray);
        b4 = new JButton("");
            b4.setFont(new Font("tahoma", Font.BOLD,20));
            b4.setBackground(Color.lightGray);
        b5 = new JButton("");
            b5.setFont(new Font("tahoma", Font.BOLD,20));
            b5.setBackground(Color.lightGray);
        b6 = new JButton("");
            b6.setFont(new Font("tahoma", Font.BOLD,20));
            b6.setBackground(Color.lightGray);
        b7 = new JButton("");
            b7.setFont(new Font("tahoma", Font.BOLD,20));
            b7.setBackground(Color.lightGray);
        b8 = new JButton("");
            b8.setFont(new Font("tahoma", Font.BOLD,20));
            b8.setBackground(Color.lightGray);
        b9 = new JButton("");
            b9.setFont(new Font("tahoma", Font.BOLD,20));
            b9.setBackground(Color.lightGray);
        
        juego.add(b1);
        juego.add(b2);
        juego.add(b3);
        juego.add(b4);
        juego.add(b5);
        juego.add(b6);
        juego.add(b7);
        juego.add(b8);
        juego.add(b9);
    }
    
    void Juego(){
        Pantalla = new JFrame("El gato");
        Pantalla.setLayout(new BoxLayout(Pantalla.getContentPane(),BoxLayout.Y_AXIS));
        Pantalla.add(p1);
        Pantalla.add(juego);
        Pantalla.add(p3);
        Pantalla.pack();
        Pantalla.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        Gato1 gato = new Gato1();
        gato.setSize( 1000, 800 );
        gato.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
