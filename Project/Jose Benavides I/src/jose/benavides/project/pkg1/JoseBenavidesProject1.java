/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jose.benavides.project.pkg1;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class JoseBenavidesProject1 {

    public static void main(String[] args) {

        //defino la variables
        char continuar = ' ', b = ' ';
        boolean validar = true;
        String jugador1 = "", jugador2 = "";

        int largo=0, ancho=0, ele=0;
        do {

            Scanner teclado = new Scanner(System.in);
            //solicito el nombre a los jugadores
            System.out.println("Digite el nombre del jugador 1 ");
            jugador1 = teclado.nextLine();
            System.out.println("Digite el nombre del jugador 2 ");
            jugador2 = teclado.nextLine();
            clsJugadores jugador = new clsJugadores(jugador1, jugador2);
            
            boolean Error=true;
            while(Error){    
            try {
                    System.out.print("Largo= ");
                    largo = teclado.nextInt();
                    System.out.print("Ancho= ");
                    ancho = teclado.nextInt();
                    while (largo <= 0 || ancho <= 0 || (largo == 1 && ancho == 1)) {
                        System.out.println("Las dimesiones deben ser mayores");
                        System.out.print("Largo= ");
                        largo = teclado.nextInt();
                        System.out.print("Ancho= ");
                        ancho = teclado.nextInt();
                    }

                    System.out.println("Digite la cantidad de elementos (1-"
                            + ((largo * ancho) - 1) + ")");
                    ele = teclado.nextInt();

                    /**
                     * Cuando la cantidad de elementos es incorrecta se vuelve a
                     * solicitar
                     */
                    while ((ele >= (largo * ancho)) || ele < 1) {
                        System.out.println("La cantidad de elementos debe estar"
                                + " entre 1 y " + ((largo * ancho) - 1));
                        System.out.println("Digite la cantidad de elementos (1-"
                                + ((largo * ancho) - 1) + ")");
                        ele = teclado.nextInt();

                    }
                    break;

                } catch (Exception e) {
                   System.out.println("Debe colocar Numeros enteros");
                   teclado.nextLine(); 
                   Error=true;

                    
                    
                }}
            clsJuego jugar = new clsJuego(largo, ancho, ele);


            //Asigno la celda aliado y enemigo de cada jugador
            System.out.println(jugador.getJugador1()
                    + " Escriba A si quiere ser aliado"
                    + " o E si quiere ser enemigo");

            teclado = new Scanner(System.in);
            b = teclado.nextLine().charAt(0);
            if (b == 'A' || b == 'a') {
                jugar.EscogerJugadorAliado();
            } else {
                jugar.EscogerJugadorEnemigo();
            }

            System.out.println("Desea continuar S/N ");
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
