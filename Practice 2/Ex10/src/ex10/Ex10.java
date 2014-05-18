/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cal = 0, sum = 0;
        int prom = 0, cont = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite su calificación: ");
        cal = Integer.parseInt(teclado.nextLine());

        do {

            if ((cal != 0)&&(cal > 0) && (cal<10)){
                cont = cont + 1;
                sum = sum + cal;
                prom = sum / cont;
                System.out.println("El promedio es: " + prom);
                
            }if((cal < 0) || (cal>10)){
                System.out.println("Las notas deben estar entre 0 y 10");}
                
          
          System.out.println("Digite su calificación: ");
          cal = Integer.parseInt(teclado.nextLine());
          
        } while (cal != 0);

    }

}
