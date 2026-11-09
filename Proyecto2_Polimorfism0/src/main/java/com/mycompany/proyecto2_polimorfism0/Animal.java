/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_polimorfism0;

/**
 *
 * @author laboratorioasu
 */
public abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

   
    public abstract String hacerSonido();
}
