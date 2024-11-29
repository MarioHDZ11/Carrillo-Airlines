/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva4_carillo_airlines_equipo1;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA4_CARILLO_AIRLINES_EQUIPO1 {
     //GENERATE A GLOBAL SCANNER
    public final static Scanner cap = new Scanner(System.in);
   //ASSIGN A NAME TO EACH VARIABLE
    public static String DESTINO;
    public static String ORIGEN;
    public static int CLASE; 
    public static String CLASE2; 
    public static int TIPOVUEL; //FLIGHT TYPE
    public static String TIPOVUEL2; //FLIGHT TYPE 2
    public static int TIPOBOL; //TICKET TYPE
    public static String TIPOBOL2; //TICKET TYPE 2
    public static String FECHA; 
    public static final int USUARIO1 = 1; //ASSIGN DATA/POSITIONS CAPTURED BY THE PREVIOUS USER
    //CREATE ARRAYS WITH DATA SUCH AS NUMBER OF PASSENGERS, COUNTRIES, ETC.
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
    //ARREGLO PARA GUARDAR LOS DATOS
       //DATA SAVE ARRANGEMENT
        public static String[] datos = new String[6];
        public static String[] vari = {"APELLIDO PATERNO", "APELLIDO MATERNO", "NOMBRE/S", "FECHA DE NACIMIENTO", "CORREO", "NÚMERO TELEFÓNICO"};
       public static int numps;
       public static int asiento; // SEAT
       public static int numclase; // CLASS NUMBER
       public static int cantasientos; // NUMBER OF SEATS
   
    //Crear asientos en base a las clases
    public static int [] turista;
    public static int [] ejecutiva;
    public static int [] primeraClase;
    public static void main(String[] args) {
        int i=3;
        String capusu,cappws;
        //DECLARE TO CAPTURE USERNAME AND PASSWORD
        //START A LOOP TO ASK FOR USERNAME AND PASSWORD
        //YOU HAVE THREE ATTEMPTS TO ENTER EACH DATA CORRECTLY
        while(i>0){
            System.out.println("USUARIO:");//CAPTURE USER
            capusu=cap.nextLine();
            System.out.println("CONTRASEÑA:");//CAPTURE PASSWORD
            cappws=cap.nextLine();
            //
            if (capusu.equals("USER1")&&cappws.equals("0208")) {//EVALUATE THE INPUT TO VALIDATE IF IT IS CORRECT
                        capturaDatos("BIENVENIDO!!");           //IN .EQUALS DECLARE TE USERS AND PASSWORDS
                        
                        
                    } else if (capusu.equals("USER2")&&cappws.equals("ABCD")) {
                        eleccionDestino("BIENVENIDO!!");  //WITHIN THIS, WE CALL THE METHODS 
                                                          //THAT THE USER HAS ACCESS TO
                       
                    } else if (capusu.equals("USER3")&&cappws.equals("0987")) {
                        capturaDatosCobro("BIENVENIDO!!");
                        
                    } else if (capusu.equals("USER4")&&cappws.equals("0112")) {
                        asignacionBoleto("BIENVENIDO!!");
                        break;
                    } else if (capusu.equals("USER5")&&cappws.equals("9705")) {
                        correccionDatos("BIENVENIDO!!");
                        break;
                    }else {
                        System.out.println("ACESSO DENEGADO");
                    }
                  

            
        }
    }
    public static String capturaDatos(String mensaje){//THIS IS A METHOD TO ACESS USER1
        System.out.println(mensaje);
        // PEDIR DATOS HASTA QUE EL USUARIO DIGA QUE ESTÁN CORRECTOS
        //ASK FOR DATA UNTIL THE USER SAYS IT IS CORRECT
        System.out.println("Cuantos pasajeros viajaran?");
        numps=cap.nextInt();
        System.out.println("DATOS DE QUIEN ESTARA A NOMBRE LOS VUELOS");
         while (true) {
            for (int i = 0; i < datos.length; i++) {
                System.out.println("CAPTURE SU " + vari[i]);
                datos[i] = cap.nextLine();
            }

            // MOSTRAR LOS DATOS INGRESADOS
            //SHOW THE DATA ENTER
            
            System.out.println("\nSUS DATOS SON:");
            for (int i = 0; i < datos.length; i++) {
                System.out.println("SU " + vari[i] + " ES: " + datos[i]);
            }
            

            System.out.println("\n¿SON CORRECTOS SUS DATOS? (SI/NO)");
            String respuesta = cap.nextLine().toUpperCase();

            if (respuesta.equals("SI")) {
                break; // SALIR DEL CICLO SI LOS DATOS SON CORRECTOS
                       //EXIT CYCLE IF THE DATA ARE CORRECT
            } else {
                System.out.println("\nVOLVAMOS A CAPTURAR SUS DATOS.\n");
            }
        }
        
        
        System.out.println("REGISTRO FINALIZADO");
        return mensaje;
    }
    public static String eleccionDestino(String mensaje){//THIS IS A METHOD TO ACESS USER2
        System.out.println(mensaje);
        resaltarRol("Tomar Destino y tipo de viaje");//INSTRUCTION FOR THE OPERATOR
        for(int i = 2; i <= datos.length; i++) {//LOOP THAT WILL CAPTURE "X" NUMBER OF TIMES DEPENDING ON THE NUMBER OF PASSENGERS
            if(USUARIO1 == 1) { //IF THE DATA OF USER 1 IS CORRECT, IT STARTS ASKING
                System.out.println("Pasajero #" + datos[i]);
                tomarLugOrg("Lugar de origen: ");
                tomarDestino("A que destino se dirige el pasajero: " + datos[i] + " ?");
                tomarClase("Que tipo de clase tomara ?");
                tomarVuelo("Que tipo de vuelo tomara ?");
                tomarBoleto("Que tipo de viaje quiere ?");
                tomarFecha("Que fecha sera su vuelo ?");  
                
            }else{ //IF THE DATA OF USER 1 IS NOT CORRECT, DISPLAY AN ALERT MESSAGE
                System.out.println("Error al ingresar al sistema!!!");         
            }
            
            //CHANGE THE NUMERIC VALUES OF THE CLASS TO TEXT
            if(CLASE == 3){
                CLASE2 = "Turista";
            }else if(CLASE == 2){
                CLASE2 = "Ejecutivo";
            }else{
                CLASE2 = "Primera Clase";
            }//CHANGE THE NUMERIC VALUES OF THE FLIGHT TYPE TO TEXT
            if(TIPOVUEL == 1){
                TIPOVUEL2 = "Directo";
            }else{
                TIPOVUEL2 = "Con conexion";
            }//CHANGE THE NUMERIC VALUES OF THE TICKET TYPE TO TEXT
            if(TIPOBOL == 1){
                TIPOBOL2 = "Ida";
            }else{
                TIPOBOL2 = "Ida y vuelta";
            }
            
            
             //PRINT THE COLLECTED DATA
            System.out.println("==================");
            System.out.println(datos[i]);
            System.out.print("Origen:" + ORIGEN + "- ");
            System.out.print("Destino:" + DESTINO + "- ");
            System.out.println("Clase:" + CLASE2 + "- ");
            System.out.print("Vuelo:" + TIPOVUEL2 + "- ");
            System.out.print("Boleto(s):" + TIPOBOL2 + "- ");
            System.out.print("Fecha : " + "(" + FECHA + ")");
            System.out.println("");
            System.out.println("==================");
            break;
        }
        
        return mensaje;
    }
    public static String capturaDatosCobro(String mensaje){//THIS IS A METHOD TO ACESS USER3
        System.out.println(mensaje);
        System.out.println("Datos de las tarjetas registradas:");
        pedirTarjeta();
        return mensaje;
    }
    public static String asignacionBoleto(String mensaje){//THIS IS A METHOD TO ACESS USER4
        System.out.println(mensaje);
        pedirNombre();
        imprimirClases();
       
       asientosClase1();
       asientosClase2();
       asientosClase3();
       seleccionarAsientosPorClase();
        return mensaje; 
    }
    public static String correccionDatos(String mensaje){//THIS IS A METHOD TO ACESS USER5
        String usu;
        Scanner cap = new Scanner(System.in);
        System.out.println("Que accion va realizar?");
        System.out.println("Captura de datos--->USER1");
        System.out.println("Eleccion de destino--->USER2");
        System.out.println("Cobro--->USER3");
        System.out.println("Asignacion de boleto--->USER4");
        usu=cap.nextLine();
                    if (usu.equals("USER1")) {//EVALUATE THE INPUT TO VALIDATE IF IT IS CORRECT
                        capturaDatos("BIENVENIDO!!");//IN .EQUALS DECLARE TE USERS AND PASSWORDS
                        
                    } else if (usu.equals("USER2")) {
                        eleccionDestino("BIENVENIDO!!");//WITHIN THIS, WE CALL THE METHODS 
                                                        //THAT THE USER HAS ACCESS TO
                        
                    } else if (usu.equals("USER3")) {
                        capturaDatosCobro("BIENVENIDO!!");
                        
                    } else if (usu.equals("USER4")) {
                        asignacionBoleto("BIENVENIDO!!");
                        
                    } else if (usu.equals("USER5")) {
                        correccionDatos("BIENVENIDO!!");
                        
                    }
        System.out.println(mensaje);
        return mensaje;
    }
    public static void resaltarRol(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        System.out.println("====================================================Rol: " + mensaje);
    }
    public static String tomarLugOrg(String mensaje){
        while(true){
            System.out.println(mensaje);
            ORIGEN = cap.nextLine();
            for (String pais : PAISES1) {
                if (ORIGEN.equals(pais)) {
                    return ORIGEN;
                }
            }
            System.out.println("No Existe ese pais en el sistema!!!");
        }
    }
    public static String tomarDestino(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        while(true){
            System.out.println(mensaje);
            DESTINO = cap.nextLine();
            for (String pais : PAISES2) {
                if (DESTINO.equals(pais)) {
                    return DESTINO;
                }
            }
            System.out.println("No Existe ese pais en el sistema!!!");
        }
    }
    public static int tomarClase(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        do{//THE DO-WHILE LOOP IS USED TO REPEAT THE QUESTION IF AN INCORRECT NUMBER IS ENTERED
            System.out.println(mensaje);
            System.out.println("1=Primera Clase, 2=Ejecutivo, 3=turista");
            CLASE = cap.nextInt();
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
    public static int tomarVuelo(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        do{
            System.out.println(mensaje);
            System.out.println("1=Directo, 2=Con conexion");
            TIPOVUEL = cap.nextInt();
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
    
    public static int tomarBoleto(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        do{
            System.out.println(mensaje);
            System.out.println("1=Ida, 2=Ida y Vuelta");
            TIPOBOL = cap.nextInt();
            cap.nextLine();
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
    public static String tomarFecha(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        System.out.println(mensaje);
        FECHA = cap.nextLine();
        return FECHA;
    } public static void pedirNombre(){// ASK FOR NAME
        System.out.println("Pasajero"+" "+datos[2]);
        System.out.println("A continuacion un menu con las clases y asientos disponibles:");

    }
    
    public static void imprimirClases(){
        System.out.println("turista:  Asientos disponibles del 1 al 60");
        System.out.println("Clase ejecutiva: Asientos disponibles del 1 al 30"); 
        System.out.println("Primera clase: Asientos disponibles del 1 al 20"); 
        
        
    }
    
    public static void seleccionarAsientosPorClase() {
        if(CLASE==1){
            asientosClase1();
            
        }else if(CLASE==2){
            asientosClase2();
            
        }else if(CLASE==3){
            asientosClase2();
            
        }
    }public static void asientosClase1() {
        
        System.out.println("Has seleccionado Primera Clase.");
        System.out.println("Numeros de asientos a seleccionar:");
        System.out.println(numps);
        if(cantasientos<=numps){
            while(true){
        System.out.println("Cuales asientos desea? del 1-20");
        cantasientos = cap.nextInt();
        cap.nextLine();
        if(cantasientos<=20){
                System.out.println("Los asientos seleccionados fueron: "+cantasientos);
                break;
            }else{
            System.out.println("Asiento no valido escoga otro");
            
        }
         }
  
        }
}
    public static void asientosClase2() {
        System.out.println("Has seleccionado ejecutivo");
        System.out.println("Numeros de asientos a seleccionar:");
        System.out.println(numps);
        if(cantasientos<=numps){
            while(true){
        System.out.println("Cuales asientos desea? del 1-30");
        cantasientos = cap.nextInt();
        cap.nextLine();
        if(cantasientos<=30){
                System.out.println("Los asientos seleccionados fueron: "+cantasientos);
                break;
            }else{
            System.out.println("Asiento no valido escoga otro");
            
        }
         }
    
        }
}public static void asientosClase3() {
        System.out.println("Has seleccionado turista");
        System.out.println("Numeros de asientos a seleccionar:");
        System.out.println(numps);
        if(cantasientos<=numps){
            while(true){
        System.out.println("Cuales asientos desea? del 1-60");
        cantasientos = cap.nextInt();
        cap.nextLine();
        if(cantasientos<=60){
                System.out.println("Los asientos seleccionados fueron: "+cantasientos);
                break;
            }else{
            System.out.println("Asiento no valido escoga otro");
            
        }
         }
    
        }
}public static void pedirTarjeta(){
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