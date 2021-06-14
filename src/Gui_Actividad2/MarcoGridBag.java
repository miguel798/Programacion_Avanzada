// Demostración de GridBagLayout.
package Gui_Actividad2;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class MarcoGridBag extends JFrame {
    private GridBagLayout esquema;
    // esquema de este marco
    private GridBagConstraints restricciones; // restricciones de este esquema
    // establece la GUI
    public MarcoGridBag(){
        super( "GridBagLayout" );
        esquema = new GridBagLayout();
        setLayout( esquema ); // establece el esquema del marco
        restricciones = new GridBagConstraints(); // instancia las restricciones
        
        // crea los componentes de la GUI
        JTextArea areaTexto1 = new JTextArea( "AreaTexto1", 5, 10 );
        areaTexto1.setEditable(false);
        JTextArea areaTexto2 = new JTextArea( "AreaTexto2", 2, 2 );
        areaTexto2.setEditable(false);
        String nombres[] = { "Hierro", "Acero", "Bronce" };
        JComboBox cuadroComb = new JComboBox( nombres );
        JTextField campoTexto = new JTextField( "CampoTexto" );
        campoTexto.setEditable(false);
        JButton boton1 = new JButton( "Boton 1" );
        JButton boton2 = new JButton( "Boton 2" );
        JButton boton3 = new JButton( "Boton 3" );
        
        // weightx y weighty para areaTexto1 son 0: el valor predeterminado
        // anchor para todos los componentes es CENTER: el valor predeterminado
        restricciones.fill = GridBagConstraints.BOTH;
        agregarComponente( areaTexto1, 0, 0, 1, 3 );

        // weightx y weighty para boton1 son 0: el valor predeterminado
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        agregarComponente( boton1, 0, 1, 2, 1 );

        // weightx y weighty para cuadroComb son 0: el valor predeterminado
        // ﬁll es HORIZONTAL
        agregarComponente( cuadroComb, 2, 1, 2, 1 );
        
        // boton2
        restricciones.weightx = 1000; // puede hacerse más ancho
        restricciones.weighty = 1; // puede hacerse más alto
        restricciones.fill = GridBagConstraints.BOTH;
        agregarComponente( boton2, 1, 1, 1, 1 );

        // ﬁll es BOTH para boton3
        restricciones.weightx = 0;
        restricciones.weighty = 0;
        agregarComponente( boton3, 1, 2, 1, 1 );
        
        // weightx y weighty para campoTexto son 0, ﬁll es BOTH
        agregarComponente( campoTexto, 3, 0, 2, 1 );
        
        // weightx y weighty para areaTexto2 son 0, ﬁll es BOTH
        agregarComponente( areaTexto2, 3, 2, 1, 1 );
    } // ﬁn del constructor de MarcoGridBag 
    
       // método para establecer restricciones 
    private void agregarComponente( Component componente, int ﬁla, int columna, int anchura, int altura ){
        restricciones.gridx = columna; // establece gridx
        restricciones.gridy = ﬁla; // establece gridy
        restricciones.gridwidth = anchura; // establece gridwidth
        restricciones.gridheight = altura; // establece gridheight
        esquema.setConstraints( componente, restricciones ); // establece restricciones
        add( componente ); // agrega el componente
    } // ﬁn del método agregarComponente
}// ﬁn de la clase MarcoGridBag
