/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

// Empleando arreglos, mostrar n productos con sus respectivos precios.

package com.mycompany.estructura_datos_sem5_prac;

/**
 *
 * @author Adriano
 */
public class ejercicio_01 {
    public static void main(String[] args) {
        String utiles []={"pelota", "zapatilla","mochila","polo"};
        double precios[]={35.5,89.60,45.99,25.70};
        System.out.println("Lista de Productos y sus precios");
        for (int u=0;u<utiles.length;u++){
            System.out.println(utiles[u]+ " "+ precios[u]);
        }
    }
}
