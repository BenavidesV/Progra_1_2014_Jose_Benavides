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
        int n=0, cp = 0, ci = 0;
        char r=' ';
        do {
            Scanner teclado = new Scanner(System.in);
            

            //Asigno los valores introducidos
            System.out.println("Digite el valor de N ");
            n = Integer.parseInt(teclado.nextLine());
            //sumo los numeros pares e impares
            for (int i = 1; i <= n; i++) {
                paridad t = new paridad(i);
                if (t.parImpar() == true) {
                    cp = cp + 1;
                } else {
                    ci = ci + 1;
                }}

                System.out.println(n+" tiene "+cp+" números pares ");
                System.out.println("y "+ci+" impares "+"\n");
                cp=0;
                ci=0;
                
                System.out.println("Desea continuar con otro número S/N");
                r = teclado.nextLine().charAt(0);
            }while (r == 's' || r == 'S');
    
    }
    }
