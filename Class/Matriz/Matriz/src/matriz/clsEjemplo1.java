/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 * Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar
 * sus componentes y luego imprimirlas.
 *
 *
 * @author Jose E
 */
public class clsEjemplo1 {

    private int[][] enteros;
    private Scanner teclado;

    public void cargarMatriz() {
        teclado = new Scanner(System.in);
        enteros = new int[3][5];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("Digite el valor de la fila " + f + " columna " + c);
                enteros[f][c] = teclado.nextInt();
            }

        }
    }

    public void ImprimirDatos() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(enteros[f][c]+" ");

            }
            System.out.println();

        }
    }

}
