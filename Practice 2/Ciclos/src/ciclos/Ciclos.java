/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose E
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * ciclo for
         *
         */
        int cantidad, suma = 0;
        Scanner teclado = new Scanner(System.in);

        //solicto al usuario el # de repeticones que desea ver
        System.out.println("Digite el número de repeticones que desea ver ");
        cantidad = Integer.parseInt(teclado.nextLine());

        System.out.print("\n");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(i);
        }
        System.out.print("\n");
        System.out.println("Inverso");
        System.out.print("\n");
        for (int i = cantidad - 1; i > -1; i--) {
            System.out.println(i);
        }

        while (suma <= cantidad) {
            System.out.print(suma);
            System.out.print("-");
            suma = suma + 1;
        }
        System.out.print("\n");
        suma = cantidad;
        while (suma >= 0) {

            System.out.print(suma);
            System.out.print("-");
            suma = suma - 1;
        }
        System.out.print("\n");
        suma = 0;
        do {
            System.out.println(suma);
            suma = suma + 1;
        } while (suma < cantidad);
        
        System.out.print("\n");
        suma = cantidad;
        do {
            System.out.println(suma);
            suma = suma - 1;
        } while (suma >0);
        
    }
}
