package Examen;

import static Examen.Examen1.txtnombre;
import static Examen.Examen1.txtapellido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUE
 */
public class Saludo implements ActionListener{
    String n;
    String a;
    
    
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)e.getSource();
        n=txtnombre.getText();
        a=txtapellido.getText();
        
        if (boton.getText().equals("Español")){
            JOptionPane.showMessageDialog(null, "Hola "+n+" "+a+" ,mucho gusto");
        }
        if (boton.getText().equals("Ingles")){
            JOptionPane.showMessageDialog(null, "Hello "+n+" "+a+" ,nice to meet you");
        }
        if (boton.getText().equals("Italiano")){
            JOptionPane.showMessageDialog(null, "Ciao "+n+" "+a+" ,piacere di conoscerti");
        }
        if (boton.getText().equals("Chino")){
            JOptionPane.showMessageDialog(null, "你好 "+n+" "+a+" ,樂趣");
        }
        if (boton.getText().equals("Francés")){
            JOptionPane.showMessageDialog(null, "Bonjour "+n+" "+a+" ,ravi de vous rencontrer"); 
        }
        if (boton.getText().equals("Japonés")){
            JOptionPane.showMessageDialog(null, "こんにちは "+n+" "+a+" ,喜び");
        }
    }

}
