/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion.jose.benavides;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class SolucionJoseBenavides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char continuar = ' ';
        int ex = 0, n, m;
        boolean validar = true;
        String frase;
        Scanner teclado = new Scanner(System.in);

        do {

            //Despliega el enunuciado de los ejercicios
            System.out.println("1. El Tap Code es una forma de encriptar mensajes " + "\n"
                    + "usada por prisioneros en Vietnam. Es un método muy simple" + "\n"
                    + "que consiste en traducir cada letra de un mensaje en una" + "\n"
                    + "serie de sonidos hechos con metal, madera, etc. (”taps”) " + "\n"
                    + "y pausas. También puede ser representado gráficamente. " + "\n"
                    + "En este caso cada letra se traduce en dos series de " + "\n"
                    + "puntos separados por un espacio, que representan dos " + "\n"
                    + "números indicando la fila y columna que corresponde a la " + "\n"
                    + "letra en una matriz de claves de 5x5" + "\n");

            System.out.println("2. Existe la clase AdminPalabras la cual posee" + "\n"
                    + "una lista de palabras. Esta clase posee un método " + "\n"
                    + "ContarPalabrasPosibles() el cual recibe un String y " + "\n"
                    + "retorna la cantidad de palabras de la lista que son " + "\n"
                    + "posibles de formar con las letras del String recibido," + "\n"
                    + "cuidando que cada letra se puede usar una sola vez." + "\n"
                    + "Usted debe implementar el método ContarPalabrasPosibles()" + "\n"
                    + "de la clase AdminPalabras. A continuación se presenta un" + "\n"
                    + "esquema de esta clase, usted no puede modificar los" + "\n"
                    + "atributos de la clase, ni cambiar la firma del método." + "\n"
                    + "Si lo desea, puede agregar nuevos métodos a la clase." + "\n");

            //Consulto cuál ejercicio quiere ver
            teclado = new Scanner(System.in);
            System.out.println("Digite el ejercicio que quiere visualizar");
            ex = (Integer.parseInt(teclado.nextLine()));

            switch (ex) {

                case 1:
                    System.out.println("Escriba la frase que desea encriptar");
                    teclado = new Scanner(System.in);
                    frase = teclado.nextLine();
                    Ex1 x1 = new Ex1(frase);
                    x1.generar();
                    x1.mayuscula();
                    x1.encripta();
                    break;
                case 2:
                    int cont = 0;
                    teclado = new Scanner(System.in);
                    System.out.println("Digite el número de palabras que"
                            + " contendrá la lista");
                    n = teclado.nextInt();

                    //Defino cuales plabras estarán en la lista
                    teclado = new Scanner(System.in);
                    String lista[] = new String[n];
                    for (int c = 0; c < n; c++) {
                        System.out.println("Digite el valor de la posición " + c);
                        lista[c] = teclado.nextLine();
                    }
                    AdminPalabras admin = new AdminPalabras(lista);

                    //Declaro el número de palabras que proporcionaran las letras
                    String letras[];
                    System.out.println("Digite el número de palabras ");
                    m = teclado.nextInt();
                    teclado = new Scanner(System.in);
                    String palabras[] = new String[m];
                    //defino cuáles palabras estarán
                    for (int c = 0; c < m; c++) {
                        System.out.println("Digite el String de la posición " + c);
                        palabras[c] = teclado.nextLine();
                    }

                    for (int i = 0; i < palabras.length; i++) {
                        cont+= admin.ContarPalabrasPosibles(palabras[i]);
                        System.out.println("\n");

                    }
                    System.out.println("Número de palabras que pueden formarse " + (cont));

                default:

            }
            teclado = new Scanner(System.in);
            System.out.println("Desea continuar con otra operación S/N ");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }

}
