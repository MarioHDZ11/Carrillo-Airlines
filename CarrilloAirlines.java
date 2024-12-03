
package carrilloairlines;

import java.util.Scanner;


public class CarrilloAirlines {
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
    public static String EMAIL;
    public static String TELEF;
        //ARRAYS DATA PASSAGERS
    public static String[] DATOS = new String[4];
    public static String[] APELL;
    public static String[] NOMBR;
    
    
    //SEAT ASSIGNAMENTS VARIABLES
        //MATRIX OF SEATS
    public static String PRIMCLAS[][] = new String[1][20];
    static{
        int asientosA = 1;
        for(int i = 0; i < PRIMCLAS.length; i++){
            for(int j = 0; j < PRIMCLAS[i].length; j++){ 
                if(asientosA < 10) {
                    PRIMCLAS[i][j] = "A0" + asientosA;
                }else{
                    PRIMCLAS[i][j] = "A" + asientosA;
                }
                asientosA++;
            }
        }
    }
    public static String EJECUTIV[][] = new String[3][20];
    static{
        int asientosB = 1;
        for(int i = 0; i < EJECUTIV.length; i++){
            for(int j = 0; j < EJECUTIV[i].length; j++){ 
                if(asientosB < 10){
                    EJECUTIV[i][j] = "B0" + asientosB;
                }else{
                    EJECUTIV[i][j] = "B" + asientosB;
                }
                asientosB++;
            }
        }
    } 
    public static String TURISTA[][] = new String[3][30];
        static{
        int asientosC = 1;
        for(int i = 0; i < TURISTA.length; i++){
            for(int j = 0; j < TURISTA[i].length; j++){ 
                if(asientosC < 10){
                    TURISTA[i][j] = "C0" + asientosC;
                }else{
                    TURISTA[i][j] = "C" + asientosC;
                }
                asientosC++;
            }
        }
    }
    public static String[] asiento;
        
