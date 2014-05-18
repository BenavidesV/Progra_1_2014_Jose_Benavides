/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex11;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int cantidad= 0, colones, sum=0;
        Scanner teclado = new Scanner(System.in);

        //solicto al usuario 
        System.out.println("Digite la cantidad de dólares ");
        cantidad = Integer.parseInt(teclado.nextLine());
        
        for (int i = 1; i <=cantidad; i++) {
            colones=i*560;
            sum=sum+colones;
            System.out.println(i+" $ = "+sum+" colones");

        }
    }
    
}
