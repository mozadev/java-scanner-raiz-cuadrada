/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raizcuadrada;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Raizcuadrada {
 public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        int numero;
        
        System.out.println(" ingrese el numero: ");
     numero= leer.nextInt();
     
        System.out.println("la raiz cuadrada es: "+Math.sqrt(numero));
        
    }
    
}
