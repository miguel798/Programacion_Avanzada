package gui;

import static gui.Calculadora1.Text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author MIGUE
 */
public class MeticheNumeros implements ActionListener {

    public MeticheNumeros() {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton)e.getSource();
        
        if (boton.getText().equals("0")){
            Text.setText(Text.getText()+"0");
        }
        if (boton.getText().equals("1")){
            Text.setText(Text.getText()+"1");
        }
        if (boton.getText().equals("2")){
            Text.setText(Text.getText()+"2");
        }
        if (boton.getText().equals("3")){
            Text.setText(Text.getText()+"3");
        }
        if (boton.getText().equals("4")){
            Text.setText(Text.getText()+"4");
        }
        if (boton.getText().equals("5")){
            Text.setText(Text.getText()+"5");
        }
        if (boton.getText().equals("6")){
            Text.setText(Text.getText()+"6");
        }
        if (boton.getText().equals("7")){
            Text.setText(Text.getText()+"7");
        }
        if (boton.getText().equals("8")){
            Text.setText(Text.getText()+"8");
        }
        if (boton.getText().equals("9")){
            Text.setText(Text.getText()+"9");
        }
    }
}
