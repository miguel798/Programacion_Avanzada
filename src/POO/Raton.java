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
public class Raton {
    //Tipo de dato / identificadores
    private String tipo;
    private String  conexion;
    private int dimension;
    private int  peso;
    private int  noBotones;

//Método constructor por defecto
    public Raton(){
        this.tipo = " ";
        this.conexion = " ";
        this.dimension = 0;
        this.peso = 0;
        this.noBotones = 0;
    }
    //Método constructor
    public Raton(String tipo, String conexion, int dimension, int peso, int noBotones){
        this.tipo = tipo;
        this.conexion = conexion;
        this.dimension = dimension;
        this.peso = peso;
        this.noBotones = noBotones;
    }
    
    //Set
    public void settipo (String tipo){
        this.tipo = tipo;
    }
    
    public void setconexion (String conexion){
        this.conexion = conexion;
    }
    
    public void setdimension (int dimension){
        this.dimension = dimension;
    }
    
    public void setpeso (int peso){
        this.peso = peso;
    }
    
    public void setnoBotones(int noBotones){
        this.noBotones = noBotones;
    }
    
    //Get
    public String gettipo(){
        return this.tipo;
    }
    
    public String getconexion(){
        return this.conexion;
    }
    
    public int getdimension(){
        return this.dimension;
    }
    
    public int getpeso(){
        return this.peso;
    }
    
    public int getnoBotones(){
        return this.noBotones;
    }
}
