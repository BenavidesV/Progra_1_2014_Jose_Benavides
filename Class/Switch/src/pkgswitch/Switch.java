/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;
        double resultado = 0;
        char continuar = ' ';
        boolean validar = true;
        int opc = 0;

        Scanner teclado = new Scanner(System.in);
        Operaciones u = new Operaciones();

        do {
            System.out.println("Digite la operación a evaluar ");
            System.out.println("1. Suma ");
            System.out.println("2. Resta ");
            System.out.println("3. División ");
            System.out.println("4. Multiplicación ");
            System.out.println("5. Raíz cuadrada (primer valor) ");
            System.out.println("6. Potencia ");
            opc = teclado.nextLine().charAt(0);

            switch (opc) {
                case '1':
                    System.out.println("Digite el valor del primer dígito");

                    valor1 = Integer.parseInt(teclado.nextLine());

                    System.out.println("Digite el valor del segundo dígito");

                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = u.Suma(valor1, valor2);
                    System.out.println("= "+resultado);
                    break;
                case '2':
                    System.out.println("Digite el valor del primer dígito");

                    valor1 = Integer.parseInt(teclado.nextLine());

                    System.out.println("Digite el valor del segundo dígito");

                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = u.Resta(valor1, valor2);
                    System.out.println("= "+resultado);
                    break;
                case '3':
                    System.out.println("Digite el valor del primer dígito");

                    valor1 = Integer.parseInt(teclado.nextLine());

                    System.out.println("Digite el valor del segundo dígito");

                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = u.divida(valor1, valor2);
                    System.out.println("= "+resultado);
                    break;
                case '4':
                    System.out.println("Digite el valor del primer dígito");

                    valor1 = Integer.parseInt(teclado.nextLine());

                    System.out.println("Digite el valor del segundo dígito");

                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = u.multiplica(valor1, valor2);
                    System.out.println("= "+resultado);
                    break;
                case '5':
                    System.out.println("Digite el valor del primer dígito");

                    valor1 = Integer.parseInt(teclado.nextLine());

                    resultado = u.raiz(valor1);
                    System.out.println("= "+resultado);
                    break;
                case '6':
                    System.out.println("Digite el valor del primer dígito");

                    valor1 = Integer.parseInt(teclado.nextLine());

                    System.out.println("Digite el valor del segundo dígito");

                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = u.potencia(valor1, valor2);
                    System.out.println("= "+resultado);
                    break;
                default:

            }

            System.out.println("Desea continuar con otra operación S/N ");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            }
            else {
                validar = false;
            }

        } while (validar);
    }
}
