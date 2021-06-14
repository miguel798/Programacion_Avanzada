// Cambio de la apariencia visual.
package Gui_Actividad2;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MarcoAparienciaVisual extends JFrame{
     // nombres de las apariencias visuales
    private final String cadenas[] = { "Metal", "Motif", "Windows" };
    private UIManager.LookAndFeelInfo apariencias[]; // apariencias visuales
    private JRadioButton opcion[]; // botones de opción para seleccionar la apariencia visual
    private ButtonGroup grupo; // grupo para los botones de opción
    private JButton boton; // muestra la apariencia del botón
    private JLabel etiqueta; // muestra la apariencia de la etiqueta
    private JComboBox cuadroComb; // muestra la apariencia del cuadro combinado

// Establece la GUI
    public MarcoAparienciaVisual(){
        super( "Demo de apariencia visual" );
    JPanel panelNorte = new JPanel(); // crea panel norte
    panelNorte.setLayout( new GridLayout( 3, 1, 0, 5 ) );
    etiqueta = new JLabel( "Esta es una apariencia visual metalica",
    SwingConstants.CENTER ); // crea etiqueta
    panelNorte.add( etiqueta ); // agrega etiqueta al panel
    boton = new JButton( "JButton" ); // crea botón
    panelNorte.add( boton ); // agrega botón al panel
    cuadroComb = new JComboBox( cadenas ); // crea cuadro combinado
    panelNorte.add( cuadroComb ); // agrega cuadro combinado al panel
    
    // Crea arreglo para los botones de opción
    opcion = new JRadioButton[ cadenas.length ];
    JPanel panelSur = new JPanel(); // crea panel sur
    panelSur.setLayout( new GridLayout( 1, opcion.length ) );
    grupo = new ButtonGroup(); // grupo de botones para las apariencias visuales
    ManejadorElementos manejador = new ManejadorElementos(); // manejador de apariencia visual
    
    for ( int cuenta = 0; cuenta < opcion.length; cuenta++ ){
        opcion[ cuenta ] = new JRadioButton( cadenas[ cuenta ] );
        opcion[ cuenta ].addItemListener( manejador ); // agrega el manejador
        grupo.add( opcion[ cuenta ] ); // agrega botón de opción al grupo
        panelSur.add( opcion[ cuenta ] ); // agrega botón de opción al panel
    } // ﬁn de for
    
    add( panelNorte, BorderLayout.NORTH ); // agrega panel norte
    add( panelSur, BorderLayout.SOUTH ); // agrega panel sur
        
    // obtiene la información de la apariencia visual instalada
    apariencias = UIManager.getInstalledLookAndFeels();
    opcion[ 0 ].setSelected( true ); // establece la selección predeterminada
    }// ﬁn del constructor de MarcoAparienciaVisual
    
    // usa UIManager para cambiar la apariencia visual de la GUI
    private void cambiarAparienciaVisual( int valor ){
        try // cambia la apariencia visual
        {// establece la apariencia visual para esta aplicación
            UIManager.setLookAndFeel( apariencias[ valor ].getClassName() );
            // actualiza los componentes en esta aplicación
            SwingUtilities.updateComponentTreeUI( this );
        }// ﬁn de try
        
        catch ( Exception excepcion ){
            excepcion.printStackTrace();
        } // ﬁn de catch
    } // ﬁn del método cambiarAparienciaVisual

    // clase interna privada para manejar los eventos de los botones de opción
    private class ManejadorElementos implements ItemListener{
        // procesa la selección de apariencia visual del usuario
        public void itemStateChanged( ItemEvent evento ){
            for ( int cuenta = 0; cuenta < opcion.length; cuenta++ ){
                if ( opcion[ cuenta ].isSelected() ){
                    etiqueta.setText( String.format( "Esta es una apariencia visual %s",cadenas[ cuenta ] ) );
                    cuadroComb.setSelectedIndex( cuenta ); // establece el índice del cuadro combinado
                    cambiarAparienciaVisual( cuenta ); // cambia la apariencia visual
                } // ﬁn de if
            } // ﬁn de for
        } // ﬁn del método itemStateChanged
    } // ﬁn de la clase interna privada ManejadorElementos
}// ﬁn de la clase MarcoAparienciaVisual
