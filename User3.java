/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user3;

import java.util.Scanner;

/**
 *
 * @author elfor
 */
public class User3 {

    public static void main(String[] args) {
        
        
        
        
        System.out.println("Datos de las tarjetas registradas:");
        pedirTarjeta();
            
        // Cada tarjeta tiene 4 campos: Número, Nombre, Fecha de vencimiento, CVV
        // Mostrar los datos registrados
      
    }
    public static void pedirTarjeta(){
            Scanner captu = new Scanner(System.in);
            
            System.out.print("Número de tarjeta: ");
            String NumeroT = captu.nextLine();   
            System.out.print("Nombre del titular: ");
            String Titular = captu.nextLine();
            System.out.print("Fecha de vencimiento (MM/AA): ");
            String Fecha = captu.nextLine();
            System.out.print("CVV: ");
            String Cvv= captu.nextLine();
            
            System.out.println("Datos de las tarjetas registradas:");
        
            System.out.println("Tarjeta");
            System.out.println("  Número: " + NumeroT );
            System.out.println("  Nombre: " + Titular);
            System.out.println("  Vencimiento: " + Fecha);
            System.out.println("  CVV: " + Cvv);
            
            
            
    }

    
}
