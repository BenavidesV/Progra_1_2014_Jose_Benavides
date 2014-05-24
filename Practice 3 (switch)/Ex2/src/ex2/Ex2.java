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
        char continuar = ' ';
        String letra = " ";
        int num = 0, ultnum = 0, ex = 0, mes, anno;
        boolean validar = true;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Digite el número de ejercicio");
            ex = (Integer.parseInt(teclado.nextLine()));
            switch (ex) {

                case 2:
                    System.out.println("Digite el número ");
                    num = Integer.parseInt(teclado.nextLine());

                    clsEvalua e = new clsEvalua(num);
                    System.out.println(e.ultimo(ultnum));

                    break;

                case 3:
                    System.out.println("Digite una letra: A, B, C, D, E");
                    letra = teclado.nextLine();

                    clsEx3 l = new clsEx3(letra);
                    System.out.println(l.valora());
                    break;
                case 4:
                    System.out.println("Digite el mes");
                    mes = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Digite el anno");
                    anno = Integer.parseInt(teclado.nextLine());
                    

                    clsEx4 o = new clsEx4();
                    System.out.println(l.valora());
                    break;

                default:

            }

            System.out.println("Desea continuar con otra operación S/N ");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
}
