/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        double n, m;
        Scanner teclado =new Scanner(System.in);
        
        
        System.out.print("Digite el valor de x ");
        x=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de y ");
        y=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de n ");
        n=Double.parseDouble(teclado.nextLine());
        
        System.out.print("Digite el valor de m ");
        m=Double.parseDouble(teclado.nextLine());
    }
}
