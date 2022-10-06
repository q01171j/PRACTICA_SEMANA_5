/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem5_prac;

// Ingresar por teclado n cantidad de números y ordenarlos en forma ascendente.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la Cantidad de numeros : ");
        int elementos = dato.nextInt();
        int[] n = new int[elementos];
        System.out.println("Ingrese números a ordenar ");
        for(int a = 0; a < n.length; a++) {
            n[a] = dato.nextInt();
        }
        
        int orden = 0;
        
        for(int i = 1; i < n.length; i++) {
            for(int j = 0; j < n.length - i; j++) {
                if(n[j] > n[j+1]) {
                    orden = n[j];
                    n[j] = n[j+1]; n[j+1] = orden;
                } 
            }
        }
        
        for(int i = 0; i <n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
