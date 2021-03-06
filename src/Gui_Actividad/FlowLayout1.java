// Demostración de las alineaciones de FlowLayout1.
package Gui_Actividad;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
public class FlowLayout1 extends JFrame {
    private JButton botonJButtonIzquierda; // botón para establecer la alineación a la izquierda
    private JButton botonJButtonCentro; // botón para establecer la alineación al centro
    private JButton botonJButtonDerecha; // botón para establecer la alineación a la derecha
    private FlowLayout esquema; // objeto esquema
    private Container contenedor; // contenedor para establecer el esquema

 // establece la GUI y registra los componentes de escucha de botones
 public FlowLayout1() {
     super( "Demostracion de FlowLayout" );
    esquema = new FlowLayout(); // crea objeto FlowLayout1
    contenedor = getContentPane(); // obtiene contenedor para esquema
    setLayout( esquema ); // establece el esquema del marco

    // establece botonJButtonIzquierda y registra componente de escucha
    botonJButtonIzquierda = new JButton( "Izquierda" ); // crea botón Izquierda
    add( botonJButtonIzquierda ); // agrega botón Izquierda al marco
    botonJButtonIzquierda.addActionListener(new ActionListener() // clase interna anónima
    {
        // procesa evento de botonJButtonIzquierda 
        public void actionPerformed( ActionEvent evento ) {
            esquema.setAlignment( FlowLayout.LEFT );
            
        // realinea los componentes adjuntos
        esquema.layoutContainer( contenedor );
        } // ﬁn del método actionPerformed
    } // ﬁn de la clase interna anónima
    ); // ﬁn de la llamada a addActionListener

    // establece botonJButtonCentro y registra componente de escucha
    botonJButtonCentro = new JButton( "Centro" ); // crea botón Centro
    add( botonJButtonCentro ); // agrega botón Centro al marco
    botonJButtonCentro.addActionListener(new ActionListener() // clase interna anónima}
    {
        // procesa evento de botonJButtonCentro 
        public void actionPerformed( ActionEvent evento ) {
            esquema.setAlignment( FlowLayout.CENTER );
            
            // realinea los componentes adjuntos
            esquema.layoutContainer( contenedor );
        } // ﬁn del método actionPerformed
    } // ﬁn de la clase interna anónima
    ); // ﬁn de la llamada a addActionListener
  
    // establece botonJButtonDerecha y registra componente de escucha
    botonJButtonDerecha = new JButton( "Derecha" ); // crea botón Derecha
    add( botonJButtonDerecha ); // agrega botón Derecha al marco
    botonJButtonDerecha.addActionListener(new ActionListener() // clase interna anónima
    {
        // procesa evento de botonJButtonDerecha 
        public void actionPerformed( ActionEvent evento ) {
            esquema.setAlignment( FlowLayout.RIGHT );
            
            // realinea los componentes adjuntos
            esquema.layoutContainer( contenedor );
        } // ﬁn del método actionPerformed
    } // ﬁn de la clase interna anónima
  ); // ﬁn de la llamada a addActionListener
 } // ﬁn del constructor de FlowLayout1
} // ﬁn de la clase FlowLayout1
