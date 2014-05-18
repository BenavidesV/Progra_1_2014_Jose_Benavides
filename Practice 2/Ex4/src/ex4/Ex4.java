/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex4;

import static ex4.Padovan.sucesionPadovan;
import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int n;
    Padovan g= new Padovan();
    
    Scanner teclado =new Scanner(System.in);
    System.out.print("Digite el número de valores de la serie de Padovan que desea visualizar ");
    n=Integer.parseInt(teclado.nextLine());
    
    for (int i = 0; i < n; i++) {
            System.out.println(g.sucesionPadovan(i));
        }
    }
    
}
