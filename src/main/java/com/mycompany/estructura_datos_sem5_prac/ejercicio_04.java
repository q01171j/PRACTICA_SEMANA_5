/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem5_prac;

// Ingresar por teclado 10 números en un arreglo y mostrar el numero mayor y el numero menor.

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_04 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int mayor = 0; 
        int menor = 0;
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i+1) + " a evaluar : "); 
            numeros[i] =dato.nextInt();
        }
        
        for(int i = 0; i < numeros.length; i++){
            if(i == 0){
                menor = numeros[i];
                mayor = numeros[i];
            }else if(numeros[i]<menor){
                menor = numeros[i];
            }else if(numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        
        System.out.println(" el numero mayor es " + mayor + " el numero menor es :" +menor); 
    }
}
