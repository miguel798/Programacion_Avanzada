
package Practicas;

/**
 *
 * @author MIGUE
 */
public class Instrumento{
          
  String tipo;
  
  public Instrumento() {
        this.tipo =" ";
    }

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
  public void tocar()
   {
    System.out.println("Toca la "+tipo);
   }
}