/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem5_prac;

// Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra porletra y la suma de sus caracteres.

import java.util.Scanner;


/**
 *
 * @author Adriano
 */
public class ejercicio_05 {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int c=0; 
        
        System.out.println("Escriba una palabra");
        String palabra=dato.nextLine();
        
        char caracteres[]=new char[palabra.length()];
        
        for(int i=0;i<palabra.length();i++){
            c++;
            caracteres[i]=palabra.charAt(i); 
            System.out.println(caracteres[i]);
        }
        System.out.println("la cantidad de caracteres es : "+c);
    }
}
