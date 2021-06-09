package gui;

import static java.awt.Color.BLUE;
import static java.awt.Color.RED;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import gui.MeticheNumeros;
import gui.MeticheSignos;

public class Calculadora1 extends JFrame{
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0, bs,br,bm,bd,b01,b02,b03,b04,b05,b06,bP,bCE,bC,bB;
    private JPanel PI;
    private JPanel PS;
    private JFrame Pantalla;
    static JTextField Text;
    String n1;
    String signo;
    String n2;
    
    // constructor sin argumentos
    public Calculadora1() {
        Teclado();
        Resultado();
        General();
        
        MeticheNumeros numeros = new MeticheNumeros();
        this.b0.addActionListener(numeros);
        this.b1.addActionListener(numeros);
        this.b2.addActionListener(numeros);
        this.b3.addActionListener(numeros);
        this.b4.addActionListener(numeros);
        this.b5.addActionListener(numeros);
        this.b6.addActionListener(numeros);
        this.b7.addActionListener(numeros);
        this.b8.addActionListener(numeros);
        this.b9.addActionListener(numeros);
        
        MeticheSignos signos = new MeticheSignos();
        this.bs.addActionListener(signos);
        this.br.addActionListener(signos);
        this.bm.addActionListener(signos);
        this.bd.addActionListener(signos);
        this.b04.addActionListener(signos);
        this.bCE.addActionListener(signos);
        
        MeticheCaracteres car = new MeticheCaracteres();
        this.b01.addActionListener(car);
        this.b02.addActionListener(car);
        this.b03.addActionListener(car);
        this.b05.addActionListener(car);
        this.b06.addActionListener(car);
        this.bB.addActionListener(car);
        this.bC.addActionListener(car);
        
    }
    
    void Resultado(){
        PS = new JPanel();
        PS.setBackground(BLUE);
        PS.setLayout(new FlowLayout());
        Text = new JTextField(20);
        Text.setFont(new Font("tahoma", Font.ITALIC,20));
        PS.add(Text);
    }
  
    void Teclado(){
        PI = new JPanel();
        PI.setBackground(RED);
        PI.setFont(new Font("tahoma", Font.ITALIC,20));
        PI.setLayout(new GridLayout(6, 4, 5, 5));
        //Númericos
        b0=new JButton("0");
        b0.setFont(new Font("tahoma", Font.BOLD,18));
        b1=new JButton("1");
        b1.setFont(new Font("tahoma", Font.BOLD,18));
        b2=new JButton("2");
        b2.setFont(new Font("tahoma", Font.BOLD,18));
        b3=new JButton("3");
        b3.setFont(new Font("tahoma", Font.BOLD,18));
        b4=new JButton("4");
        b4.setFont(new Font("tahoma", Font.BOLD,18));
        b5=new JButton("5");
        b5.setFont(new Font("tahoma", Font.BOLD,18));
        b6=new JButton("6");
        b6.setFont(new Font("tahoma", Font.BOLD,18));
        b7=new JButton("7");
        b7.setFont(new Font("tahoma", Font.BOLD,18));
        b8=new JButton("8");
        b8.setFont(new Font("tahoma", Font.BOLD,18));
        b9=new JButton("9");
        b9.setFont(new Font("tahoma", Font.BOLD,18));
        //Operacionales
        bs= new JButton("+");
        bs.setFont(new Font("tahoma", Font.ITALIC,20));
        br= new JButton("-");
        br.setFont(new Font("tahoma", Font.ITALIC,20));
        bm= new JButton("*");
        bm.setFont(new Font("tahoma", Font.ITALIC,20));
        bd= new JButton("/");
        bd.setFont(new Font("tahoma", Font.ITALIC,20));
        //Especiales
        bP= new JButton("%");
        bP.setFont(new Font("tahoma", Font.ITALIC,20));
        bCE= new JButton("CE");
        bCE.setFont(new Font("tahoma", Font.ITALIC,20));
        bC= new JButton("C");
        bC.setFont(new Font("tahoma", Font.ITALIC,20));
        bB= new JButton("←");
        bB.setFont(new Font("tahoma", Font.ITALIC,20));
        b01= new JButton("1/x");
        b01.setFont(new Font("tahoma", Font.ITALIC,20));
        b02= new JButton("x^2");
        b02.setFont(new Font("tahoma", Font.ITALIC,20));
        b03= new JButton("√x");
        b03.setFont(new Font("tahoma", Font.ITALIC,20));
        b04= new JButton("=");
        b04.setFont(new Font("tahoma", Font.ITALIC,20));
        b05= new JButton(".");
        b05.setFont(new Font("tahoma", Font.ITALIC,20));
        b06= new JButton("+/-");
        b06.setFont(new Font("tahoma", Font.ITALIC,20));
        
        
        PI.add(bP);
        PI.add(bCE);
        PI.add(bC);
        PI.add(bB);
        PI.add(b01);
        PI.add(b02);
        PI.add(b03);
        PI.add(bd);
        PI.add(b7);
        PI.add(b8);
        PI.add(b9);
        PI.add(bm);
        PI.add(b4);
        PI.add(b5);
        PI.add(b6);
        PI.add(br);
        PI.add(b1);
        PI.add(b2);
        PI.add(b3);
        PI.add(bs);
        PI.add(b06);
        PI.add(b0);
        PI.add(b05);
        PI.add(b04);
        
 }
    
    void General(){
        Pantalla = new JFrame("Calculadora");
        Pantalla.setLayout(new BoxLayout(Pantalla.getContentPane(),BoxLayout.Y_AXIS));
        Pantalla.add(PS);
        Pantalla.add(PI);
        Pantalla.pack();
        Pantalla.setVisible(true);
        Pantalla.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    } 

     

 public static void main(String args[])
 {
     Calculadora1 calc = new Calculadora1();
     calc.setSize( 300, 800 ); 
 }

}
