//Creación de objetos JButton
package Gui_Actividad;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Boton extends JFrame{
    private JButton botonJButtonSimp1e; // botön con texto sol amente
    private JButton botonJButtonE1egante; // botön con iconos
    
    // Boton agrega objetos IButton a JFrame
    public Boton(){
    super( "Prueba de botones" ) ;
    setLayout( new FlowLayout());// establece el esquema del marco
    
    botonJButtonSimp1e = new JButton( "Botón simple" ); // botön con texto
    add( botonJButtonSimp1e ) ;
    
    Icon insectol = new ImageIcon( getClass().getResource( "/Imagenes/herradura.png" ));
    Icon insecto2 = new ImageIcon( getClass().getResource( "/Imagenes/fortuna.png" )) ;
    botonJButtonE1egante = new JButton( "Botón elegante" ,insectol );
    botonJButtonE1egante.setRolloverIcon( insecto2 ) ;
    add( botonJButtonE1egante ) ;

    // crea nuevo ManejadorBoton para manejar los eventos de botön
    ManejadorBoton manejador = new ManejadorBoton() ;
    botonJButtonE1egante.addActionListener( manejador ) ;
    botonJButtonSimp1e.addActionListener( manejador ) ;
    }
    
    private class ManejadorBoton implements ActionListener {
    //maneja evento de botón
    public void actionPerformed( ActionEvent evento ){
        JOptionPane.showMessageDialog(Boton.this, String.format("Usted oprimió: %s", evento.getActionCommand()));
    }
  }
}
