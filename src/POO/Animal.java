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
    String nombre;
    String tipo;
    String raza;
    public int  edad;
    public double  peso;
    
    //Metodo constructor
    public Animal(){
        this.nombre = "Marcianito";
        this.tipo = "Perro";
        this.raza = "Salchicha";
        this.edad = 10;
        this.peso = 85;
    }
    public Animal(String nombre, String tipo, String raza, int edad, double peso){
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
    }
} 
