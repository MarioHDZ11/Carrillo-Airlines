/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new_proyecto;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class NEW_PROYECTO {
    public static Scanner CAP = new Scanner(System.in); //Scanner global
    public static String pasajero; // PASSENGER
    public static int asiento; // SEAT
    public static int numclase; // CLASS NUMBER
    public static int cantasientos; // NUMBER OF SEATS
   
    //Crear asientos en base a las clases
    public static int [] primeraclase = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                             12 ,13, 14, 15, 16, 17, 18, 19, 20};//1ra clase 20 pasajros
    //THE FIRST CLASS HAS TWENTY SEATS AVAILABLE
    public static int [] claseejecutiva = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                             12 ,13, 14, 15, 16, 17, 18, 19, 20,
                             21, 22, 23, 24, 25, 26, 27, 29, 30};//2da clse 30 pasajeros
    //THE EXECUTIVE CLASS HAS THIRTY SEATS AVAILABLE
    public static int [] claseeconomica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                             12 ,13, 14, 15, 16, 17, 18, 19, 20,
                             21, 22, 23, 24, 25, 26, 27, 29, 30,
                             31, 32, 33, 34, 35, 36, 37, 38, 39,
                             40, 41, 42, 43, 44, 45, 46, 47, 48,
                             49, 50, 51, 52, 53, 54, 55, 56, 57,
                             58, 59, 60}; // 3era clse 60 pasajeros
    //THE ECONOMIC CLASS HAS 60 SEATS AVAILABLE
    public static int [] claseturista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
                             12 ,13, 14, 15, 16, 17, 18, 19, 20,
                             21, 22, 23, 24, 25, 26, 27, 29, 30,
                             31, 32, 33, 34, 35, 36, 37, 38, 39,
                             40, 41, 42, 43, 44, 45, 46, 47, 48,
                             49, 50, 51, 52, 53, 54, 55, 56, 57,
                             58, 59, 60, 61, 62, 63, 64, 65, 66,
                             67, 68, 69, 70, 71, 72, 73, 74, 75,
                             76, 77, 78,}; // 4ta calse 78 pasajeros
    //THE TOURIST CLASS HAS SEVENTY EIGTH SEATS AVAILABLE
        
    public static void main(String[] args) {
        pedirNombre(); // WE CALL THE METOD
        //ASK FOR NAME
        imprimirClases();
        // PRINT CLASSES
        seleccionarAsientosPorClase();
        //SELECT SEATS BY CLASS
    }
    
    public static void pedirNombre(){// ASK FOR NAME
        System.out.print("Hola buen dia, Cual es su nombre?");
        pasajero = CAP.nextLine();
        System.out.println("De acuerdo " + pasajero + ".");
        System.out.println("A continuacion un menu con las clases y asientos disponibles:");

    }
    
    public static void imprimirClases(){
        System.out.println("Primera clase:     Asientos disponibles del 1 al 20");
        System.out.println("Clase ejecutiva:   Asientos disponibles del 1 al 30"); 
        System.out.println("Clase economica P: Asientos disponibles del 1 al 60"); 
        System.out.println("Clase economica:   Asientos disponibles del 1 al 78"); 
        System.out.print("Digite su clase: (en numeros del 1 al 4): ");
        numclase = CAP.nextInt();
        CAP.nextLine();
    }
    
    public static void seleccionarAsientosPorClase() {
        switch (numclase) {
            case 1:
                asientosClase1();
                break;
            case 2:
                asientosClase2();
                break;
            case 3:
                asientosClase3();
                break;
            case 4:
                asientosClase4();
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
    
     public static void mostrarAsientos(int[] clase) {
        System.out.println("Has seleccionado los siguientes asientos:");
        for (int i = 0; i < clase.length; i++) {
            if (clase[i] == -1) {
                System.out.println("Asiento: " + (i + 1));
            }
        }
         System.out.println("Gracias por su preferencia. Vuelva pronto!!!");
    }
    
    public static void asientosClase1() {
        System.out.println("Has seleccionado Primera Clase.");
        // Pedir la cantidad de asientos
        System.out.println("Cuantos asientos desea?");
        cantasientos = CAP.nextInt();
        CAP.nextLine();
        
        while (cantasientos > primeraclase.length || cantasientos <= 0) {
            System.out.println("Estas fuera del rango de la cantidad de asientos, intenta de nuevo. (1 al 20)");
            System.out.println("Cuantos asientos desea?");
            cantasientos = CAP.nextInt();
            CAP.nextLine();
        }
        
        for (int i = 0; i < cantasientos; i++) {
            while (true) {
                System.out.print("Cual seria el asiento numero " + (i + 1) + ": ");
                asiento = CAP.nextInt();
                if (asiento >= 1 && asiento <= 20 && primeraclase[asiento - 1] != -1) {
                    primeraclase[asiento - 1] = -1;
                    break;
                } else if (asiento < 1 || asiento > 20) {
                    System.out.println("Estas fuera del rango, intenta de nuevo.");
                } else {
                    System.out.println("El asiento esta ocupado. Intenta nuevamente.");
                }
            }
        }
        mostrarAsientos(primeraclase);
    }
    
     public static void asientosClase2() {
        System.out.println("Has seleccionado Clase Ejecutiva.");
        // Pedir la cantidad de asientos
        System.out.println("Cuantos asientos desea?");
        cantasientos = CAP.nextInt();
        CAP.nextLine();
        
        while (cantasientos > claseejecutiva.length || cantasientos <= 0) {
            System.out.println("Estas fuera del rango de la cantidad de asientos, intenta de nuevo. (1 al 30)");
            System.out.println("Cuantos asientos desea?");
            cantasientos = CAP.nextInt();
            CAP.nextLine();
        }
        
        for (int i = 0; i < cantasientos; i++) {
            while (true) {
                System.out.print("Cual seria el asiento numero " + (i + 1) + ": ");
                asiento = CAP.nextInt();
                if (asiento >= 1 && asiento <= 30 && claseejecutiva[asiento - 1] != -1) {
                    claseejecutiva[asiento - 1] = -1;
                    break;
                } else if (asiento < 1 || asiento > 30) {
                    System.out.println("Estas fuera del rango, intenta de nuevo.");
                } else {
                    System.out.println("El asiento está ocupado. Intenta nuevamente.");
                }
            }
        }
        mostrarAsientos(claseejecutiva);
    }

      public static void asientosClase3() {
        System.out.println("Has seleccionado Clase Economica.");
        System.out.println("Cuantos asientos desea?");
        cantasientos = CAP.nextInt();
        CAP.nextLine();
        
        while (cantasientos > claseeconomica.length || cantasientos <= 0) {
            System.out.println("Estas fuera del rango de la cantidad de asientos, intenta de nuevo. (1 al 60)");
            System.out.println("Cuantos asientos desea?");
            cantasientos = CAP.nextInt();
            CAP.nextLine();
        }
        
        for (int i = 0; i < cantasientos; i++) {
            while (true) {
                System.out.print("Cual seria el asiento numero " + (i + 1) + ": ");
                asiento = CAP.nextInt();
                if (asiento >= 1 && asiento <= 60 && claseeconomica[asiento - 1] != -1) {
                    claseeconomica[asiento - 1] = -1;
                    break;
                } else if (asiento < 1 || asiento > 60) {
                    System.out.println("Estas fuera del rango, intenta de nuevo.");
                } else {
                    System.out.println("El asiento está ocupado. Intenta nuevamente.");
                }
            }
        }
        mostrarAsientos(claseeconomica);
    }
      
       public static void asientosClase4() {
        System.out.println("Has seleccionado Clase Turista.");
        // Pedir la cantidad de asientos
        System.out.println("Cuantos asientos desea?");
        cantasientos = CAP.nextInt();
        CAP.nextLine();
        
        while (cantasientos > claseturista.length || cantasientos <= 0) {
            System.out.println("Estas fuera del rango de la cantidad de asientos, intenta de nuevo. (1 al 78)");
            System.out.println("Cuantos asientos desea?");
            cantasientos = CAP.nextInt();
            CAP.nextLine();
        }
        
        for (int i = 0; i < cantasientos; i++) {
            while (true) {
                System.out.print("Cual seria el asiento numero " + (i + 1) + ": ");
                asiento = CAP.nextInt();
                if (asiento >= 1 && asiento <= 78 && claseturista[asiento - 1] != -1) {
                    claseturista[asiento - 1] = -1;
                    break;
                } else if (asiento < 1 || asiento > 78) {
                    System.out.println("Estas fuera del rango, intenta de nuevo.");
                } else {
                    System.out.println("El asiento esta ocupado. Intenta nuevamente.");
                }
            }
        }
        mostrarAsientos(claseturista);
    }
            
}
