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
        int ejercicio = 0,n=0;
        char continuar = ' ';
        boolean validar = true;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite el número del ejercicio que quiere ver");
            ejercicio = Integer.parseInt(teclado.nextLine());
            clsLista oLista = new clsLista();

            switch (ejercicio) {
                case 1:
                    
                    System.out.println("Digite un número que será el nodo de la lista");
                    n = teclado.nextInt();
                    while (n != 0) {
                        oLista.Insertar(n);
                        System.out.println("Digite un número que será el nodo de la lista");
                        n = teclado.nextInt();
                    }
                    
                    
//        System.out.println("Digite un número que será eliminado de la lista");
//            n = teclado.nextInt();
//        oLista.Eliminar(n);
                    oLista.Imprimir();

                    break;

                case 2:
                    System.out.println("2. La lista tiene " + oLista.cantidad() + " elementos");
                    break;

                case 3:
                    System.out.println("3. La suma del cuadrado de los "
                            + "elementos es "+ oLista.SumatoriaCadrados());
                    break;
                case 4:
                    System.out.println("Digite un número que será el nodo de la lista ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        oLista.Insertar(n);
                        System.out.println("Digite un número que será el nodo de la lista");
                        n = teclado.nextInt();
                    }
                    System.out.println("Digite un número que será el nodo de la lista 2 ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        oLista.InsertarOtra(n);
                        System.out.println("Digite un número que será el nodo de la lista");
                        n = teclado.nextInt();
                    }
                    System.out.println("Concatenadas "+"\n");
                    oLista.Imprimir();
                    break;

            }

            System.out.println("Desea continuar con otra operación S/N ");
            teclado = new Scanner(System.in);
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
    

}
