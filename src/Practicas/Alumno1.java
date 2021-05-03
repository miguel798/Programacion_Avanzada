/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

/**
 *
 * @author working
 */
public class Alumno1 extends Persona {
    
   
    private int semestre;

    // constructor por defecto
    public Alumno1() {
        super();
        semestre = 0;
    }

    public Alumno1(int semestre, String nombre, int edad, String dom, String sexo, String tipo) {
        super(nombre, edad, dom, sexo, tipo);
        this.semestre = semestre;
    }
    
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }  
    
    public void saluda(){
        System.out.println("Hola!, mi nombre es "+super.getNombre()+", soy alumno de "+semestre+" semestre y toco la "+super.getTipo());
    }
}