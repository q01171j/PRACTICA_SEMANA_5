/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem5_prac;

// Ingresar por teclado 5 notas y mostrar el promedio.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_07 {
    public static void main(String args[]) {
        Scanner dato=new Scanner(System.in);
        float notas[]=new float[5]; 
        int i=0;
        float promedio,sum=0;
        
        while(i < notas.length) {
            System.out.print("Ingrese la " + (i+1) + "° nota : "); 
            notas[i]=dato.nextFloat();
            sum += notas[i]; 
            i++;
        }
        
        promedio=sum/notas.length;
        
        System.out.println("Su promedio es : " + promedio);
    }
}
