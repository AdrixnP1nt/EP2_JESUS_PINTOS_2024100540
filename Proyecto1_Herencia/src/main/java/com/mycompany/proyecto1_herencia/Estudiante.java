package com.mycompany.proyecto1_herencia;

/**
 *
 * @author laboratorioasu
 */
public class Estudiante extends Persona {
    private String carrera;
    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("Estudiante: " + nombre + "\nCarrera: " + carrera);
    }
    
}
