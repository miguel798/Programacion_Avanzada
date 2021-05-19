// Demostración de la clase JLabel .
package Gui_Actividad;

import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las caracteri sticas básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants ; // constantes comunes utilizadas con Swing
import javax.swing.Icon ; //interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon ; // carga las imágenes



public class LabelFrame extends JFrame{
    private JLabel etiquetal;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    
    // El constructor de LabelFrame agrega Objetos Rabel a JFrame
    public LabelFrame(){
        super("Prueba de JLabe1");
        setLayout(new FlowLayout() ); // establece el esquema del marco
        
        // Constructor de jLabe1 con un argumento String
        etiquetal = new JLabel( "Etiqueta con texto" ) ;
        etiquetal.setToolTipText( "Esta es etiqueta1" ) ;
        add( etiquetal ) ; // agrega etiquetal a JFrame
        
        // Constructor de jLabe1 con argumentos de cadena, Icono y alineación
        Icon insecto = new ImageIcon( getClass().getResource("/Imagenes/bote.png"));
        etiqueta2 = new JLabel( "Etiqueta con texto e icono", insecto, SwingConstants.LEFT) ;
        etiqueta2.setToolTipText( "Esta es etiqueta2" );
        add( etiqueta2 ) ; // agrega etiqueta2 a JFrame
        
        etiqueta3 = new JLabel(); // Constructor de JLabel sin argumentos
        etiqueta3. setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon( insecto ) ; // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText( "Esta es etiqueta 3");
        add( etiqueta3 ) ; // agrega etiqueta2 a JFrame
    }  
}





