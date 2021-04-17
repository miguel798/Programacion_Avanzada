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
public class Platillo {
    //Tipo de dato / identificadores
    private String porcion;
    private int precio;
    private int cantidd;
    
    //Método constructor por defecto
    public Platillo(){
        this.porcion = " ";
        this.precio = 0;
        this.cantidd = 0;
        
    }
    
//Método constructor
    public Platillo(String porcion, int precio, int cantidd){
        this.porcion = porcion;
        this.precio = precio;
        this.cantidd = cantidd;
    }
    
    //Set
    public void setporcion(String porcion){
        this.porcion = porcion;
    }
    
    public void setprecio (int precio){
        this.precio = precio;
    }
    
    public void setcantidd (int cantidd){
        this.cantidd = cantidd;
    }
    
    //Get
    public String getporcion(){
        return this.porcion;
    }
    
    public int getprecio(){
        return this.precio;
    }
    
    public int getcantidd(){
        return this.cantidd;
    }
}
