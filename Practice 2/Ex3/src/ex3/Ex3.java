/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ini, fin, p, i;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite el valor de inicial ");
        ini=Double.parseDouble(teclado.nextLine());
       
        System.out.print("Digite el valor de final ");
        fin=Double.parseDouble(teclado.nextLine());
        
        System.out.print("Digite el tamaño de cada sección ");
        p=Double.parseDouble(teclado.nextLine());
       
        
        System.out.print("\n");
        
       
        for ( i = ini; i <= fin; i=i+p) {
            System.out.println(i);
            }}
    }
