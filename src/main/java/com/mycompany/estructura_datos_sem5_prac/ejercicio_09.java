/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem5_prac;

// En un certamen de atletismo se desea implementar un control para almacenar el 
// tiempo de cada corredor y además determinar por los datos obtenidos en los 
// tiempos de los corredores cual es el ganador. Se debe especificar cuantos atletas van a participar.

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_09 {
    public static void main(String args[]) {
        Scanner dato = new Scanner(System.in);
        int c=0; 
        float ganador = 0;
        float perdedor = 0;
        String nombreGanador = null;
        System.out.print("Ingrese la Cantidad de atletas : ");
        c = dato.nextInt(); 
        String atleta[] = new String[c];
        float tiempo[] = new float[c];
        for(int a = 0; a < atleta.length; a++){
            System.out.print("Ingrese el Nombre del atleta : ");
            atleta[a] = dato.next();
            System.out.print("Ingrese el Tiempo del recorrido : ");
            tiempo[a] = dato.nextFloat();
        }
        
        for (int i = 0; i < tiempo.length; i++) {
            if(i==0){
                perdedor = tiempo[i];
                ganador = tiempo[i];
            }else if(tiempo[i]<perdedor){
                perdedor = tiempo[i];
            }else if(tiempo[i]>ganador){
                ganador = tiempo[i];
                nombreGanador = atleta[i];
            }
        }
        
        System.out.println("================================");
        System.out.println(nombreGanador+" es el ganador con "+perdedor);
    }
}
