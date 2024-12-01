package carrillo_airlines;

import java.util.Scanner;

public class Carrillo_Airlines {
    //GENERATE A GLOBAL SCANNER
    public final static Scanner cap = new Scanner(System.in);
    
    //DESTINE VARIABLES 
    public static String DESTINO;
    public static String ORIGEN;
    public static int CLASE; 
    public static String CLASE2;          //CLASS TYPE
    public static int TIPOVUEL;           //FLIGHT TYPE
    public static String TIPOVUEL2;       //FLIGHT TYPE 2
    public static int TIPOBOL;            //TICKET TYPE
    public static String TIPOBOL2;        //TICKET TYPE 2
        // ARRAY OF COUNTRYES 
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
    
    //PASSAGERS DATA VARIABLES
    public static int numps;
        //ARRAYS DATA PASSAGERS
    public static String[] DATOS = new String[4];
    public static String[] VARI = {"\nAPELLIDOS: ", "\nNOMBRE/S: ", "\nCORREO: ", "\nNÚMERO TELEFÓNICO: "};
    
    //SEAT ASSIGNAMENTS VARIABLES
        //MATRIX OF SEATS
    public static String PRIMCLAS[][] = new String[2][12];
    static {
        int asientosA = 1;
        for (int i = 0; i < PRIMCLAS.length; i++) {
            for (int j = 0; j < PRIMCLAS[i].length; j++) { 
                if (asientosA < 10) {
                    PRIMCLAS[i][j] = "A0" + asientosA;
                } else {
                    PRIMCLAS[i][j] = "A" + asientosA;
                }
                asientosA++;
            }
        }
    }
    public static String EJECUTIV[][] = new String[4][16];
    static {
        int asientosB = 1;
        for(int i = 0; i < EJECUTIV.length; i++) {
            for(int j = 0; j < EJECUTIV[i].length; j++) { 
                if (asientosB < 10) {
                    EJECUTIV[i][j] = "B0" + asientosB;
                } else {
                    EJECUTIV[i][j] = "B" + asientosB;
                }
                asientosB++;
            }
        }
    }
    public static String TURISTA[][] = new String[4][23];
        static {
        int asientosC = 1;
        for(int i = 0; i < TURISTA.length; i++) {
            for(int j = 0; j < TURISTA[i].length; j++) { 
                if (asientosC < 10) {
                    TURISTA[i][j] = "C0" + asientosC;
                } else {
                    TURISTA[i][j] = "C" + asientosC;
                }
                asientosC++;
            }
        }
    }
        
    //PAYMENT VARIABLES
    public static double PRECIO = 1000;
            
