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
public class Alumno {
    //Tipo de dato / identificadorres
    private String nombre;
    private String  apellidos;
    private int  edad;
    private int  boleta;
    private int  semestre;
    
    //Método constructor por defecto
    public Alumno(){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.boleta = 0;
        this.semestre = 0;
    }
    
    //Método constructor
    public Alumno(String nombre, String apellidos, int edad, int boleta, int semestre){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.boleta = boleta;
        this.semestre = semestre;
    }
    
    //Set
    public void setnombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setapellidos (String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setedad (int edad){
        this.edad = edad;
    }
    
    public void setboleta (int boleta){
        this.boleta = boleta;
    }
    
    public void setsemestre (int semestre){
        this.semestre = semestre;
    }
    
    //Get
    public String getnombre(){
        return this.nombre;
    }
    
    public String getapellidos(){
        return this.apellidos;
    }
    
    public int getanio(){
        return this.edad;
    }
    
    public int getboleta(){
        return this.boleta;
    }
    
    public int getsemestre(){
        return this.semestre;
    }
}
