/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matrix.pkg2;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class clsCargar {
    private int[][] enteros;

    int n = 0, m = 0;
    private Scanner teclado;

    public void cargarMatriz(int n, int m) {
        setEnteros(new int[n][m]);
                
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                System.out.println("Digite el valor de la fila " + f + " columna " + c);
                teclado = new Scanner(System.in);
                getEnteros()[f][c] = teclado.nextInt();
            }
        }
    }

    /**
     * @return the enteros
     */
    public int[][] getEnteros() {
        return enteros;
    }

    /**
     * @param enteros the enteros to set
     */
    public void setEnteros(int[][] enteros) {
        this.enteros = enteros;
    }
    
}
