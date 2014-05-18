/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex15;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0, cont = 0, ci = 0;
        String imp="";
        char r = ' ';
        do {
            Scanner teclado = new Scanner(System.in);

            //Asigno los valores introducidos
            System.out.println("Digite el número de valores que desea visualizar "+"\n");
            n = Integer.parseInt(teclado.nextLine());
            //sumo los numeros pares e impares
            while (ci < n) {
                cont=cont+1;
                clsParidad t = new clsParidad(cont);
                if (t.parImpar() == false) {
                    imp=imp+" "+cont;
                    System.out.println(imp);
                    ci = ci + 1;  
                }
            }
            
            System.out.println("Desea continuar con otro número S/N");
            r = teclado.nextLine().charAt(0);
            imp="";
            ci=0;
            cont=0;
                    
        } while ((r == 's') || (r == 'S'));

    }

}
