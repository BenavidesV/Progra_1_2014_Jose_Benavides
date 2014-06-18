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
public class clsEx4 {

    private Scanner teclado;
    private int[][] enteros;
    int mayor, posF,posC;

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

    public void ImprimirDatos(int n, int m) {
        System.out.println("Matriz" + "\n");
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                System.out.print(enteros[f][c] + " ");

            }
            System.out.println();

        }
    }

    public void Mayor(int n, int m) {
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                if ((enteros[f][c]) > mayor) {
                    mayor = enteros[f][c];
                    posF=f;
                    posC=c;
                }

            }
        }
        System.out.println("El valor mayor es "+mayor+" y está en la fila "+posF+" columna "+posC);

    }

}
