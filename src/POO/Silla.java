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
public class Silla {
    //Tipo de dato / identificadores
    private String color;
    private String  paleta;
    private String  portalibros;

//Método constructor por defecto
    public Silla(){
        this.color = " ";
        this.paleta = " ";
        this.portalibros = " ";
    }
    //Método constructor
    public Silla(String color, String paleta, String portalibros){
        this.color = color;
        this.paleta = paleta;
        this.portalibros = portalibros;
    }
    
    //Set
    public void setcolor (String color){
        this.color = color;
    }
    
    public void setpaleta (String paleta){
        this.paleta = paleta;
    }
    
    public void setportalibros (String portalibros){
        this.portalibros = portalibros;
    }
    
    //Get
    public String getcolor(){
        return this.color;
    }
    
    public String getpaleta(){
        return this.paleta;
    }
    
    public String getportalibros(){
        return this.portalibros;
    }
}
