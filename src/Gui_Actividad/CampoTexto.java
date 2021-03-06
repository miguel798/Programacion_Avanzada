// Demostraciön de la clase JTextFie1d.
package Gui_Actividad;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTexto extends JFrame {
private JTextField campoTexto1; // campo de texto con tamaño ﬁjo
private JTextField campoTexto2; // campo de texto construido con texto
private JTextField campoTexto3; // campo de texto con texto y tamaño
private JPasswordField campoContrasenia; // campo de contraseña con texto

// El constructor de MarcoCampoTextoMarco agrega objetos JTextField a JFrame

public CampoTexto (){
    super( "Prueba de JTextField y JPasswordField" );
    setLayout( new FlowLayout() ); // establece el esquema del marco
    
    // construye campo de texto con 10 columnas
    campoTexto1 = new JTextField( 10 ); 
    add( campoTexto1 ); // agrega campoTexto1 a JFrame
    
    // construye campo de texto con texto predeterminado
    campoTexto2 = new JTextField( "Escriba el texto aqui" );
    add( campoTexto2 ); // agrega campoTexto2 a JFrame
    
    // construye campo de texto con texto predeterminado y 21 columnas
    campoTexto3 = new JTextField( "Campo de texto no editable", 21 );
    campoTexto3.setEditable( false ); // deshabilita la edición
    add( campoTexto3 ); // agrega campoTexto3 a JFrame
    
    // construye campo de contraseña con texto predeterminado38
    campoContrasenia = new JPasswordField( " Texto oculto" );
    add( campoContrasenia ); // agrega campoContrasenia a JFrame
    
    // registra los manejadores de eventos
    ManejadorCampoTexto manejador = new ManejadorCampoTexto();
    campoTexto1.addActionListener( manejador );
    campoTexto2.addActionListener( manejador );
    campoTexto3.addActionListener( manejador );
    campoContrasenia.addActionListener( manejador );
    } // ﬁn del constructor de CampoTexto

// clase interna privada para el manejo de eventos
private class ManejadorCampoTexto implements ActionListener{
    // procesa los eventos de campo de texto
    public void actionPerformed( ActionEvent evento ){
        String cadena = ""; // declara la cadena a mostrar
        
        // el usuario oprimió Intro en el objeto JTextField campoTexto1
        if ( evento.getSource() == campoTexto1 )
            cadena = String.format( "Campo Texto 1: %s",evento.getActionCommand() );

        // el usuario oprimió Intro en el objeto JTextField campoTexto2
        else if ( evento.getSource() == campoTexto2 )
            cadena = String.format( "Campo Texto 2: %s",evento.getActionCommand() );

        // el usuario oprimió Intro en el objeto JTextField campoTexto3
        else if ( evento.getSource() == campoTexto3 )
            cadena = String.format( "Campo Texto 3: %s",evento.getActionCommand() );

        // el usuario oprimió Intro en el objeto JTextField campoContrasenia
        else if ( evento.getSource() == campoContrasenia )
            cadena = String.format( "Campo Contrasenia: %s",new String( campoContrasenia.getPassword() ) );

        // muestra el contenido del objeto JTextField
        JOptionPane.showMessageDialog( null, cadena ); 
       }
    }
}
