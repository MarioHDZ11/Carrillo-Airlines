/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_arreglos;

import java.util.Scanner;


/**
 *
 * @author user
 */
public class carrillo_us1. {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARREGLO PARA GUARDAR LOS DATOS
        String[] datos = new String[6];
        String[] vari = {"APELLIDO PATERNO", "APELLIDO MATERNO", "NOMBRE/S", "FECHA DE NACIMIENTO", "CORREO", "NÚMERO TELEFÓNICO"};
        
        Scanner captu = new Scanner(System.in);

        // PEDIR DATOS HASTA QUE EL USUARIO DIGA QUE ESTÁN CORRECTOS
        while (true) {
            for (int i = 0; i < datos.length; i++) {
                System.out.println("CAPTURE SU " + vari[i]);
                datos[i] = captu.nextLine();
            }

            // MOSTRAR LOS DATOS INGRESADOS
            
            System.out.println("\nSUS DATOS SON:");
            for (int i = 0; i < datos.length; i++) {
                System.out.println("SU " + vari[i] + " ES: " + datos[i]);
            }
            

            System.out.println("\n¿SON CORRECTOS SUS DATOS? (SI/NO)");
            String respuesta = captu.nextLine().toUpperCase();

            if (respuesta.equals("SI")) {
                break; // SALIR DEL CICLO SI LOS DATOS SON CORRECTOS
            } else {
                System.out.println("\nVOLVAMOS A CAPTURAR SUS DATOS.\n");
            }
        }
        
        System.out.println("REGISTRO FINALIZADO");
}
    }