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
public class clsEjemplo3 {

    private int[][] enteros;
    private Scanner teclado;

    public void cargarMatriz() {
        teclado = new Scanner(System.in);
        enteros = new int[3][4];

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Digite el valor de la fila " + f + " columna " + c);
                enteros[f][c] = teclado.nextInt();
            }

        }
    }

    public void PrimeraFila() {
        System.out.println("Primera fila de la matriz");
        for (int c = 0; c < 4; c++) {

            System.out.print(enteros[0][c] + " ");

        }
    }
    public void ImprimirUltimaFila(){
        System.out.println("\n"+"Ultima fila de la matriz");
        for (int c = 0; c < 4; c++) {

            System.out.print(enteros[2][c] + " ");

        }
    }
    public void ImprimirPrimerColumna(){
        System.out.println("\n"+"Primera columna de la matriz");
        for (int f = 0; f < 3; f++) {

            System.out.print(enteros[f][0] + " ");

        }
    }
    public void ImprimirDatos() {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(enteros[f][c]+" ");

            }
            System.out.println();

        }
    }
}
