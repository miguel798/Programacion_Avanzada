/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_avanzada;

import POO.Fecha;
import POO.Alumno;
import POO.Animal;
import POO.Celular;
import POO.Coche;
import POO.Impresora;
import POO.Laptop;
import POO.Pelota;
import POO.Platillo;
import POO.Profesor;
import POO.Raton;
import POO.Reloj;
import POO.Silla;
import POO.Taza;
import POO.Television;
import Practicas.Alumno1;
import Practicas.Instrumento;
import gui.jFramePrincipalC;
import gui.BorderLayout1;
import gui.FlowLayout1;
import gui.BoxLayout1;
import gui.GridLayout1;
import gui.Posicion_Absoluta;
import java.awt.Color;


/**
 *
 * @author MIGUE
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*//Fecha
        Fecha hoy = new Fecha();
        hoy .setdia(12);
        System.out.println("''Fecha''");
        System.out.println(hoy.getdia());
        System.out.println("\n");
        
        //Alumno
        Alumno alumno1 = new Alumno();
        alumno1.setnombre("Pancho");
        System.out.println("''Alumno'");
        System.out.println(alumno1.getnombre());
        System.out.println("\n");
        
        //Animal
        Animal animal1 = new Animal();
        animal1.settipo("León");
        System.out.println("''Animal''");
        System.out.println(animal1.gettipo());
        System.out.println("\n");
        
        //Celular
        Celular celular1 = new Celular();
        celular1.setcolor("Gris");
        System.out.println("''Celular''");
        System.out.println(celular1.getcolor());
        System.out.println("\n");
        
        //Coche
        Coche coche1 = new Coche();
        coche1.setmarca("BMW");
        System.out.println("''Coche''");
        System.out.println(coche1.getmarca());
        System.out.println("\n");
        
        //Impresora
        Impresora impresora1 = new Impresora();
        impresora1.setPagPorMin(115);
        System.out.println("''Impresora''");
        System.out.println(impresora1.getPagPorMin());
        System.out.println("\n");
        
        //Laptop
        Laptop laptop1 = new Laptop();
        laptop1.setmodelo("HP Pavilon 12");
        System.out.println("''Laptop''");
        System.out.println(laptop1.getmodelo());
        System.out.println("\n");
        
         //Pelota
        Pelota pelota1 = new Pelota();
        pelota1.setdeporte("Soccer");
        System.out.println("''Pelota''");
        System.out.println(pelota1.getdeporte());
        System.out.println("\n");
        
        //Platillo
        Platillo platillo1 = new Platillo();
        platillo1.setprecio(155);
        System.out.println("''Platillo''");
        System.out.println(platillo1.getprecio());
        System.out.println("\n");
        
        //Profesor
        Profesor profesor1 = new Profesor();
        profesor1.setmd("Calculo Vectorial");
        System.out.println("''Profesor''");
        System.out.println(profesor1.getmd());
        System.out.println("\n");
        
        //Raton
        Raton raton1 = new Raton();
        raton1.setnoBotones(5);
        System.out.println("''Raton''");
        System.out.println(raton1.getnoBotones());
        System.out.println("\n");
        
        //Reloj
        Reloj reloj1 = new Reloj();
        reloj1.setmin(59);
        System.out.println("''Reloj''");
        System.out.println(reloj1.getmin());
        System.out.println("\n");
        
        //Silla
        Silla silla1 = new Silla();
        silla1.setpaleta("Si");
        System.out.println("''Silla''");
        System.out.println(silla1.getpaleta());
        System.out.println("\n");
        
        //Taza
        Taza taza1 = new Taza();
        taza1.settamanio("Grande");
        System.out.println("''Taza''");
        System.out.println(taza1.gettamanio());
        System.out.println("\n");
        
        //Television
        Television television1 = new Television();
        television1.setvoltaje(10);
        System.out.println("''Television''");
        System.out.println(television1.getvoltaje());
        System.out.println("\n");*/

        /*Alumno1 juan = new Alumno1();
        juan.setSemestre(8);
        juan.setNombre("Juan Ramiro Maximiliano");
        juan.saluda();*/
        
        /*Alumno1 alumno2 = new Alumno1();
        alumno2.setSemestre(8);
        alumno2.setNombre("Miguel Angel");
        alumno2.setSemestre(2);
        alumno2.setTipo("Guitarra");
        alumno2.saluda("Carlos");*/
        
        
        
        /*jFramePrincipalC aux = new jFramePrincipalC();
        aux.setSize(350, 150);
        aux.setVisible(true);*/
        
        BorderLayout1 aux1 = new BorderLayout1();
        aux1.setTitle("Border Layout");
        aux1.setSize(200, 200);
        aux1.setVisible(true);
        
        FlowLayout1 aux2 = new FlowLayout1();
        aux2.setTitle("Flow Layout");
        aux2.setSize(200,200);
        aux2.setVisible(true);
        
        BoxLayout1 aux3 = new BoxLayout1();
        aux3.setTitle("Box Layout");
        aux3.setSize(200,200);
        aux3.setVisible(true);
        
        GridLayout1 aux4 = new GridLayout1();
        aux4.setTitle("Grid Layout");
        aux4.setSize(200,200);
        aux4.setVisible(true);
        
        Posicion_Absoluta aux5 = new Posicion_Absoluta();
        aux5.setTitle("Posicion Absoluta");
        aux5.setSize(200,200);
        aux5.setVisible(true);
        
        
    }
}
