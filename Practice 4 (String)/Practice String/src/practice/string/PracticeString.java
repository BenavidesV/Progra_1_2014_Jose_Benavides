/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.string;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class PracticeString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, begin = 0, end = 0, pos, beg;
        String buscar, frase, palabra, busca2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion que desea : ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Escriba la frase que desea evaluar");
                    teclado = new Scanner(System.in);
                    frase = teclado.nextLine();
                    clsInvertir inv = new clsInvertir(frase);

                    /**
                     * Muestra la información de salida*
                     */
                    System.out.println("Inverso " + inv.reverso());
                    System.out.println("Palindromo " + inv.crearP());

                    //Si quiere señalar un elemento dentro de la frase
                    System.out.println("Señale la palabra que desea resaltar ");
                    buscar = teclado.nextLine();
                    System.out.println("Nueva Frase= " + inv.Busca(buscar));

                    //busca el numero de incidencias
                    System.out.println("Escriba la palabra que desea saber el número de incidencias ");
                    palabra = teclado.nextLine();
                    System.out.println("Numero de veces que aparece la palabra " + palabra + "= " + inv.cuenta(palabra));
                    break;
                case 2:
                    System.out.println("Escriba la frase que desea evaluar");
                    teclado = new Scanner(System.in);
                    frase = teclado.nextLine();
                    clsString cd = new clsString(frase);

                    System.out.println("digite la posición inicial ");
                    begin = teclado.nextInt();
                    System.out.println("digite la posición final ");
                    end = teclado.nextInt();
                    System.out.println("Nuevo SubString= " + cd.Sub(begin, end));

                    System.out.println("digite la posición que quiere visualizar  ");
                    pos = teclado.nextInt();
                    System.out.println("valor de la posición i= " + cd.Valori(pos));

                    System.out.println("digite la palabra que quiere buscar  ");
                    teclado = new Scanner(System.in);
                    busca2 = teclado.nextLine();
                    System.out.println("digite la posición desde donde quiere empezar la búsqueda ");
                    beg = teclado.nextInt();
                    System.out.println("EL string buscado comienza en la posición " + cd.posinicio(busca2, beg));
                    break;
            }

        } while (opcion <= 4);
    }
}
