/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatda;

import java.util.Collections;
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
        int ejercicio = 0, n = 0, cantNodos = 0;
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
                    oLista.cantidad();
                    oLista.AgregarAlArreglo();
                    oLista.OrdenS();
                    oLista.ListaOrdenada();
                    oLista.Imprimir();

                    //Después de ordenar el arreglo inserto los valores en la lista
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
                            + "elementos es " + oLista.SumatoriaCadrados());
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
                    oLista.concatenar();
                    break;
                case 5:
                    System.out.println("Digite un número que será el nodo de la lista ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        oLista.Insertar(n);
                        System.out.println("Digite un número que será el nodo de la lista");
                        n = teclado.nextInt();
                    }
                    System.out.println("La lista ");
                    oLista.Imprimir();
                    oLista.invertirLista();
                    System.out.println("La lista invertida ");
                    oLista.Imprimir();
                    break;
                case 6:
                    System.out.println("Digite un número que será el nodo de la lista ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        oLista.Insertar(n);
                        System.out.println("Digite un número que será el nodo de la lista");
                        n = teclado.nextInt();
                    }
                    oLista.paridad();
                    break;
                case 8:
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
                    oLista.intercalarListas();
                    break;
                case 9:
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
                    oLista.Union();
                case 10:
                    Pila opila = new Pila();
                    System.out.println("Digite un número que será el "
                            + "nuevo elemento de la pila ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opila.Push(n);
                        System.out.println("Digite un número que será el nodo de la Pila");
                        n = teclado.nextInt();
                    }
                    opila.Imprimir();
                    break;

                case 11:
                    opila = new Pila();
                    System.out.println("Digite un número que será el "
                            + "nuevo elemento de la pila ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opila.Push(n);
                        System.out.println("Digite un número que será el nodo de la Pila");
                        n = teclado.nextInt();
                    }
                    opila.Imprimir();
                    opila.PilaInvertida();
                    break;
                case 12:
                    PilaF opilaF = new PilaF();
                    System.out.println("Digite un número para la pila 1 ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opilaF.Push(n);
                        System.out.println("Digite un número  para la pila 1");
                        n = teclado.nextInt();
                    }
                    System.out.println("Digite un número para la pila 2 ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opilaF.PushP(n);
                        System.out.println("Digite un número para la pila 2");
                        n = teclado.nextInt();
                    }
                    opilaF.PushPila();
                    break;
                case 13:
                    opila = new Pila();
                    System.out.println("Digite un número para la pila 1 ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opila.Push(n);
                        System.out.println("Digite un número  para la pila 1");
                        n = teclado.nextInt();
                    }
                    System.out.println("Digite un número para la pila 2 ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opila.PushP(n);
                        System.out.println("Digite un número para la pila 2");
                        n = teclado.nextInt();
                    }
                    opila.InvertirListas();
                    break;
                case 14:
                    opila = new Pila();
                    System.out.println("Digite un número para la pila 1 ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opila.Push(n);
                        System.out.println("Digite un número  para la pila 1");
                        n = teclado.nextInt();
                    }
                    opila.DuplicarLista();
                    break;
                case 15:
                    opila = new Pila();
                    System.out.println("Digite un número para la pila 1 ");
                    n = teclado.nextInt();
                    while (n != 0) {
                        opila.Push(n);
                        System.out.println("Digite un número  para la pila 1");
                        n = teclado.nextInt();
                    }
                    opila.MoverYCopiar();
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
