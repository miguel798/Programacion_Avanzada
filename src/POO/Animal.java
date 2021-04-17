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
    private String nombre;
    private String tipo;
    private String raza;
    private int  edad;
    private double  peso;
    
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
    
    //Set
    public void setnombre (String nombre){
        this.nombre = nombre;
    }

    public void settipo (String tipo){
        this.tipo = tipo;
    }

    public void setaraza (String raza){
        this.raza = raza;
    }

    public void setedad (int edad){
        this.edad = edad;
    }

    public void setpeso (double peso){
        this.peso = peso;
    }
    
    //Get
    public String getnombre(){
        return this.nombre;
    }

    public String gettipo(){
        return this.tipo;
    }
    
    public String getraza(){
        return this.raza;
    }

    public int getedad(){
        return this.edad;
    }

    public double getpeso(){
        return this.peso;
    }
} 
