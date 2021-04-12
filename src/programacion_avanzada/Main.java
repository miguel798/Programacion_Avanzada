/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_avanzada;

import POO.Fecha;
import POO.Alumno;
import POO.Animal;

/**
 *
 * @author MIGUE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha hoy = new Fecha(29, 7, 1987);
        Fecha ayer = new Fecha();
        ayer.anio = 1987;
        Alumno alumno1 = new Alumno("Juan", "Solis", 19, 2021670045, 5);
        Animal animal1 = new Animal("Betobeen", "Gato", "Na", 5, 25);
        System.out.println("Hola Mundo");
    }
    
}
