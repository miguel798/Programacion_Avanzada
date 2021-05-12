/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;
import Practicas.Instrumento;

/**
 *
 * @author working
 */
public class Persona  extends Instrumento{
         
    private String nombre;
    private int edad;
    private String dom;
    private String sexo;

    public Persona() {
        super();
        this.nombre ="";
        this.edad = 0;
        this.dom ="desconocido";
        this.sexo = "";
    }
    
    public Persona(String nombre, int edad, String dom, String sexo, String tipo) {
        super(tipo);
        this.nombre = nombre;
        this.edad = edad;
        this.dom = dom;
        this.sexo = sexo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDom() {
        return dom;
    }
    
    public void setDom(String dom) {
        this.dom = dom;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    } 
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo (String tipo) {
        this.tipo = tipo;
    }  
    
    public void saluda(){
        System.out.println("Hola!, mi nombre es "+this.nombre+" y toco la "+super.getTipo());
    }
    
    public void saluda(String persona){
         System.out.println("Hola "+persona+"!, mi nombre es "+this.nombre+" y toco la "+super.getTipo());
    }
}
