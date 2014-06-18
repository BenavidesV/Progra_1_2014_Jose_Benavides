/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.pkg6.matrix;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Practice6Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char continuar = ' ';
        int ex = 0, n, m;
        boolean validar = true;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Digite el número de ejercicio");
            ex = (Integer.parseInt(teclado.nextLine()));
            switch (ex) {

                case 1:
                    clsEx1 x1 = new clsEx1();
                    x1.cargarMatriz();
                    x1.ImprimirDatos();
                    break;

                case 2:
                    clsEx2 x2 = new clsEx2();
                    x2.cargarMatriz();
                    x2.intercambiar();
                    x2.ImprimirDatos();
                    break;
                case 3:

                    teclado = new Scanner(System.in);
                    System.out.println("Digite el número de filas");
                    n = teclado.nextInt();
                    System.out.println("Digite el número de columnas");
                    m = teclado.nextInt();
                    clsEx3 x3 = new clsEx3();
                    x3.cargarMatriz(n, m);
                    x3.generarBordes(n, m);
                    x3.ImprimirDatos(n, m);
                    break;
                case 4:
                    teclado = new Scanner(System.in);
                    System.out.println("Digite el número de filas");
                    n = teclado.nextInt();
                    System.out.println("Digite el número de columnas");
                    m = teclado.nextInt();
                    clsEx4 x4 = new clsEx4();
                    x4.cargarMatriz(n, m);
                    x4.ImprimirDatos(n, m);
                    x4.Mayor(n, m);
                    break;

                default:

            }
            teclado = new Scanner(System.in);
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
