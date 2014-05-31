/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 0;
        Scanner oScanner = new Scanner(System.in);
        do {
            System.out.println("Digite la opción que desea: ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            opc = oScanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Escriba el correo electrónico a validar");
                    oScanner=new Scanner(System.in);
                    clsEj1 oclsEj1 = new clsEj1(oScanner.nextLine());
                    System.out.println(oclsEj1.Validacorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    clsEj2 oclsEj2=new clsEj2();
                    oScanner=new Scanner(System.in);
                    oclsEj2.setCadena(oScanner.nextLine());
                    System.out.println("Mitad "+oclsEj2.MediaCadena());
                    System.out.println("Ultimo "+oclsEj2.UltimoValor());
                    System.out.println("Al revez "+oclsEj2.Alrevez());
                    System.out.println("Dividido "+oclsEj2.Dividido());
                    System.out.println("Contiene "+oclsEj2.Vocales()+" vocales");
                    System.out.println(oclsEj2.Palindromo());
                    
                    
                    break;
                            }
        } while (opc <= 2);
    }

}
