/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_polimorfism0;

/**
 *
 * @author laboratorioasu
 */
public class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return nombre + " dice: Guau!";
    }
}
