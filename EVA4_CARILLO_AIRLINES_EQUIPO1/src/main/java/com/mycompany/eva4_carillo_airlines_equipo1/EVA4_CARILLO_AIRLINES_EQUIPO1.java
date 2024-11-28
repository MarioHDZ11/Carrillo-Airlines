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

    public static void main(String[] args) {
        int i=3;
        String capusu,cappws;
        //DECLARE TO CAPTURE USERNAME AND PASSWORD
        Scanner cap = new Scanner(System.in);
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
                        break;
                    } else if (capusu.equals("USER2")&&cappws.equals("ABCD")) {
                        eleccionDestino("BIENVENIDO!!");  //WITHIN THIS, WE CALL THE METHODS 
                                                          //THAT THE USER HAS ACCESS TO
                        break;
                    } else if (capusu.equals("USER3")&&cappws.equals("0987")) {
                        capturaDatosCobro("BIENVENIDO!!");
                        break;
                    } else if (capusu.equals("USER4")&&cappws.equals("0112")) {
                        asignacionBoleto("BIENVENIDO!!");
                        break;
                    } else if (capusu.equals("USER5")&&cappws.equals("9705")) {
                        correccionDatos("BIENVENIDO!!");
                        break;
                    }
                  i--;
                if(i>0){
        //IF YOU MAKE THREE MISTAKES, IT GETS BLOCKED
        System.out.println("CONTRASEÑA O USUARIO INCORRECTO INTENTE DE NUEVO");
        System.out.println("TE QUEDAN" +" "+ i+" " + "INTENTOS");
    }else{
        System.out.println("ACESSO DENEGADO");
    }

            
        }
    }
    public static String capturaDatos(String mensaje){//THIS IS A METHOD TO ACESS USER1
        System.out.println(mensaje);
        return mensaje;
    }
    public static String eleccionDestino(String mensaje){//THIS IS A METHOD TO ACESS USER2
        System.out.println(mensaje);
        return mensaje;
    }
    public static String capturaDatosCobro(String mensaje){//THIS IS A METHOD TO ACESS USER3
        System.out.println(mensaje);
        return mensaje;
    }
    public static String asignacionBoleto(String mensaje){//THIS IS A METHOD TO ACESS USER4
        System.out.println(mensaje);
        return mensaje;
    }
    public static String correccionDatos(String mensaje){//THIS IS A METHOD TO ACESS USER5
        String usu;
        Scanner cap = new Scanner(System.in);
        System.out.println("Que accion va realizar?");
        System.out.println("Captura de datos--->USER1");
        System.out.println("Cambio de destino--->USER2");
        System.out.println("Cobro--->USER3");
        System.out.println("Asignacion de boleto--->USER4");
        usu=cap.nextLine();
                    if (usu.equals("USER1")) {//EVALUATE THE INPUT TO VALIDATE IF IT IS CORRECT
                        capturaDatos("BIENVENIDO!!");//IN .EQUALS DECLARE TE USERS AND PASSWORDS
                        
                    } else if (cap.equals("USER2")) {
                        eleccionDestino("BIENVENIDO!!");//WITHIN THIS, WE CALL THE METHODS 
                                                        //THAT THE USER HAS ACCESS TO
                        
                    } else if (cap.equals("USER3")) {
                        capturaDatosCobro("BIENVENIDO!!");
                        
                    } else if (cap.equals("USER4")) {
                        asignacionBoleto("BIENVENIDO!!");
                        
                    } else if (cap.equals("USER5")) {
                        correccionDatos("BIENVENIDO!!");
                        
                    }
        System.out.println(mensaje);
        return mensaje;
    }
}

