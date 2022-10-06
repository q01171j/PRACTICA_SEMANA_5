/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem5_prac;

// Ingresar 10 números enteros y mostrar los números pares.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_06 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int par[]=new int[10];
        int valor[]=new int[10];
        int contador=0;
        int i;
        
        System.out.println("Ingrese los 10 números a evaluar");
        
        for( i=0;i<10;i++){
            par[i]=dato.nextInt();
            if(par[i]%2==0) {
                valor[contador]=par[i];
                contador++;
            }
        }
        
        System.out.println("los numeros pares son : " );
        
        for( i=0;i<contador;i++) {
            System.out.println(valor[i]);
        }
    }
}
