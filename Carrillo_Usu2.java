/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carrillo_usu2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Carrillo_Usu2 {

    //Generar un Scanner Global
    public final static Scanner CAP = new Scanner(System.in);
    //Dar Nombre a cada Variable
    public static String DESTINO;
    public static String ORIGEN;
    public static int CLASE; 
    public static String CLASE2; 
    public static int TIPOVUEL; //Tipo de vuelo
    public static String TIPOVUEL2; //Tipo de vuelo 2
    public static int TIPOBOL; //Tipo de boleto
    public static String TIPOBOL2; //Tipo de boleto 2
    public static String FECHA; 
    public static final int USUARIO1 = 1; //Poner datos que capturo el usuario anterior
    //crear arreglos con los datos de numero de pasajeros, paises, etc.
    public static final String[] PASAJ = {"Pedro", "Juan"};
    public static final String[] PAISES1 = {
        "Alemania", "Argentina", "Australia", "Austria", "Belgica", 
        "Canada", "Chile", "China", "Colombia", "Corea del Sur", 
        "Croacia", "Dinamarca", "Ecuador", "Egipto", "España", 
        "Estados Unidos", "Filipinas", "Finlandia", "Francia", "Grecia",
        "Holanda", "Hungria", "India", "Indonesia", "Irlanda", 
        "Israel", "Italia", "Japon", "Mexico" };
    public static final String[] PAISES2 = {
        "Alemania", "Argentina", "Australia", "Austria", "Belgica", 
        "Canada", "Chile", "China", "Colombia", "Corea del Sur", 
        "Croacia", "Dinamarca", "Ecuador", "Egipto", "España", 
        "Estados Unidos", "Filipinas", "Finlandia", "Francia", "Grecia",
        "Holanda", "Hungria", "India", "Indonesia", "Irlanda", 
        "Israel", "Italia", "Japon", "Mexico" };
    
    public static void main(String[] args) {
        
        //Iniciar la toma de datos
        resaltarRol("Tomar Destino y tipo de viaje");//Instruccion para el operador
        for(int i = 0; i <= PASAJ.length; i++) {//ciclo que capturara "x" numero de veces dependiendo la cantidad de pasajeros
            if(USUARIO1 == 1) { // Si los datos del usuario 1 estan bien comienza a preguntar
                System.out.println("Pasajero #" + PASAJ[i]);
                tomarLugOrg("Lugar de origen: ");
                tomarDestino("A que destino se dirige el pasajero: " + PASAJ[i] + " ?");
                tomarClase("Que tipo de clase tomara ?");
                tomarVuelo("Que tipo de vuelo tomara ?");
                tomarBoleto("Que tipo de viaje quiere ?");
                tomarFecha("Que fecha sera su vuelo ?");  
                
            }else{ // Si los datos del usuario 1 NO estan bien salta mensaje de alerta
                System.out.println("Error al ingresar al sistema!!!");         
            }
            
            //cambiar los valores numericos de clase a texto
            if(CLASE == 1){
                CLASE2 = "Turista";
            }else if(CLASE == 2){
                CLASE2 = "Ejecutivo";
            }else{
                CLASE2 = "Primera Clase";
            }//cambiar los valores numericos del tipo de vuelo a texto
            if(TIPOVUEL == 1){
                TIPOVUEL2 = "Directo";
            }else{
                TIPOVUEL2 = "Con conexion";
            }//cambiar los valores numericos del tipo de boleto a texto
            if(TIPOBOL == 1){
                TIPOBOL2 = "Ida";
            }else{
                TIPOBOL2 = "Ida y vuelta";
            }
            
            //Imprimir los datos tomados
            System.out.println("==================");
            System.out.println(PASAJ[i]);
            System.out.print("Origen:" + ORIGEN + "- ");
            System.out.print("Destino:" + DESTINO + "- ");
            System.out.println("Clase:" + CLASE2 + "- ");
            System.out.print("Vuelo:" + TIPOVUEL2 + "- ");
            System.out.print("Boleto(s):" + TIPOBOL2 + "- ");
            System.out.print("Fecha : " + "(" + FECHA + ")");
            System.out.println("");
            System.out.println("==================");
        }
    }
    public static void resaltarRol(String mensaje){
        System.out.println("====================================================Rol: " + mensaje);
    }
    public static String tomarLugOrg(String mensaje){
        while(true){
            System.out.println(mensaje);
            ORIGEN = CAP.nextLine();
            for (String pais : PAISES1) {
                if (ORIGEN.equals(pais)) {
                    return ORIGEN;
                }
            }
            System.out.println("No Existe ese pais en el sistema!!!");
        }
    }
    public static String tomarDestino(String mensaje){
        while(true){
            System.out.println(mensaje);
            DESTINO = CAP.nextLine();
            for (String pais : PAISES2) {
                if (DESTINO.equals(pais)) {
                    return DESTINO;
                }
            }
            System.out.println("No Existe ese pais en el sistema!!!");
        }
    }
    public static int tomarClase(String mensaje){
        do{// el do while es para que si un numero es ingresado incorrectamente repita la pregunta
            System.out.println(mensaje);
            System.out.println("1=turista, 2=Ejecutivo, 3=Primera clase");
            CLASE = CAP.nextInt();
            switch (CLASE) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    System.out.println("Tipo de clase NO Valida!!!");
                    break;
            }
        }while(!(CLASE == 1) || (CLASE == 2) || (CLASE == 3));
        return -1;
    }               
    public static int tomarVuelo(String mensaje){
        do{
            System.out.println(mensaje);
            System.out.println("1=Directo, 2=Con conexion");
            TIPOVUEL = CAP.nextInt();
            switch (TIPOVUEL) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    System.out.println("No Existen vuelos a ese pais!!!");
                    break;
            }
        }while(!(TIPOVUEL == 1) || (TIPOVUEL == 2));
            return -1;
    }
    
    public static int tomarBoleto(String mensaje){
        do{
            System.out.println(mensaje);
            System.out.println("1=Ida, 2=Ida y Vuelta");
            TIPOBOL = CAP.nextInt();
            CAP.nextLine();
            switch (TIPOBOL) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    System.out.println("Tipo de boleto NO Valido!!!");
                    break;
            }
        }while(!(TIPOBOL == 1) || (TIPOBOL == 2));
            return -1;
    }
    public static String tomarFecha(String mensaje){
        System.out.println(mensaje);
        FECHA = CAP.nextLine();
        return FECHA;
    }             
}