/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;
/**
 *
 * @author MIGUE
 */
public class Fecha {
    //Tipo de dato / identificadores
    public int dia;
    public int mes;
    public int anio;
    
    //Metodo constructor
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
        
    }
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
}
