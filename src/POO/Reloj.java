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
public class Reloj {
    //Tipo de dato / identificadores
    private int hora;
    private int min;
    private int seg;
    
    //Método constructor por defecto
    public Reloj(){
        this.hora = 10;
        this.min = 04;
        this.seg = 2000;
        
    }
    
//Método constructor
    public Reloj(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
    
    //Set
    public void sethora (int hora){
        this.hora = hora;
    }
    
    public void setmin (int min){
        this.min = min;
    }
    
    public void setseg (int seg){
        this.seg = seg;
    }
    
    //Get
    public int gethora(){
        return this.hora;
    }
    
    public int getmin(){
        return this.min;
    }
    
    public int getseg(){
        return this.seg;
    }
}
