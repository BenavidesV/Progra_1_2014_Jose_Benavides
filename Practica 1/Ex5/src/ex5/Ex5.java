/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables
        int N;

        Scanner teclado = new Scanner(System.in);

        //Le asigno un valor
        System.out.print("Digite el valor de N ");
        N = Integer.parseInt(teclado.nextLine());

        //determino si es par o impar y muestro en pantalla el mensaje
        if (N % 2 == 0) {
            System.out.print(N+ " es par "+"\n");
        } else {
            System.out.print(N+ " es impar "+"\n");
        }
    }

}
