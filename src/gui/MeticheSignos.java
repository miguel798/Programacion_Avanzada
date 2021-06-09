package gui;

import static gui.Calculadora1.Text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author MIGUE
 */
public class MeticheSignos implements ActionListener {
    String cadena;
    String n1;
    String n2;
    String signo;

    public MeticheSignos() {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)e.getSource();
        cadena=Text.getText();
        
        //Resta
        if (boton.getText().equals("-")){  
            if(!cadena.equals("")){
                n1=Text.getText();
                signo="-";
                Text.setText("");
                System.out.println("presionaste menos, nuemro 1="+n1);
        }
        }
        //Suma
        if (boton.getText().equals("+")){
            if(!cadena.equals("")){
                n1=Text.getText();
                signo="+";
                Text.setText("");
        }
        }
        //División
        if (boton.getText().equals("/")){
            if(!cadena.equals("")){
                n1=Text.getText();
                signo="/";
                Text.setText("");
        }
        }
        //Multiplicación
        if (boton.getText().equals("*")){
            if(!cadena.equals("")){
                n1=Text.getText();
                signo="*";
                Text.setText("");
        }
        }
        //Botón igual
        String resultado;
        n2=Text.getText();
        if(boton.getText().equals("=")){
            if(!n2.equals("")){
            resultado=calculadora(n1,n2,signo);
            Text.setText(resultado);
        }
        }
        
        if (boton.getText().equals("CE")){
            if(signo.equals("")){
            n1="";
            Text.setText("");}
            else {
            n2="";
            Text.setText("");}
        }
    }
    
    //Calculadora
    public static String calculadora(String n1, String n2, String signo){
        Double resultado=0.0;
        String respuesta;
        if(signo.equals("-")){
            resultado=Double.parseDouble(n1)-Double.parseDouble(n2);
        }
        if(signo.equals("+")){
            resultado=Double.parseDouble(n1)+Double.parseDouble(n2);
        }
        if(signo.equals("*")){
            resultado=Double.parseDouble(n1)*Double.parseDouble(n2);
        }
        if(signo.equals("/")){
            resultado=Double.parseDouble(n1)/Double.parseDouble(n2);
        }
        respuesta=resultado.toString();
        return respuesta;
    }
}
