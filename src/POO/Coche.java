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
public class Coche {
    //Tipo de dato / identificadorres
    private String marca;
    public String  modelo;
    private String  color;
    private int  precio;
    private int  matricula;

    
    //Método constructor por defecto
    public Coche(){
        this.marca = " ";
        this.modelo = " ";
        this.color = " ";
        this.precio = 0;
        this.matricula = 0;
    }
    
    //Método constructor
    public Coche(String marca, String modelo, String color, int precio, int matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.matricula = matricula;
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
    
    public void setmatricula (int matricula){
        this.matricula = matricula;
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
    
    public int getmatriculaa(){
        return this.matricula;
    }
}