/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex5;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose E
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=0;
        double y=0,r=1;
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite el valor de la base ");
        y=Double.parseDouble(teclado.nextLine());
       
        System.out.print("Digite el valor del exponente ");
        x=Integer.parseInt(teclado.nextLine());
        for (int i = 1; i <= x; i++) {
          r=y*r;              
        }
        System.out.println("El resultado de elevar "+y+ " a la "+x+ " es: "+r);
    }
    
}
