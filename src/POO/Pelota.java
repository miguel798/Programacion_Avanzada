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
public class Pelota {
    //Tipo de dato / identificadores
    private String forma;
    private String  deporte;
    private String  color;

//Método constructor por defecto
    public Pelota(){
        this.forma = " ";
        this.deporte = " ";
        this.color = " ";
    }
    //Método constructor
    public Pelota(String forma, String deporte, String color){
        this.forma = forma;
        this.deporte = deporte;
        this.color = color;
    }
    
    //Set
    public void setforma (String forma){
        this.forma = forma;
    }
    
    public void setdeporte(String deporte){
        this.deporte = deporte;
    }
    
    public void setcolor (String color){
        this.color = color;
    }
    
    //Get
    public String getforma(){
        return this.forma;
    }
    
    public String getdeporte(){
        return this.deporte;
    }
    
    public String getcolor(){
        return this.color;
    }
}