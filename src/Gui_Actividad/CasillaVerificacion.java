// Creción de botones JCheckBox
package Gui_Actividad;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CasillaVerificacion extends JFrame{
    private JTextField campoTexto; // muestra el texto en tipos de letra cambi antes
    private JCheckBox negritaJCheckBox; // para seleccionar/deseleccionar negrita
    private JCheckBox cursivaJCheckBox; // para seleccionar/deseleccionar cursi va
    
    // El constructor de MarcoCasi11aVerificacion agrega objetos JCheckBox a Jframe
    public CasillaVerificacion(){
        super( "Prueba de JCheckBox" );
        setLayout( new FlowLayout()); // establece el esquema del marco
            
        // establece JTextFie1d y su tipo de letra
        campoTexto = new JTextField( "  Observe como cambia el estilo de tipo de letra  ");
        campoTexto.setFont( new Font( "Serif", Font. PLAIN, 14 ));
        add( campoTexto );
   
        negritaJCheckBox = new JCheckBox( "Negrita" ); // crea casilla de verificaciön "negrnta"
        cursivaJCheckBox = new JCheckBox( "Cursiva" ); // crea casilla de verificaciön "cursiva"
        add( negritaJCheckBox );
        add( cursivaJCheckBox ) ;
        
        // registra componentes de escucha para objetos JCheckBox
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
    }
    
    // clase interna privada para el manejo de eventos ItemListener
    private class ManejadorCheckBox implements ItemListener{
        private int valNegrita = Font.PLAIN; //controla el estilo de tipo de letra negrita
        private int valCursiva = Font. PLAIN; //controla el estilo de tipo de letra cursiva
        
        // responde a los eventos de casilla de verificacion
        public void itemStateChanged( ItemEvent evento){
            // procesa los eventos de la casilla de verificaciön "negrita"
            if ( evento.getSource() == negritaJCheckBox )
            valNegrita = negritaJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
            
            // procesa los eventos de la casilla de verificaciån "cursiva"
            if ( evento.getSource() == cursivaJCheckBox )
            valCursiva = cursivaJCheckBox. isSelected() ? Font.ITALIC : Font. PLAIN;
            
            // establece el tipo de letra del campo de texto
            campoTexto.setFont(new Font( "Serif", valNegrita + valCursiva,14 ));
        }
    }
}
