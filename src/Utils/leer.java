/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.Scanner;

/**
 *
 * @author JEREMY
 */
public class leer {
    public static Scanner teclado = new Scanner(System.in);
    public static String cadena(){
        //nextline()--> Leer Cadena
        return teclado.nextLine();
    }
    public static int entero(){
        return Integer.valueOf(cadena());
    }
    public static double decimal(){
        return Double.valueOf(cadena());
    }
    public static char caracter(){
        return cadena().charAt(0);
    }    
}
