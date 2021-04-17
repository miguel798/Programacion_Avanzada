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
public class Impresora {
    //Tipo de dato / identificadores
    private String tipo;
    private String  puerto;
    private String  marca;
    private int PagPorMin;

//Método constructor por defecto
    public Impresora(){
        this.tipo = " ";
        this.puerto = " ";
        this.marca = " ";
        this.PagPorMin = 0;
    }
    //Método constructor
    public Impresora(String tipo, String puerto, String marca, int PagPorMin){
        this.tipo = tipo;
        this.puerto = puerto;
        this.marca = marca;
        this.PagPorMin = PagPorMin;
    }
    
    //Set
    public void settipo (String tipo){
        this.tipo = tipo;
    }
    
    public void setpuerto (String puerto){
        this.puerto = puerto;
    }
    
    public void setdimarca (String marca){
        this.marca = marca;
    }
    
    public void setPagPorMin (int PagPorMin){
        this.PagPorMin = PagPorMin;
    }
    
    //Get
    public String gettipo(){
        return this.tipo;
    }
    
    public String getpuerto(){
        return this.puerto;
    }
    
    public String getmarca(){
        return this.marca;
    }
    
    public int getPagPorMin(){
        return this.PagPorMin;
    }
}
