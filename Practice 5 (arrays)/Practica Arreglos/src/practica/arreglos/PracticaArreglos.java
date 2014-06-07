/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ejercicio = 0;
        char continuar = ' ';
        boolean validar = true;

        Scanner teclado = new Scanner(System.in);
        Ex1 vector = new Ex1();

        do {
            System.out.println("Digite el número del ejercicio que quiere ver");
            ejercicio = Integer.parseInt(teclado.nextLine());

            switch (ejercicio) {
                case 1:
                    int cantidad = 1;
                    double v;
                    do {
                        System.out.println("Digite los componentes del vector " + cantidad);
                        v = teclado.nextFloat();
                        vector.AgregarValor(v);
                        cantidad++;
                    } while (cantidad < 9);

                    System.out.println("El valor acumulado de todos los elementos del vector es "
                            + vector.SumarValores() + "\n");
                    System.out.println("El valor acumulado de todos los elementos mayores de 36 "
                            + "del vector es " + vector.Suma36() + "\n");
                    System.out.println("El valor acumulado de todos los elementos mayores de 50 "
                            + "del vector es " + vector.Suma50() + "\n");

                    break;

                case 2:
                    clsEx2 x2 = new clsEx2();
                    int v1,
                     v2;
                    cantidad = 1;
                    do {
                        System.out.println("Digite los componentes del vector 1, valor " + cantidad);
                        v1 = teclado.nextInt();
                        System.out.println("Digite los componentes del vector 2, valor " + cantidad);
                        v2 = teclado.nextInt();
                        x2.AgregarValor(v1, v2);
                        cantidad++;
                    } while (cantidad < 5);
                    x2.SumarValores();
                    break;

                case 3:
                    clsEx3 x3 = new clsEx3();
                    double nA, nB;
                    cantidad=1;

                    do {
                        System.out.println("Digite las notas del curso A, valor " + cantidad);
                        nA = teclado.nextDouble();
                        System.out.println("Digite los componentes del vector 2, valor " + cantidad);
                        nB = teclado.nextDouble();
                        x3.AgregarValor(nA, nB);
                        cantidad++;
                    } while (cantidad < 5);
                    System.out.println("El promedio mayor es el del "+x3.PromedioMayor());
                    break;
                case 4:
                    clsEx4 x4 = new clsEx4();
                    double n1;
                    cantidad=1;

                    do {
                        System.out.println("Digite las notas del curso A, valor " + cantidad);
                        n1 = teclado.nextDouble();
                        x4.AgregarValor(n1);
                        cantidad++;
                    } while (cantidad < 5);
                    if(==true)
                    System.out.println("El promedio mayor es el del "+x3.PromedioMayor());
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
