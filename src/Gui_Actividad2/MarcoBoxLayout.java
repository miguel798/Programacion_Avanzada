// Demostración de BoxLayout.
package Gui_Actividad2;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MarcoBoxLayout extends JFrame{
// establece la GUI
    public MarcoBoxLayout(){
        super( "Demostración de BoxLayout" );
        // crea contenedores Box con BoxLayout
        Box horizontal1 = Box.createHorizontalBox();
        Box vertical1 = Box.createVerticalBox();
        Box horizontal2 = Box.createHorizontalBox();
        Box vertical2 = Box.createVerticalBox();
        final int TAMANIO = 3; // número de botones en cada objeto Box
  // agrega botones al objeto Box horizontal1
  for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ )
      horizontal1.add( new JButton( "Boton " + cuenta ) );
  
  // crea montante y agrega botones al objeto Box vertical1
  for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ){
      vertical1.add( Box.createVerticalStrut( 25 ) );
      vertical1.add( new JButton( "Boton " + cuenta ) );
  } // ﬁn de for
  
  // crea pegamento horizontal y agrega botones al objeto Box horizontal2
  for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ) {
      horizontal2.add( Box.createHorizontalGlue() );
      horizontal2.add( new JButton( "Boton " + cuenta ) );
  } // ﬁn de for
  
  // crea un área rígida y agrega botones al objeto Box vertical2
  for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ) {
      vertical2.add( Box.createRigidArea( new Dimension( 12, 8 ) ) );
      vertical2.add( new JButton( "Boton " + cuenta ) );
  } // ﬁn de for
  
  // crea pegamento vertical y agrega botones al panel
  JPanel panel = new JPanel();
  panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ) );
  for ( int cuenta = 0; cuenta < TAMANIO; cuenta++ ){
      panel.add( Box.createGlue() );
      panel.add( new JButton( "Boton " + cuenta ) );
  } // ﬁn de for
  
 // crea un objeto JTabbedPane
 JTabbedPane ﬁchas = new JTabbedPane( 
 JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT ); 
 
 // coloca cada contenedor en el panel con ﬁchas
 ﬁchas.addTab( "Cuadro horizontal", horizontal1 );
 ﬁchas.addTab( "Cuadro vertical con montantes", vertical1 );
 ﬁchas.addTab( "Cuadro horizontal con pegamento", horizontal2 );
 ﬁchas.addTab( "Cuadro vertical con areas rigidas", vertical2 );
 ﬁchas.addTab( "Cuadro vertical con pegamento", panel );
 add( ﬁchas ); // coloca panel con ﬁchas en el marco
} // ﬁn del constructor de MarcoBoxLayout
}// ﬁn de la clase MarcoBoxLayout
