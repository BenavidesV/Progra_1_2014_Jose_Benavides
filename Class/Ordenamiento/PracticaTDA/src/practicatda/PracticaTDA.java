/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatda;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class PracticaTDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        clsLista oLista = new clsLista();
        System.out.println("Digite un número que será el nodo de la lista");
        n = teclado.nextInt();
        while (n != 0) {
            oLista.Insertar(n);
            System.out.println("Digite un número que será el nodo de la lista");
            n = teclado.nextInt();
        }
        oLista.Imprimir();
        System.out.println("Digite un número que será eliminado de la lista");
            n = teclado.nextInt();
        oLista.Eliminar(n);
        oLista.Imprimir();
        
        
    }

}
