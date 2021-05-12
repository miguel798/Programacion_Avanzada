
package Practicas;

/**
 *
 * @author working
 */ 
public class Fecha1 {
    // tipo de dato / identificador 
    private int dia;
    private int mes;
    private int anio;
      
    
    // metodo constructor que se tiene que especificar dentro de las clases
    public Fecha1(){
        // variable local
        // int x = 7;
        // inicializar los atributos del objeto
        this.dia = 10;
        this.mes = 7;
        this.anio = 1900;
    }
    
    public Fecha1(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    
    }   
    // sobrecarga (establacer un metodo mas 1 de ocasión pero con diferentes parametros)
   
    // set dia
    public void setDia (int dia){
        this.dia = dia;
    }
    
    public void setMes (int mes){
        this.mes = mes;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    // get para dia
    public int getDia(){
        return this.dia;
    }
    
    // get para el mes
    
    public int getMes(){
        return mes;
    }
    // get para el año
    
    public int getAnio(){
        return this.anio;
    }
}