    public static void main(String[] args) {
        //declare start menu
        int inicio = 0;
        
        System.out.println("\n============================BIENVENIDO A CARRILLO AIRLINES============================");

        int k = -1;
        while((k<0) || (k>1)){
            System.out.println("");
            System.out.println("\nIniciar (Presione 1)");
            System.out.println("");
            System.out.println("\nSalir   (Presione 0)");
            inicio = cap.nextInt();
            cap.nextLine();
            switch (inicio) {
                case 1:
                    k=1;
                    break;
                case 0:
                    k=0;
                    break;  
                default:
                    System.out.println("\nNÚMERO INVALIDO");
                    break;
            }
        }
        String capusu,cappws;
        //DECLARE TO CAPTURE USERNAME AND PASSWORD
        //START A LOOP TO ASK FOR USERNAME AND PASSWORD
        //YOU HAVE THREE ATTEMPTS TO ENTER EACH DATA CORRECTLY
        while(k==1){
            System.out.println("\n=====================================USUARIOS=====================================");
            System.out.println("MOSTRAR LISTA DE USUARIOS   (Presione 3)");
            System.out.println("USUARIO:");//CAPTURE USER
            capusu=cap.nextLine();
            if(!(capusu.equals("3"))){
            System.out.println("CONTRASEÑA:");//CAPTURE PASSWORD
            cappws=cap.nextLine();
            
            if (capusu.equals("USER1")&&cappws.equals("1234")) {         //EVALUATE THE INPUT TO VALIDATE IF IT IS CORRECT
                eleccionDestino("BIENVENIDO!!");                         //IN .EQUALS DECLARE TE USERS AND PASSWORDS
            } else if (capusu.equals("USER2")&&cappws.equals("1234")) {
                capturaDatos("BIENVENIDO!!");                            //WITHIN THIS, WE CALL THE METHODS 
            } else if (capusu.equals("USER3")&&cappws.equals("1234")) {
                asignacionAsientos("BIEVENIDO!!");
            } else if (capusu.equals("USER4")&&cappws.equals("1234")) {
                capturaDatosCobro("BIENVENIDO!!");
            } else if (capusu.equals("USER5")&&cappws.equals("1234")) {
                correccionDatos("BIENVENIDO!!");
                break;
            }else{
                System.out.println("ACESSO DENEGADO");
            }
            }else{
                mostrarUSU();
            }
        }
    }
    //METHOD FOR USER1
    public static String eleccionDestino(String mensaje){//THIS IS A METHOD TO ACESS USER1
        System.out.println(mensaje);
        System.out.println("USER1:=================================ROL:Tomar el viaje del pasajero");
        tomarLugOrg("Lugar de origen: ");
        tomarDestino("A que destino se dirige el pasajero?");
        tomarClase("Que tipo de clase tomara ?");
        tomarVuelo("Que tipo de vuelo tomara ?");
        tomarBoleto("Que tipo de viaje quiere ?");
            

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
            System.out.println("============VIAJE============");
            System.out.print("Origen:" + ORIGEN + "- ");
            System.out.print("Destino:" + DESTINO + "- ");
            System.out.println("Clase:" + CLASE2 + "- ");
            System.out.print("Vuelo:" + TIPOVUEL2 + "- ");
            System.out.print("Boleto(s):" + TIPOBOL2);
            System.out.println("");
            System.out.println("=============================");
            
        return mensaje;
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
    //METHOD FOR USER2
    public static String capturaDatos(String mensaje){//THIS IS A METHOD TO ACESS USER1
        System.out.println(mensaje);
        System.out.println("Cuantos pasajeros viajaran?");
        numps=cap.nextInt();
        cap.nextLine();
        for (int pasajeros = 1; pasajeros <=numps; pasajeros++) {
            while (true) {
                System.out.println("Capturando datos para pasajero # "+ pasajeros);
                for (int i = 0; i < DATOS.length; i++) {
                    System.out.print("Capture " + VARI[i]);
                    DATOS[i] = cap.nextLine();
                }
                // MOSTRAR LOS DATOS INGRESADOS
                //SHOW THE DATA ENTER
                System.out.println("\nSUS DATOS SON:");
                for (int i = 0; i < DATOS.length; i++) {
                    //PRINT THE COLLECTED DATA
                    System.out.println("============REGISTRO============");
                    System.out.println("SU " + VARI[i] + " ES: " + DATOS[i]);
                    System.out.println("================================");
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
        }
        return mensaje;
    }
    //METHOD FOR USER3
    public static String asignacionAsientos(String mensaje){
        System.out.println(mensaje);
        
        return mensaje;
    }
    //METHOD FOR USER4
    public static String capturaDatosCobro(String mensaje){
        System.out.println(mensaje);
        System.out.println("USER4:=================================ROL:Tomar datos de cobro");
        pedirTarjeta();
        return mensaje;
    }
    public static void pedirTarjeta(){
        System.out.print("Numero de tarjeta: ");
        String NumeroT = cap.nextLine();   
        System.out.print("Nombre del titular: ");
        String Titular = cap.nextLine();
        System.out.print("Fecha de vencimiento (MM/AA): ");
        String Fecha = cap.nextLine();
        System.out.print("CVV: ");
        String Cvv= cap.nextLine();
        System.out.println("Datos de las tarjetas registradas:");
        
        String ult4 = ""; 
        
        if(NumeroT.length() < 16 || Cvv.length() != 3) {
            System.out.println("Datos de la tarjeta inválidos. Por favor, intente nuevamente.");
        }else{
            System.out.println("\nPago realizado exitosamente con tarjeta.");
            System.out.println("Titular: " + Titular);
            for (int i = NumeroT.length() - 4; i < NumeroT.length(); i++) {
                ult4 += NumeroT.charAt(i);
            }
        System.out.println("============PAGO============");
        System.out.println("Tarjeta");
        System.out.println("Numero de tarjeta: **** **** **** " + ult4);
        System.out.println("  Nombre: " + Titular);
        System.out.print("  Vencimiento: " + Fecha);
        System.out.println("  CVV: " + Cvv);
        System.out.println("total cobrado: $" + PRECIO);
        System.out.println("============================");
        }
    }
    //METHOD FOR USER5
    public static String correccionDatos(String mensaje){//THIS IS A METHOD TO ACESS USER5
        String usu;
        Scanner cap = new Scanner(System.in);
        System.out.println("Que accion va realizar?");
        System.out.println("Tomar el viaje----------------->USER1");
        System.out.println("Tomar los datos---------------->USER2");
        System.out.println("Tomar los asientos------------->USER3");
        System.out.println("Tomar el metodo de pago-------->USER4");
        usu=cap.nextLine();
                    if (usu.equals("USER1")) {
                    } else if (usu.equals("USER2")) { 
                    } else if (usu.equals("USER3")) {  
                    } else if (usu.equals("USER4")) {   
                    } else if (usu.equals("USER5")) {    
                    }
        System.out.println(mensaje);
        return mensaje;
         }
    public static void mostrarUSU(){
        System.out.println("==============LISTA DE USUARIOS=============");
        System.out.println("USER1 : Tomar el viaje del pasajero ");
        System.out.println("USER2 : Tomar los datos del pasajero");
        System.out.println("USER3 : Tomar los asientos pasajero");
        System.out.println("USER4 : Tomar el metodo de pago del pasajero");
        System.out.println("USER5 : Administrador");
    }
}