/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion66175;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ejercicio1Seleccion66175 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
                
       Scanner sc = new Scanner(System.in);
      
       int n1, n2, n3, mayor;
      Scanner var = new Scanner(System.in);
        System.out.println("Introduzca el primer numero = " );
        n1 = var.nextInt();
        System.out.println("Introduzca el segundo numero = " );
        n2 = var.nextInt();
        System.out.println("Introduzca el tercer numero = " );
        n3 =var.nextInt();
        
        mayor = n1;
        if ( n1 > n2 && n1 > n3) {
            System.out.println("El numero = " + n1 + " es el mayor ");
            
             }else if ( n2 > n1 && n2 > n3 ){
            System.out.println("El numero mayor es = " + n2 );
        }else if ( n3 > n1 && n3 > n2){
            System.out.println("El numero mayor es = " + n3);
            
        }    
        
    }
    
}
