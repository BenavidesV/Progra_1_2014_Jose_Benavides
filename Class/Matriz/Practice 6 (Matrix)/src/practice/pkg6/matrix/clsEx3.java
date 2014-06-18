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
 *
 */
public class clsEx3 {

    private Scanner teclado;
    private int[][] enteros;
    int[][] soloE;

    public void cargarMatriz(int n, int m) {

        enteros = new int[n][m];
        teclado = new Scanner(System.in);

        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                System.out.println("Digite el valor de la fila " + f + " columna " + c);
                enteros[f][c] = teclado.nextInt();
            }
        }
    }

    public void generarBordes(int n, int m) {
        soloE = enteros;

        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                if (((c == 0) && (f == 0 || f == n-1 )) || (c == m-1) && (f == 0 || f == n-1)) {
                } else {
                    soloE[f][c] = -1;
                }

            }

        }
    }

    public void ImprimirDatos(int n, int m) {
        System.out.println("Nueva Matriz" + "\n");
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                System.out.print(soloE[f][c] + " ");

            }
            System.out.println();

        }
    }

}
