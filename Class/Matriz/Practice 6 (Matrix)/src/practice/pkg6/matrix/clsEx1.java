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
public class clsEx1 {
    private int[][] enteros;
    private Scanner teclado;

    public void cargarMatriz() {
        teclado = new Scanner(System.in);
        enteros = new int[2][5];

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Digite el valor de la fila " + f + " columna " + c);
                enteros[f][c] = teclado.nextInt();
            }

        }
    }

    public void ImprimirDatos() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(enteros[f][c]+" ");

            }
            System.out.println();

        }
    }

}
