/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class clsEj2 {

    private int[][] enteros;
    private Scanner teclado;

    public void cargarMatriz() {
        teclado = new Scanner(System.in);
        enteros = new int[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Digite el valor de la fila " + f + " columna " + c);
                enteros[f][c] = teclado.nextInt();
            }

        }
    }

    public void ImprimirDiagonal() {
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                if (f == c) {
                    System.out.print(enteros[f][c] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();

        }
    }
       
}
