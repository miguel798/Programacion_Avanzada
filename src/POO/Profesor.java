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
    private String nombre;
    private String  apellidos;
    private int  edad;
    private int  matricula;
    private String  md;
    
    //Método constructor por defecto
    public Profesor(){
        this.nombre = " ";
        this.apellidos = " ";
        this.edad = 0;
        this.matricula = 0;
        this.md = " ";
    }
    
    //Método constructor
    public Profesor(String nombre, String apellidos, int edad, int matricula, String md){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.matricula = matricula;
        this.md = md;
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
    
    public void setbmatricula (int matricula){
        this.matricula = matricula;
    }
    
    public void setmd (String md){
        this.md = md;
    }
    
    //Get
    public String getnombre(){
        return this.nombre;
    }
    
    public String getapellidos(){
        return this.apellidos;
    }
    
    public int getedad(){
        return this.edad;
    }
    
    public int getmatricula(){
        return this.matricula;
    }
    
    public String getmd(){
        return this.md;
    }
}
