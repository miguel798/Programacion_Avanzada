package gui;

import static gui.Calculadora1.Text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author MIGUE
 */
public class MeticheCaracteres implements ActionListener {
    String cadena;
    Double num1;
    String signo;

    public MeticheCaracteres() {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)e.getSource();
        cadena=Text.getText();
        
        //Botón de borrar todo
        if (boton.getText().equals("C")){
            Text.setText("");
        }
        //Botón de borrar
        if (boton.getText().equals("←")){
            if(cadena.length()>0){
            cadena=cadena.substring(0, cadena.length()-1);
            Text.setText(cadena);
        }
        }
        //Botón de 1 entre x
        if (boton.getText().equals("1/x")){
            if (cadena.length()>0){
                num1=1/(Double.parseDouble(cadena));
                Text.setText(num1.toString());
            }
        }
        //Botón elevado al cuadrado
        if (boton.getText().equals("x^2")){
            if(cadena.length()>0){
                num1=(Math.pow(Double.parseDouble(cadena), 2));
                Text.setText(num1.toString());
            }
        }
        //Botón raiz cuadrada
        if (boton.getText().equals("√x")){
            if(cadena.length()>0){
                num1=(Math.sqrt(Double.parseDouble(cadena)));
                Text.setText(num1.toString());
            }
        }
        //Botón del punto
        if (boton.getText().equals(".")){
            if(cadena.length()<=0){
            Text.setText("0.");}
        else{
            if(!existepunto(Text.getText())){
                Text.setText(Text.getText()+".");}
        }
        }
        //Boton signo
        if (boton.getText().equals("+/-")){
            if(cadena.length()>0){
                num1=(-1)*Double.parseDouble(cadena);
                Text.setText(num1.toString());
            }
        }   
    }
    
    //Agregar Punto
    public static boolean existepunto(String cadena){
        boolean resultado;
        resultado=false;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.substring(i,i+1).equals(".")){
                resultado=true;
                break;
            }
        }
        return resultado;
    }
}
