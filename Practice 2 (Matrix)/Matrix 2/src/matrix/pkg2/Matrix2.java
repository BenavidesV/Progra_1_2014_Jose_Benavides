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
            System.out.println("Bienvenido"+"\n"+
                    "Introduzca los datos de la matriz"+"\n");
            teclado = new Scanner(System.in);
            System.out.println("Digite el número de filas");
            n = teclado.nextInt();
            System.out.println("Digite el número de columnas");
            m = teclado.nextInt();
            
            teclado = new Scanner(System.in);
            System.out.println("Que desea hacer"+"\n"+
                    "1. Calcular el promedio de la matriz"+"\n"+
                    "2. Muestra el mayor de los impares"+"\n"+
                    "3. Imprimir el promedio de los pares"+"\n"+
                    "4. Calcular el porcentaje de impares de cada fila"+"\n"+
                    "5. Ordenar cada fila"+"\n"+
                    "6. Imprimir el mayor de cada fila"+"\n"+
                    "7. Imprimir el menor de cada columna"+"\n"+
                    "8. Iumprimir el menor impar de cada fila"+"\n"+
                    "9. Imprimir los datos cuya suma de dígitos sea 7"+"\n"+
                    "10. Imprimir las filas que contienen la mayor cantidad de datos pares"+"\n"+
                    "11. Calcular la suma de dígitos de cada fila"+"\n"+
                    "12. Imprimir los datos cuyo mayor dígito es 5"+"\n"+
                    "13. Calcular el promedio de la matriz"+"\n");
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
                case 2:
                    //Imprimir el mayor de los impares
                    
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
