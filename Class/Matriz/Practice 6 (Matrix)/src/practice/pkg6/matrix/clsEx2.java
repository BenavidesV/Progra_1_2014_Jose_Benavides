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
public class clsEx2 {

    private int[][] enteros;
    int n, m;
    private int temporal[];
    private Scanner teclado;

    public void cargarMatriz() {
        teclado = new Scanner(System.in);
        enteros = new int[n][m];

        System.out.println("Digite el número de filas");
        n = teclado.nextInt();
        System.out.println("Digite el número de columnas");
        m = teclado.nextInt();

        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                System.out.println("Digite el valor de la fila " + f + " columna " + c);
                enteros[f][c] = teclado.nextInt();
            }

        }
    }

    public void intercambiar() {
        temporal = new int[m];
        for (int c = 0; c < m; c++) {
            temporal[c] = enteros[0][c];
        
        enteros[0][c] = enteros[0][1];
        enteros[0][1]=temporal[c];
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
