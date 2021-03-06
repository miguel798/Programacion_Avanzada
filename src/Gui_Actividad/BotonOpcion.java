//Creación de objetos JButton
package Gui_Actividad;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class BotonOpcion extends JFrame{
    private JTextField campoTexto; //se utiliza para mostrar los cambios en el tipo de letra
    private Font tipoLetraSimp1e; // tipo de letra para texto simple
    private Font tipoLetraNegrita; // tipo de letra para texto en negrita
    private Font tipoLetraCursiva; // tipo de letra para texto en cursiva
    private Font tipoLetraNegritaCursiva; // tipo de letra para texto en negrita y cursnva

    private JRadioButton simpleJRadioButton; // selecciona texto simple
    private JRadioButton negritaJRadioButton; // selecciona texto en negrita
    private JRadioButton cursivaJRadioButton; // selecciona texto en cursiva
    private JRadioButton negritaCursivaJRadioButton; // negrita y cursiva
    private ButtonGroup grupoOpciones; // grupo de botones que contiene los botones de opcion

    // El constructor de BotonOpcion agrega los objetos JRadioButton a JFrame
    public BotonOpcion (){
        super( "Prueba de RadioButton");
        setLayout( new FlowLayout()); // establece el esquema del marco
        campoTexto = new JTextField( "Observe el cambio en el estilo del tipo de letra" ,28);
        add( campoTexto ) ;
        
        // crea los botones de opciön
        simpleJRadioButton = new JRadioButton( "Simple", true);
        negritaJRadioButton = new JRadioButton( "Negrita", false);
        cursivaJRadioButton = new JRadioButton( "Cursiva", false);
        negritaCursivaJRadioButton = new JRadioButton( "Negrita/Cursiva" , false);
        add( simpleJRadioButton ) ;
        add( negritaJRadioButton ) ;
        add( cursivaJRadioButton ) ;
        add( negritaCursivaJRadioButton );
        
        // crea una relaciön lögica entre los objetos JRadioButton
        grupoOpciones = new ButtonGroup(); // crea ButtonGroup
        grupoOpciones.add( simpleJRadioButton ); // agrega simple al grupo
        grupoOpciones.add( negritaJRadioButton ); // agrega negrita al grupo
        grupoOpciones.add( cursivaJRadioButton ); // agrega cursiva al grupo
        grupoOpciones.add( negritaCursivaJRadioButton ); // agrega ne 
        
        // crea objetos tipo de letra
        tipoLetraSimp1e = new Font( "Serif", Font.PLAIN, 14 );
        tipoLetraNegrita = new Font( "Serif", Font.BOLD, 14 );
        tipoLetraCursiva = new Font( "Serif", Font.ITALIC, 14 );
        tipoLetraNegritaCursiva = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
        campoTexto.setFont( tipoLetraSimp1e ); // establece tipo letra inicial a simple

        // registra eventos para los objetos JRadioButton
        simpleJRadioButton.addItemListener(new ManejadorBotonOpcion( tipoLetraSimp1e ) );
        negritaJRadioButton.addItemListener(new ManejadorBotonOpcion( tipoLetraNegrita ) );
        cursivaJRadioButton.addItemListener(new ManejadorBotonOpcion( tipoLetraCursiva ) );
        negritaCursivaJRadioButton.addItemListener(new ManejadorBotonOpcion( tipoLetraNegritaCursiva ) );
        } 
        // clase interna privada para manejar eventos de botones de opción
        private class ManejadorBotonOpcion implements ItemListener {
            private Font tipoLetra;// tipo de letra asociado con este componente de escucha
            public ManejadorBotonOpcion(Font f){
                  tipoLetra = f; // establece el tipo de letra de este componente de escucha
            } 
            // maneja los eventos de botones de opción
            public void itemStateChanged( ItemEvent evento ){
            campoTexto.setFont( tipoLetra ); // establece el tipo de letra de campoTexto
            } 

            } 
} 
