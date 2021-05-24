// Copiar elementos de un objeto List a otro.
package Gui_Actividad;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class SeleccionMultiple extends JFrame {
    private JList listaJListColores; // lista para guardar los nombres de los colores
    private JList listaJListCopia; // lista en la que se van a copiar los nombres de loscolores
    
    private JButton botonJButtonCopiar; // botón para copiar los nombres seleccionados
    private final String nombresColores[] = { "Negro", "Azul", "Cyan", "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta", "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo"};

// Constructor de SeleccionMultiple
public SeleccionMultiple(){
    super( "Listas de seleccion multiple" );
    setLayout( new FlowLayout() ); // establece el esquema del marco
    
    listaJListColores = new JList( nombresColores ); // contiene nombres de todos loscolores
    listaJListColores.setVisibleRowCount( 10); // muestra cinco ﬁlas
    listaJListColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    
    add( new JScrollPane( listaJListColores ) ); // agrega lista con panel de desplazamiento
    
    botonJButtonCopiar = new JButton( "Copiar >>>" ); // crea botón para copiar
    botonJButtonCopiar.addActionListener(new ActionListener() // clase interna anónima 
    { 
        // maneja evento de botón
        public void actionPerformed( ActionEvent evento ){
            // coloca los valores seleccionados en listaJListCopia
            listaJListCopia.setListData( listaJListColores.getSelectedValues() );
        } // ﬁn del método actionPerformed
    } // ﬁn de la clase interna anónima
    ); // ﬁn de la llamada a addActionListener
     add( botonJButtonCopiar ); // agrega el botón copiar a JFrame
     
     listaJListCopia = new JList(); // crea lista para guardar nombres de colorescopiados
     listaJListCopia.setVisibleRowCount( 5 ); // muestra 5 ﬁlas
     listaJListCopia.setFixedCellWidth( 100 ); // establece la anchura
     listaJListCopia.setFixedCellHeight( 15 ); // establece la altura
     listaJListCopia.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     
     add( new JScrollPane( listaJListCopia ) ); // agrega lista con panel de dezplazamiento
    } // ﬁn del constructor de SeleccionMultiple
} // ﬁn de la clase SeleccionMultiple
