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
public class Laptop {
    //Tipo de dato / identificadores
    private String marca;
    private String  modelo;
    private String  teclado;
    private int  voltaje;
    private int  potencia;

    
    //Método constructor por defecto
    public Laptop(){
        this.marca = " ";
        this.modelo = " ";
        this.teclado = " ";
        this.voltaje = 0;
        this.potencia = 0;
    }
    
    //Método constructor
    public Laptop(String marca, String modelo, String teclado, int voltaje, int potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.teclado = teclado;
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
    
    public void setteclado (String teclado){
        this.teclado = teclado;
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
    
    public String getteclado(){
        return this.teclado;
    }
    
    public int getvoltaje(){
        return this.voltaje;
    }
    
    public int getpotencia(){
        return this.potencia;
    }
}

