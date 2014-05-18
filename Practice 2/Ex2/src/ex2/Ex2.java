/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int N, y;

        Scanner teclado = new Scanner(System.in);

        //Le asigno un valor
        System.out.print("Digite el valor de N ");
        N = Integer.parseInt(teclado.nextLine());
       
        System.out.print("Digite el valor de y ");
        y = Integer.parseInt(teclado.nextLine());
        
        System.out.print("\n");
        for (int i = 1; i <= N; i++) {
            if (i%y==0){
                System.out.println(i+"*");}
            else{
                System.out.println(i);
            }}
        System.out.println("* Multiplos de "+y);
            
    }
    
}
