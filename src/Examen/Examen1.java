package Examen;

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
import Examen.Saludo;

/**
 *
 * @author MIGUE
 */
public class Examen1 extends JFrame{
    private JFrame Saludador;
    private JLabel nombre, apellido;
    static JTextField txtnombre, txtapellido;
    private JButton español, ingles, italiano, chino, frances, japones;
    private JPanel p1, p2, p3;

    public Examen1(){
        Label();
        Entradas();
        Botones();
        Saludador();
        
        Saludo saludo = new Saludo();
        this.español.addActionListener(saludo);
        this.ingles.addActionListener(saludo);
        this.italiano.addActionListener(saludo);
        this.chino.addActionListener(saludo);
        this.frances.addActionListener(saludo);
        this.japones.addActionListener(saludo);
    }
    
    void Label(){
        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1, 5, 5));
        nombre = new JLabel("Nombre");
        nombre.setFont(new Font("tahoma", Font.CENTER_BASELINE,16));
        apellido = new JLabel("Apellido");
        apellido.setFont(new Font("tahoma", Font.CENTER_BASELINE,16));
        
        p1.add(nombre);
        p1.add(apellido);
    }
    
    void Entradas(){
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 1, 5, 5));
        txtnombre = new JTextField(20);
        txtapellido = new JTextField(20);
        
        p2.add(txtnombre);
        p2.add(txtapellido);
    }
    
    void Botones(){
        p3 = new JPanel();
        p3.setLayout(new GridLayout(3, 2, 5, 5));
        
        español= new JButton("Español");
        español.setFont(new Font("tahoma", Font.ROMAN_BASELINE,14));
        ingles= new JButton("Ingles");
        ingles.setFont(new Font("tahoma", Font.ROMAN_BASELINE,14));
        italiano= new JButton("Italiano");
        italiano.setFont(new Font("tahoma", Font.ROMAN_BASELINE,14));
        chino= new JButton("Chino");
        chino.setFont(new Font("tahoma", Font.ROMAN_BASELINE,14));
        frances= new JButton("Francés");
        frances.setFont(new Font("tahoma", Font.ROMAN_BASELINE,14));
        japones= new JButton("Japonés");
        japones.setFont(new Font("tahoma", Font.ROMAN_BASELINE,14));
        
        p3.add(español);
        p3.add(ingles);
        p3.add(italiano);
        p3.add(chino);
        p3.add(frances);
        p3.add(japones);
    }
    
    void Saludador(){
        Saludador = new JFrame("Saludador de Idiomas");
        Saludador.setLayout(new BoxLayout(Saludador.getContentPane(),BoxLayout.X_AXIS));
        Saludador.add(p1);
        Saludador.add(p2);
        Saludador.add(p3);
        Saludador.pack();
        Saludador.setVisible(true);
        Saludador.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String args[])
 {
     Examen1 ex = new Examen1();
     ex.setSize( 100, 1800 ); 
 }
}
