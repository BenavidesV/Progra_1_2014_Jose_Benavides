/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex9;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double prom = 0, sum = 0, n;
         int c=0;

        Scanner teclado = new Scanner(System.in);

        while(c<10) {
        System.out.print("Digite los valores a los que quiere calcular el promedio ");
        n = Double.parseDouble(teclado.nextLine());
        sum = sum + n;
        }
        prom=sum/10;
        System.out.println("El promedio es: "+prom+"\n");
    }
    
}
