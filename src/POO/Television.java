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
public class Television {
    //Tipo de dato / identificadorres
    private String marca;
    private String  modelo;
    private int  voltaje;
    private int  potencia;

    
    //Método constructor por defecto
    public Television(){
        this.marca = " ";
        this.modelo = " ";
        this.voltaje = 0;
        this.potencia = 0;
    }
    
    //Método constructor
    public Television(String marca, String modelo, int voltaje, int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.voltaje = voltaje;
        this.potencia = potencia;
    }
    
    //Set
    public void setmarca (String marca){
        this.marca = marca;
    }
    
    public void setmodelo (String modelo){
        this.modelo = modelo;
    }
    
    public void setvoltaje (int voltaje){
        this.voltaje = voltaje;
    }
    
    public void setbpotencia (int potencia){
        this.potencia = potencia;
    }
    
    //Get
    public String getmarca(){
        return this.marca;
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    
    public int getvoltaje(){
        return this.voltaje;
    }
    
    public int getpotencia(){
        return this.potencia;
    }
}
