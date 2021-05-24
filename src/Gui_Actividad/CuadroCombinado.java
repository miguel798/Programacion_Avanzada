// Uso de un objeto JComboBox para seleccionar una imagen a mostrar.
package Gui_Actividad;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
 import javax.swing.JComboBox;
import javax.swing.Icon;
 import javax.swing.ImageIcon;
 
 public class CuadroCombinado extends JFrame {
     private JComboBox imagenesJComboBox; // cuadro combinado con los nombres de los
     private JLabel etiqueta; // etiqueta para mostrar el icono seleccionado
     private String nombres[] = 
     { "/Imagenes/computadora.png", "/Imagenes/chip.png", "/Imagenes/huella.png", "/Imagenes/usb.png"};
     private Icon iconos[] = { 
     new ImageIcon( getClass().getResource( nombres[ 0 ] )),
     new ImageIcon( getClass().getResource( nombres[ 1 ] )), 
     new ImageIcon( getClass().getResource( nombres[ 2 ] )),
     new ImageIcon( getClass().getResource( nombres[ 3 ] ))};
     
     // El constructor de CuadroCombinado agrega un objeto JComboBox a JFrame
     public CuadroCombinado(){
         super( "Prueba de JComboBox" ); 
         setLayout( new FlowLayout() ); // establece el esquema del marco
         
         imagenesJComboBox = new JComboBox( nombres ); // establece JComboBox
         imagenesJComboBox.setMaximumRowCount( 3 ); // muestra tres ﬁlas
         
         imagenesJComboBox.addItemListener(new ItemListener() // clase interna anónima
         { 
             public void itemStateChanged( ItemEvent evento ){
            // determina si está seleccionada la casilla de veriﬁcación
             if ( evento.getStateChange() == ItemEvent.SELECTED )
                 etiqueta.setIcon( iconos[imagenesJComboBox.getSelectedIndex() ] );
       } // ﬁn del método itemStateChanged
} // ﬁn de la clase interna anónima
); // ﬁn de la llamada a addItemListener

         add( imagenesJComboBox ); // agrega cuadro combinado a JFrame
         etiqueta = new JLabel( iconos[ 0 ] ); // muestra el primer icono
         add( etiqueta ); // agrega etiqueta a JFrame
    } // ﬁn del constructor de CuadroCombinado
} 
