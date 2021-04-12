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
        this.nombre = "Leonardo";
        this.apellidos = "Aguilar";
        this.edad = 35;
        this.matricula = 2007670044;
        this.materia_docencia = "Calculo Diferencial";
    }
    public Profesor(String nombre, String apellidos, int edad, int matricula, String materia_docencia){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.matricula = matricula;
        this.materia_docencia = materia_docencia;
    }
}
