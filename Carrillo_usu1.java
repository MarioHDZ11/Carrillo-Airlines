/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carrillo_usu1;

import java.util.Scanner;

/**
 *
 * @author fdo_g
 */
public class Carrillo_usu1 {

    public static void main(String[] args) {
       //ARREGLO PARA GUARDAR LOS DATOS
       //DATA SAVE ARRANGEMENT
        String[] datos = new String[6];
        String[] vari = {"APELLIDO PATERNO", "APELLIDO MATERNO", "NOMBRE/S", "FECHA DE NACIMIENTO", "CORREO", "NÚMERO TELEFÓNICO"};
        
        Scanner captu = new Scanner(System.in);

        // PEDIR DATOS HASTA QUE EL USUARIO DIGA QUE ESTÁN CORRECTOS
        //ASK FOR DATA UNTIL THE USER SAYS IT IS CORRECT
        while (true) {
            for (int i = 0; i < datos.length; i++) {
                System.out.println("CAPTURE SU " + vari[i]);
                datos[i] = captu.nextLine();
            }

            // MOSTRAR LOS DATOS INGRESADOS
            //SHOW THE DATA ENTER
            
            System.out.println("\nSUS DATOS SON:");
            for (int i = 0; i < datos.length; i++) {
                System.out.println("SU " + vari[i] + " ES: " + datos[i]);
            }
            

            System.out.println("\n¿SON CORRECTOS SUS DATOS? (SI/NO)");
            String respuesta = captu.nextLine().toUpperCase();

            if (respuesta.equals("SI")) {
                break; // SALIR DEL CICLO SI LOS DATOS SON CORRECTOS
                       //EXIT CYCLE IF THE DATA ARE CORRECT
            } else {
                System.out.println("\nVOLVAMOS A CAPTURAR SUS DATOS.\n");
            }
        }
        
        System.out.println("REGISTRO FINALIZADO");
}
    }
