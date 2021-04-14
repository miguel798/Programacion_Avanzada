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
    private int dia;
    private int mes;
    private int anio;
    
    //Método constructor por defecto
    public Fecha(){
        this.dia = 10;
        this.mes = 04;
        this.anio = 2000;
        
    }
    
//Método constructor
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //set dia
    public void setdia (int dia){
        this.dia = dia;
    }
    //set mes
    public void setmes (int mes){
        this.mes = mes;
    }
    //set anio
    public void setanio (int anio){
        this.anio = anio;
    }
    
    //get dia
    public int getdia(){
        return this.dia;
    }
    //get mes
    public int getmes(){
        return this.mes;
    }
    //get anio
    public int getanio(){
        return this.anio;
    }
}
