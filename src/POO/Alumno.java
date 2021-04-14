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
    public String nombre;
    public String  apellidos;
    public int  edad;
    public int  boleta;
    public int  semestre;
    
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
}
