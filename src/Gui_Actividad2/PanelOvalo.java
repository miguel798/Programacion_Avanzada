// Una clase JPanel personalizada.
package Gui_Actividad2;

import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class PanelOvalo extends JPanel 
{
 private int diametro = 10; // Diámetro predeterminado de 10
 
 // Dibuja un óvalo del diámetro especiﬁcado
 public void paintComponent( Graphics g )
 {
  super.paintComponent( g );
  g.fillOval(10, 10, diametro, diametro);// Dibuja un círculo
 } // Fin del método paintComponent
 
 // Valida y establece el diámetro, después vuelve a pintar
 public void establecerDiametro( int nuevoDiametro )
 {
  // Si el diámetro es inválido, usa el valor predeterminado de 10
  diametro = ( nuevoDiametro >= 0 ? nuevoDiametro : 10 );
  repaint(); // Vuelve a pintar el panel
 } // Fin del método establecerDiametro
 
 // Lo utiliza el administrador de esquemas para determinar el tamaño preferido
 public Dimension getPreferredSize(){
     return new Dimension( 200, 200 );
 } // Fn del método getPreferredSize
 
 // Lo utiliza el administrador de esquemas para determinar el tamaño mínimo
 public Dimension getMinimumSize()
 {
  return getPreferredSize();
 } // Fn del método getMinimumSize
} // Fin de la clase PanelOvalo