    //PAYMENT VARIABLES
    public static double PRECIOCLASE1 = 2000,PRECIOCLASE2=1000,PRECIOCLASE3=500;//FIXED PRICE FOR EACH CLASS
    public static String ULT4 = "";
    public static String TITULAR;
    public static String NumeroT;
    public static String Cvv;
            
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
                    System.out.println("NUMERO INVALIDO");
                    break;
            }
        }
        String capusu,cappws;
        //DECLARE TO CAPTURE USERNAME AND PASSWORD
        //START A LOOP TO ASK FOR USERNAME AND PASSWORD
        //YOU HAVE THREE ATTEMPTS TO ENTER EACH DATA CORRECTLY
        while(k==1){
            System.out.println("\n=======================================USUARIOS=======================================");
            System.out.println("MOSTRAR LISTA DE USUARIOS   (Escriba 3)");
            System.out.println("MOSTRAR BOLETO/S            (Escriba 4)");
            System.out.println("");
            System.out.println("USUARIO:");//CAPTURE USER
            capusu=cap.nextLine();
            if(!(capusu.equals("3"))&&!(capusu.equals("4"))){
                System.out.println("CONTRASEÑA:");//CAPTURE PASSWORD
                cappws=cap.nextLine();
                
                if(capusu.equals("USER1")&&cappws.equals("1234")) {         //EVALUATE THE INPUT TO VALIDATE IF IT IS CORRECT
                    eleccionDestino("BIENVENIDO!!");                         //IN .EQUALS DECLARE TE USERS AND PASSWORDS
                }else if(capusu.equals("USER2")&&cappws.equals("1234")) {
                    capturaDatos("BIENVENIDO!!");                            //WITHIN THIS, WE CALL THE METHODS 
                }else if(capusu.equals("USER3")&&cappws.equals("1234")) {
                    asignacionAsientos("BIEVENIDO!!");
                }else if(capusu.equals("USER4")&&cappws.equals("1234")) {
                    capturaDatosCobro("BIENVENIDO!!");
                }else if(capusu.equals("USER5")&&cappws.equals("1234")) {
                    correccionDatos("BIENVENIDO!!");
                    break;
                }else{
                    System.out.println("ACESSO DENEGADO");
                }
            }else if(capusu.equals("3")) {
                mostrarUSU();
            }else{
                mostrarBoleto();
            }
        }
    }
    
    //METHOD FOR USER1
    public static String eleccionDestino(String mensaje){//THIS IS A METHOD TO ACESS USER1
        System.out.println(mensaje);
        System.out.println("USER1:=================================ROL:Tomar el viaje del pasajero");
        ORIGEN = tomarLugOrg("Lugar de origen: ");
        int ciclo = 0;
        while(ciclo == 0){
            DESTINO = tomarDestino("A que destino se dirige el pasajero?");
            if(!(DESTINO.equals(ORIGEN))){
                do{
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
                    }
                    //CHANGE THE NUMERIC VALUES OF THE FLIGHT TYPE TO TEXT
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
                    System.out.println("Mostrar datos (Escriba 1)");
                    System.out.println("Salir         (Cualquiera)");
                    int resp = cap.nextInt();
                    cap.nextLine();
                    if(resp == 1){
                        System.out.println("================VIAJE================");
                        System.out.print("Origen:" + ORIGEN + "- ");
                        System.out.print("Destino:" + DESTINO + "- ");
                        System.out.println("Clase:" + CLASE2 + "- ");
                        System.out.print("Vuelo:" + TIPOVUEL2 + "- ");
                        System.out.print("Boleto(s):" + TIPOBOL2);
                        System.out.println("");
                        System.out.println("=====================================");
                        ciclo = 1;
                    }else{ 
                        ciclo = 1;
                    }    
                }while(false);
            }else{
                System.out.println("El pais de Destino no puede ser el mismo que el de Origen");
            }
        }  
        return mensaje;
    }
    
    public static String tomarLugOrg(String mensaje){
        while(true){
            System.out.println("");
            System.out.print(mensaje);
            System.out.println("     Mostrar lista de paises (Escriba 1)");
            ORIGEN = cap.nextLine();
            if(!(ORIGEN.equals("1"))){
                for (String pais : PAISES1) {
                    if (ORIGEN.equals(pais)) {
                        return ORIGEN;
                    }else{
                    }
                }
                System.out.println("No Existe ese pais en el sistema!!!");
            }else{
                mostrarLista1();
            }
        }
    }
    
    public static String tomarDestino(String mensaje){//THIS METHOD IS FOR DESTINATIONSELECTION
        while(true){
            System.out.println("");
            System.out.print(mensaje);
            System.out.print("    Mostrar lista de paises (Escriba 1)");
            DESTINO = cap.nextLine();
            if(!(DESTINO.equals("1"))){
                for (String pais : PAISES2) {
                    if (DESTINO.equals(pais)) {
                        return DESTINO;
                    }else{
                    }
                }
                System.out.println("No Existe ese pais en el sistema!!!");
            }else{
                mostrarLista2();
            }
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
                    System.out.println("Tipo de vuelo NO Valido!!!");
                    break;
            }
        }while(!(TIPOVUEL == 1) || (TIPOVUEL == 2));
            return -1;
    }
    
    public static int tomarBoleto(String mensaje){//THIS METHOD IS FOR DESTINATION SELECTION
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
        public static void mostrarLista1(){//RETURN THE COUNTRY LIST 1
        for(int i = 0; i < PAISES1.length; i++){
            System.out.println(" -" + PAISES1[i]);
        }
    }
    public static void mostrarLista2(){//RETURN THE COUNTRY LIST 2
        for(int i = 0; i < PAISES2.length; i++){
            System.out.println(" -" + PAISES2[i]);
        }
    }
    
    //METHOD FOR USER2
    public static String capturaDatos(String mensaje){//THIS IS A METHOD TO ACESS USER1
        String respuesta, respuest;
        int ciclo = 0;
        int cicle = 0;
        System.out.println(mensaje);
        System.out.println("USER2:==========================ROL:TOMAR DATOS DEL PASAJERO");
        System.out.println("Cuantos pasajeros viajaran?");
        numps=cap.nextInt();
        cap.nextLine();
        APELL = new String[numps +1];
        NOMBR = new String[numps +1];
        
        while(ciclo == 0){
            for(int i = 1; i <= numps;i++) {
                System.out.println("Capturando datos para pasajero #" + i);
                System.out.print("Capture los Apellidos: ");
                APELL[i] = cap.nextLine();
                System.out.print("Capture Nombre/s: ");
                NOMBR[i] = cap.nextLine();
                // Mostrar los datos ingresados
                //PRINT THE COLLECTED DATA
                System.out.println("SUS DATOS SON: ");
                System.out.println("============REGISTRO============");
                System.out.println("SUS APELLIDOS SON: " + APELL[i]);
                System.out.println("SU NOMBRE ES: " + NOMBR[i]);
                System.out.println("================================");
                System.out.println("SON CORRECTOS SUS DATOS? (SI/NO)");
                respuesta = cap.nextLine();
                if ((respuesta.equals("SI"))||(respuesta.equals("si"))||(respuesta.equals("Si"))) {
                    ciclo = 1;// SALIR DEL CICLO SI LOS DATOS SON CORRECTOS
                    //EXIT CYCLE IF THE DATA ARE CORRECT
                    if(i==numps){
                        for (int j = 0; j <=1; j++) {
                            while(cicle == 0) {
                                System.out.print("Capture el correo:" );
                                EMAIL = cap.nextLine();
                                System.out.print("Capture el Num telefonico:" );
                                TELEF = cap.nextLine();
                                System.out.println("SON CORRECTOS SUS DATOS? (SI/NO)");
                                respuest = cap.nextLine();
                                if ((respuest.equals("SI"))||(respuest.equals("si"))||(respuest.equals("Si"))) {
                                    cicle = 1;
                                }else if((respuest.equals("NO"))||(respuest.equals("no"))||(respuest.equals("No"))) {
                                    System.out.println("VOLVAMOS A CAPTURAR SUS DATOS.");
                                }else{ 
                                    System.out.println("Respuesta no valida");
                                }   
                            }
                        } 
                    }
                }else if((respuesta.equals("NO"))||(respuesta.equals("no"))||(respuesta.equals("No"))) {
                    System.out.println("VOLVAMOS A CAPTURAR SUS DATOS.");
                    i--;
                }else{
                    System.out.println("Respuesta no valida");
                }
            }
        }
        System.out.println("Mostrar datos (Escriba 1)");
        System.out.println("Salir         (Cualquiera)");
        int resp = cap.nextInt();
        cap.nextLine();
        if(resp == 1){
            System.out.println("Datos del pasajero al que se le enviaran los boletos: ");
            System.out.println("================================");
            System.out.println("SUS APELLIDOS SON: " + APELL[1]);
            System.out.println("SU NOMBRE ES: " + NOMBR[1]);
            System.out.println("SU CORREO ES: " + EMAIL);
            System.out.println("SU TELEFONO ES: " + TELEF);
            System.out.println("================================");
        }else{ 
        }
        return mensaje;
    }
    
    //METHOD FOR USER3
    public static String asignacionAsientos(String mensaje){
        System.out.println(mensaje);
        System.out.println("USER4:=================================ROL:Tomar asientos del pasajero");
        if(CLASE==1){//DEPENDING ON THE CLASS THAT WAS INITIALLY CHOSEN, 
                     //THE MATRIX OF THE SEATS AVAILABLE FOR THAT CLASS IS SHOWN
            primeraClase();
        }
        if(CLASE==2){
            claseEjecutiv();
        }
        if(CLASE==3){
            claseTurista();
        }
        System.out.println("Mostrar datos (Escriba 1)");
        System.out.println("Salir         (Cualquiera)");
        int resp = cap.nextInt();
        cap.nextLine();
        if(resp == 1){
            //
        }else{ 
        }
        return mensaje;
    }
    
    public static void primeraClase(){
        System.out.println("Los asientos para primera clase son:");//THIS IS A MATRIX FOR SHOW AVAILABLE SEATS FOR EACH CLASS
        for(int i = 0; i < PRIMCLAS.length; i++){
            for(int j = 0; j < PRIMCLAS[i].length; j++){
                System.out.print("["+PRIMCLAS[i][j] + "]");
                // Line break every 10 items to show seats
                if ((j + 1) % 10 == 0) {
                    System.out.println();
                }
            }
            System.out.println(); // Line break between rows of the matrix
        }
        asiento = new String[numps];
        for(int numasi = 0; numasi < numps; numasi++){
            while(true){
                System.out.println("Capture asiento para pasajero #" + (numasi + 1));//CAPTURE THE SEATS IN ONE ARRANGEMENT
                asiento[numasi] = cap.nextLine();
                System.out.println("El asiento seleccionado para el pasajero #" + (numasi + 1) + " fue: " + asiento[numasi]);
                break;
            }
        }
    }
    
    public static void claseEjecutiv(){
        for (int i = 0; i < EJECUTIV.length; i++) {
            for (int j = 0; j < EJECUTIV[i].length; j++) {
                System.out.print("["+EJECUTIV[i][j] + "]");
                // Line break every 10 items to show seats
                if ((j + 1) % 10 == 0) {
                    System.out.println();
                }
            }
            System.out.println(); // Line break between rows of the matrix
        }
        asiento = new String[numps];
        for (int numasi = 0; numasi < numps; numasi++) {
            while (true) {
                System.out.println("Capture asiento para pasajero #" + (numasi + 1));
                asiento[numasi] = cap.nextLine();
                System.out.println("El asiento seleccionado para el pasajero #" + (numasi + 1) + " fue: " + asiento[numasi]);
                break;
            }
        }
    }
    
    public static void claseTurista(){
        for (int i = 0; i < TURISTA.length; i++) {
            for (int j = 0; j < TURISTA[i].length; j++) {
                System.out.print("["+TURISTA[i][j] + "]");
                // Line break every 10 items to show seats
                if ((j + 1) % 10 == 0) {
                    System.out.println();
                }
            }
            System.out.println(); // Line break between rows of the matrix
        }asiento = new String[numps];
        for (int numasi = 0; numasi < numps; numasi++) {
            while (true) {
                System.out.println("Capture asiento para pasajero #" + (numasi + 1));
                asiento[numasi] = cap.nextLine();
                System.out.println("El asiento seleccionado para el pasajero #" + (numasi + 1) + " fue: " + asiento[numasi]);
                break;
            }
        }
    }
    
    //METHOD FOR USER4
    public static String capturaDatosCobro(String mensaje){
        String respues;
        int ciclo = 0;
        int resp = 0;
        System.out.println(mensaje);
        System.out.println("USER4:=================================ROL:Tomar datos de cobro");
        while(ciclo == 0){
            pedirTarjeta();
            System.out.println("Son correctos los datos ?     (SI/NO)");
            respues = cap.nextLine();
            if((respues.equals("SI"))||(respues.equals("si"))||(respues.equals("Si"))) {
                if(NumeroT.length() < 16 || Cvv.length() != 3) {
                System.out.println("Datos de la tarjeta invalidos. Por favor, intente nuevamente.");
                }else{//IF DATES THE TARJET IS MINOR TO 16 IS INCORRECT
                    //IF DATES THE CVV IS MINOR TO 3 IS INCORRECT
                    System.out.println("Pago realizado exitosamente con tarjeta.");
                    for (int i = NumeroT.length() - 4; i < NumeroT.length(); i++) {
                        ULT4 += NumeroT.charAt(i);
                    }
                }
                ciclo = 1;
            }else if((respues.equals("NO"))||(respues.equals("no"))||(respues.equals("No"))){
                System.out.println("Volvamos a capturar los datos");
            }else{
                System.out.println("respuesta invalida");
            }
        }
        System.out.println("Mostrar datos (Escriba 1)");
        System.out.println("Salir         (Cualquiera)");
        resp = cap.nextInt();
        cap.nextLine();
        if(resp == 1){
            System.out.println("============PAGO============");//RETURN PAYMENT DETAILS
            System.out.println("Titular: " + TITULAR);
            System.out.println("Numero de tarjeta: **** **** **** " + ULT4);
            System.out.println("============================");
        }else{ 
        }
        return mensaje;
    }
    
    public static void pedirTarjeta(){
        
        //DEPENDING ON THE CHOSEN CLASS AND THE NUMBER OF PASSENGERS
        //IT SHOWS HOW MUCH THE FLIGHTS WILL COST
        if(CLASE==1){
            System.out.println("El precio a cobrar es:"+PRECIOCLASE1*numps);
        }
        if(CLASE==2){
            System.out.println("El precio a cobrar es:"+PRECIOCLASE2*numps);
        }
        if(CLASE==3){
            System.out.println("El precio a cobrar es:"+PRECIOCLASE3*numps);
        }
        System.out.print("Numero de tarjeta: ");//CAPTURES DATES FOR PAYMENT
        NumeroT = cap.nextLine();   
        System.out.print("Nombre del titular: ");
        TITULAR = cap.nextLine();
        System.out.print("Fecha de vencimiento (MM/AA): ");
        String Fecha = cap.nextLine();
        System.out.print("CVV: ");
        Cvv= cap.nextLine();
        System.out.println("Datos de las tarjetas registradas:");
        
    }
    
    public static void mostrarBoleto(){//THIS METHOD RETURN TICKET DETAILS
        System.out.println("===========DATOS BOLETO============");
        System.out.print("Origen:" + ORIGEN + "- ");
        System.out.print("Destino:" + DESTINO + "- ");
        System.out.println("Clase:" + CLASE2 + "- ");
        System.out.print("Vuelo:" + TIPOVUEL2 + "- ");
        System.out.print("Boleto(s):" + TIPOBOL2);
        System.out.println("");
        for (int i = 0; i < numps; i++) {
            System.out.println("Pasajero # " + (i + 1));
            System.out.println("Nombre: " +  NOMBR[1+i] + " " + APELL[1+i]);
            System.out.println("Asiento: " + asiento[i]);
        }
        System.out.println("====================================");
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
                    if(usu.equals("USER1")){
                       eleccionDestino("");
                    }else if(usu.equals("USER2")){
                        capturaDatos("");
                    }else if (usu.equals("USER3")){
                        asignacionAsientos("");
                    }else if (usu.equals("USER4")){ 
                        capturaDatosCobro("");
                    }
        System.out.println(mensaje);
        return mensaje;
    }
    
    public static void mostrarUSU(){//RETURN THE ROLS FOR EACH USER
        System.out.println("==============LISTA DE USUARIOS=============");
        System.out.println("USER1 : Tomar el viaje del pasajero ");
        System.out.println("USER2 : Tomar los datos del pasajero");
        System.out.println("USER3 : Tomar los asientos pasajero");
        System.out.println("USER4 : Tomar el metodo de pago del pasajero");
        System.out.println("USER5 : Administrador");
    }
}
