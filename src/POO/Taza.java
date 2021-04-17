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
public class Taza {
    //Tipo de dato / identificadores
    private String color;
    private String  forma;
    private String  tamanio;

//Método constructor por defecto
    public Taza(){
        this.color = " ";
        this.forma = " ";
        this.tamanio = " ";
    }
    //Método constructor
    public Taza(String color, String forma, String tamanio){
        this.color = color;
        this.forma = forma;
        this.tamanio = tamanio;
    }
    
    //Set
    public void setcolor (String color){
        this.color = color;
    }
    
    public void setforma (String forma){
        this.forma = forma;
    }
    
    public void settamanio (String tamanio){
        this.tamanio = tamanio;
    }
    
    //Get
    public String getcolor(){
        return this.color;
    }
    
    public String getforma(){
        return this.forma;
    }
    
    public String gettamanio(){
        return this.tamanio;
    }
}
