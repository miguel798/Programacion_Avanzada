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
public class Animal {
    //Tipo de dato / identificadorres
    public String nombre;
    public String tipo;
    public String raza;
    public int  edad;
    public double  peso;
    
    //Método constructor por defecto
    public Animal(){
        this.nombre = " ";
        this.tipo = " ";
        this.raza = " ";
        this.edad = 0;
        this.peso = 0;
    }
    
    //Método constructor
    public Animal(String nombre, String tipo, String raza, int edad, double peso){
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }
} 
