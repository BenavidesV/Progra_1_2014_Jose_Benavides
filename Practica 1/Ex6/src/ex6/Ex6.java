/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex6;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Declaro las variables
        int B;

        Scanner teclado = new Scanner(System.in);

        //Le asigno un valor
        System.out.print("Digite el valor de B ");
        B = Integer.parseInt(teclado.nextLine());

        //determino si es positivo o negativo y muestro en pantalla el mensaje
        if (B < 0) {
            System.out.print(B+ " es negativo "+"\n");
        } else {
            System.out.print(B+ " es positivo "+"\n");
        }
    }
    
}
