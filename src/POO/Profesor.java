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
public class Profesor {
    //Tipo de dato / identificadorres
    String nombre;
    String  apellidos;
    public int  edad;
    public int  matricula;
    String  materia_docencia;
    
    //Metodo constructor
    public Profesor(){
        this.nombre = " ";
        this.apellidos = " ";
        this.edad = 0;
        this.matricula = 0;
        this.materia_docencia = " ";
    }
    public Profesor(String nombre, String apellidos, int edad, int matricula, String materia_docencia){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.matricula = matricula;
        this.materia_docencia = materia_docencia;
    }
}
