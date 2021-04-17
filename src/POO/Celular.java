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
public class Celular {
    //Tipo de dato / identificadorres
    private String marca;
    private String  modelo;
    private String  color;
    private int  precio;

    
    //Método constructor por defecto
    public Celular(){
        this.marca = " ";
        this.modelo = " ";
        this.color = " ";
        this.precio = 0;
    }
    
    //Método constructor
    public Celular(String marca, String modelo, String color, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    
    //Set
    public void setmarca (String marca){
        this.marca = marca;
    }
    
    public void setmodelo (String modelo){
        this.modelo = modelo;
    }
    
    public void setcolor (String color){
        this.color = color;
    }
    
    public void setprecio (int precio){
        this.precio = precio;
    }
    
    //Get
    public String getmarca(){
        return this.marca;
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    
    public String getcolor(){
        return this.color;
    }
    
    public int getprecio(){
        return this.precio;
    }
}


