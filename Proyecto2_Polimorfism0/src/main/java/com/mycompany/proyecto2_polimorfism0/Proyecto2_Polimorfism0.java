/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2_polimorfism0;

/**
 *
 * @author laboratorioasu
 */
public class Proyecto2_Polimorfism0 {

    public static void main(String[] args) {
       Animal[] miMascota = new Animal[1];
       
       miMascota[0] = new Perro("fito");
       
       for(Animal an : miMascota){
           System.out.println("Mascota: " + an.getNombre() + "\n" + an.hacerSonido());
       }
    }
}
