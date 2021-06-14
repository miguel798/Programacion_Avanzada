// Demostración de los objetos JPopupMenu.
package Gui_Actividad2;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

public class MarcoContextual extends JFrame{
    private JRadioButtonMenuItem elementos[]; // contiene los elementos para los colores
    private final Color valoresColores[] ={ Color.BLUE, Color.YELLOW, Color.RED }; // colores a utilizar
    private JPopupMenu menuContextual; // permite al usuario seleccionar el color

// El constructor sin argumentos establece la GUI
public MarcoContextual(){
    super( "Uso de objetos JPopupMenu" );
    ManejadorElementos manejador = new ManejadorElementos(); // manejador para los elementos de menú
    String colores[] = { "Azul", "Amarillo", "Rojo" }; // arreglo de colores
    ButtonGroup grupoColores = new ButtonGroup(); // administra los elementos de colores
    menuContextual = new JPopupMenu(); // crea el menú contextual
    elementos = new JRadioButtonMenuItem[ 3 ]; // elementos para seleccionar el color
    
 // Construye elemento de menú, lo agrega al menú contextual, habilita el manejo de eventos
 for ( int cuenta = 0; cuenta < elementos.length; cuenta++ ) {
     elementos[ cuenta ] = new JRadioButtonMenuItem( colores[ cuenta ] );
     menuContextual.add( elementos[ cuenta ] ); // agrega elemento al menú contextual
    grupoColores.add( elementos[ cuenta ] ); // agrega elemento al grupo de botones
    elementos[ cuenta ].addActionListener( manejador ); // agrega el manejador
 } // ﬁn de for
 setBackground( Color.WHITE ); // establece el color de fondo en blanco
 
 // Declara un objeto MouseListener para que la ventana muestre el menú contextual
 addMouseListener(new MouseAdapter() // clase interna anónima
 {// maneja el evento de oprimir el botón del ratón
     public void mousePressed( MouseEvent evento ){
         checkForTriggerEvent( evento ); // comprueba el desencadenador
     } // ﬁn del método mousePressed
     
    // Maneja el evento de liberación del botón del ratón
     public void mouseReleased( MouseEvent evento ){
         checkForTriggerEvent( evento ); // comprueba el desencadenador
     } // ﬁn del método mouseReleased
     
    // Determina si el evento debe desencadenar el menú contextual
    private void checkForTriggerEvent( MouseEvent evento ){
        if ( evento.isPopupTrigger() ) 
            menuContextual.show(evento.getComponent(), evento.getX(), evento.getY() );
    } // ﬁn del método checkForTriggerEvent
 } // ﬁn de la clase interna anónima
 ); // ﬁn de la llamada a addMouseListener
} // ﬁn del constructor de MarcoContextual

// Clase interna privada para manejar los eventos de los elementos de menú
private class ManejadorElementos implements ActionListener{
// procesa las selecciones de los elementos de menú
    public void actionPerformed( ActionEvent evento ){
        // determina cuál elemento de menú se seleccionó
        for ( int i = 0; i < elementos.length; i++ ){
            if ( evento.getSource() == elementos[ i ] ){
                getContentPane().setBackground( valoresColores[ i ] );
                return;
            } // ﬁn de if
        } // ﬁn de for
    } // ﬁn del método actionPerformed
} // ﬁn de la clase interna privada ManejadorElementos
}// ﬁn de la clase MarcoContextual
