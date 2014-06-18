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
public class Matrix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char continuar = ' ';
        int ex = 0, n, m;
        boolean validar = true;
        Scanner teclado = new Scanner(System.in);

        do {
            
            teclado = new Scanner(System.in);
            System.out.println("Digite el número de filas");
            n = teclado.nextInt();
            System.out.println("Digite el número de columnas");
            m = teclado.nextInt();
            
            teclado = new Scanner(System.in);
            System.out.println("Digite el número de ejercicio");
            ex = (Integer.parseInt(teclado.nextLine()));

            //Cargo los datos de la matriz
            clsCargar cargar = new clsCargar();
            cargar.cargarMatriz(n, m);
            

            switch (ex) {

                case 1:
                    //Mostrar el promedio
                    clsN1 oN1=new clsN1(cargar.getEnteros());
                    oN1.promedio(n, m);
                    

                    break;

                
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
