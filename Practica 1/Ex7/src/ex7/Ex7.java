/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables
        int c;

        Scanner teclado = new Scanner(System.in);

//Le asigno un valor
        System.out.print("Digite el valor de C ");
        c = Integer.parseInt(teclado.nextLine());

//determino si es positivo o negativo
        if (c < 0) {
            System.out.print(c + " es negativo,");
        } else {
            System.out.print(c + " es positivo,");
        }

//determino si es par o impar
        if (c % 2 == 0) {
            System.out.print(" es par,");
        } else {
            System.out.print(" es impar,");
        }

//determino si es multiplo de 5
        if (c % 5 == 0) {
            System.out.print(" es multiplo de 5,");
        } else {
            System.out.print(" NO es multiplo de 5,");
        }
        //determino si es multiplo de 10
        if (c % 10 == 0) {
            System.out.print(" es multiplo de 10,");
        } else {
            System.out.print(" NO es multiplo de 10,");
        }

//determino si es mayor que 100
        if (c > 100) {
            System.out.print(" y es mayor que 100,");
        } else if (c == 100) {
            System.out.print(" y es igual a 100,");
        } else {
            System.out.print(" y es menor que 100," + "\n");
        }
    }

}
