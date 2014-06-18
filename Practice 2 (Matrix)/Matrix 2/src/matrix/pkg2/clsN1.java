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
public class clsN1 {
    private int[][] enteros;

    public clsN1(int[][] enteros) {
        this.enteros = enteros;
    }
    clsCargar carga=new clsCargar();
    int sum, prom;
    
    public void promedio(int n, int m){
       
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < m; c++) {
                sum+=getEnteros()[f][c];
            }
        }
        prom=sum/(n*m);
        System.out.println("El promedio de la matriz es "+prom+"\n");
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
