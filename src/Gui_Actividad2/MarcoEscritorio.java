//Demostracion de JDesktopPane
package Gui_Actividad2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class MarcoEscritorio extends JFrame 
{
 private JDesktopPane elEscritorio;
 // establece la GUI
 public MarcoEscritorio()
 {
  super( "Uso de JDesktopPane" );
  JMenuBar barra = new JMenuBar(); // crea la barra de menús
  JMenu menuAgregar = new JMenu( "Agregar" ); // crea el menú Agregar
  JMenuItem nuevoMarco = new JMenuItem( "Marco interno" );
  menuAgregar.add( nuevoMarco ); // agrega nuevo elemento marco al menú Agregar
    barra.add( menuAgregar ); // agrega el menú Agregar a la barra de menús
  setJMenuBar( barra ); // establece la barra de menús para esta aplicación
  elEscritorio = new JDesktopPane(); // crea el panel de escritorio
  add( elEscritorio ); // agrega el panel de escritorio al marco
 
  // establece componente de escucha para el elemento de menú nuevoMarco
  nuevoMarco.addActionListener(new ActionListener() // clase interna anónima
  {
     // muestra la nueva ventana interna
     public void actionPerformed( ActionEvent evento ) {
         // crea el marco interno
         JInternalFrame marco = new JInternalFrame("Marco interno", true, true, true, true );
         MiJPanel panel = new MiJPanel(); // crea nuevo panel
         marco.add( panel, BorderLayout.CENTER ); // agrega el panel
         marco.pack(); // establece marco interno al tamaño del contenido
         elEscritorio.add( marco ); // adjunta marco interno
         marco.setVisible( true ); // muestra marco interno
    } // ﬁn del método actionPerformed
    } // ﬁn de la clase interna anónima
  ); // ﬁn de la llamada a addActionListener
 } // ﬁn del constructor de MarcoEscritorio
} // ﬁn de la clase MarcoEscritorio

// clase para mostrar un objeto ImageIcon en un panel
class MiJPanel extends JPanel {
    private static Random generador = new Random();
    private ImageIcon imagen; // imagen a mostrar
    private String[] imagenes = { "/Imagenes/bote.png", "/Imagenes/chip.png",
  "/Imagenes/computadora.png", "/Imagenes/fortuna.png", "/herradura/bote.png" };
 
// carga la imagen
 public MiJPanel(){
     int numeroAleatorio = generador.nextInt( 5 );
     imagen = new ImageIcon( getClass().getResource(imagenes[numeroAleatorio])); // establece el icono
 } // ﬁn del constructor de MiJPanel
 
 // muestra el objeto imageIcon en el panel
  public void paintComponent( Graphics g ) {
      super.paintComponent( g );
      imagen.paintIcon( this, g, 0, 0 ); // muestra el icono
 } // ﬁn del método paintComponent
  
 // devuelve las medidas de la imagen
 public Dimension getPreferredSize() {
     return new Dimension( imagen.getIconWidth(),
     imagen.getIconHeight() );
 } // ﬁn del método getPreferredSize
} // ﬁn de la clase MiJPanel
