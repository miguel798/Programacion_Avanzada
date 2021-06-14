// Demostración de las constantes de GridBagLayout.
package Gui_Actividad2;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

public class MarcoGridBag2 extends JFrame {
    private GridBagLayout esquema;
    // esquema de este marco
    private GridBagConstraints restricciones; // restricciones de este esquema
    
    // establece la GUI
    public MarcoGridBag2(){
        super( "GridBagLayout" );
        esquema = new GridBagLayout();
        setLayout( esquema ); // establece el esquema del marco 
        restricciones = new GridBagConstraints(); // instancia las restricciones
        // crea los componentes de la GUI
        String metales[] = { "Cobre", "Aluminio", "Plata" };
        JComboBox cuadroComb = new JComboBox( metales );
        JTextField campoTexto = new JTextField( "CampoTexto" );
        campoTexto.setEditable(false);
        String fuentes[] = { "Serif", "Monospaced" };
        JList lista = new JList( fuentes );
        String nombres[] = { "cero", "uno", "dos", "tres", "cuatro" };
        JButton botones[] = new JButton[ nombres.length ];
        for ( int cuenta = 0; cuenta < botones.length; cuenta++ )
        botones[ cuenta ] = new JButton( nombres[ cuenta ] );

        // deﬁne las restricciones para el componente de la GUI campoTexto
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.gridwidth = GridBagConstraints.REMAINDER;
        agregarComponente( campoTexto );
        // botones[0] -- weightx y weighty son 1: ﬁll es BOTH
        restricciones.gridwidth = 1;
        agregarComponente( botones[ 0 ] );
        // botones[1] -- weightx y weighty son 1: ﬁll es BOTH
        restricciones.gridwidth = GridBagConstraints.RELATIVE;
        agregarComponente( botones[ 1 ] );
        // botones[2] -- weightx y weighty son 1: ﬁll es BOTH
        restricciones.gridwidth = GridBagConstraints.REMAINDER;
        agregarComponente( botones[ 2 ] );
        // cuadroComb -- weightx es 1: ﬁll es BOTH
        restricciones.weighty = 0;
        restricciones.gridwidth = GridBagConstraints.REMAINDER;
        agregarComponente( cuadroComb );

        // botones[3] -- weightx es 1: ﬁll es BOTH
        restricciones.weighty = 1;
        restricciones.gridwidth = GridBagConstraints.REMAINDER;
        agregarComponente( botones[ 3 ] ); 
        // botones[4] -- weightx y weighty son 1: ﬁll es BOTH
        restricciones.gridwidth = GridBagConstraints.RELATIVE;
        agregarComponente( botones[ 4 ] );
        // lista -- weightx y weighty son 1: ﬁll es BOTH
        restricciones.gridwidth = GridBagConstraints.REMAINDER;
        agregarComponente( lista );
 } // ﬁn del constructor de MarcoGridBag2
    
 // agrega un componente al contenedor
 private void agregarComponente( Component componente ){
     esquema.setConstraints( componente, restricciones );
     add( componente ); // agrega el componente
 } // ﬁn del método agregarComponente
} // ﬁn de la clase MarcoGridBag2
