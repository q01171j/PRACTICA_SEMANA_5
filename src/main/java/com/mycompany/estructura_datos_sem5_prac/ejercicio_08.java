/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem5_prac;

// Un cliente realiza la siguiente compra de artefactos, plancha,licuadora, 
// lavadora y cocina, si la compra supera los 1200, recibe un descuentode 17 %,
// mostrar el precio de cada artefacto, así como el monto, el descuento y el pago total si le corresponde un descuento.

/**
 *
 * @author Adriano
 */
public class ejercicio_08 {
    public static void main(String[] args) {
        String Producto [] = {"Plancha", "Licuadora","Lavadora","Cocina"};
        int Precio [] = {120,300,2400,1600};
        int sumTotal = 0;
        double desc;
        double pagoFinal;
        
        System.out.println("Producto \tPrecio ");
        System.out.println("-------- \t------");
        for(int i = 0; i < Producto.length;i++){
            System.out.println(Producto[i]+"\t"+Precio[i]);
            
            sumTotal += Precio[i];
        }
        
        if(sumTotal > 1200){
            desc = sumTotal * 0.17;
            pagoFinal = sumTotal + desc;
        }else{
            pagoFinal = sumTotal;
        }
        
        System.out.println("-------------------------");
        System.out.println("El pago Total es : "+pagoFinal);
        
    }
}
