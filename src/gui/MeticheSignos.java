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
    String signo, sig;
    Double nu1;
    Double porcentaje;
    String por;

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
        //Botón CE
        if (boton.getText().equals("CE")){
            Text.setText("");
            if (!signo.equals("")){
            n2="";
            Text.setText("");}
        }
        
        n2=Text.getText();
        if (boton.getText().equals("%")){
                if(!n2.equals("")){
                    sig="%";
                    resultado=calculadora(n1,n2,sig);
                    if (signo=="+"){
                        porcentaje=Double.parseDouble(n1)+Double.parseDouble(resultado);
                        por=porcentaje.toString();
                        Text.setText(por);
                    } 
                    if (signo=="-"){
                        porcentaje=Double.parseDouble(n1)-Double.parseDouble(resultado);
                        por=porcentaje.toString();
                        Text.setText(por);
                    } 
                    if (signo=="*"){
                        Text.setText(resultado);
                    } 
                    if (signo=="/"){
                        porcentaje=Double.parseDouble(n1)/((Double.parseDouble(resultado))/Double.parseDouble(n1));
                        por=porcentaje.toString();
                        Text.setText(por);
                    } 
                }
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
        if(signo.equals("%")){
            resultado=(Double.parseDouble(n1)*Double.parseDouble(n2))/100;
            System.out.println(resultado);
        }
        respuesta=resultado.toString();
        return respuesta;
    }
}
