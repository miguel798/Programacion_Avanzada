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
    String nombre;
    String  apellidos;
    public int  edad;
    public int  boleta;
    public int  semestre;
    
    //Metodo constructor
    public Alumno(){
        this.nombre = "Miguel";
        this.apellidos = "Rocha";
        this.edad = 18;
        this.boleta = 2021670044;
        this.semestre = 2;
    }
    public Alumno(String nombre, String apellidos, int edad, int boleta, int semestre){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.boleta = boleta;
        this.semestre = semestre;
    }
}
