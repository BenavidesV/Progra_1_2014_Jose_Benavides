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
        int opcion=0;
        String buscar;
        Scanner oScanner=new Scanner(System.in);
        
        do{            
            System.out.println("Digite la opcion que desea : ");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            opcion=oScanner.nextInt();
             switch(opcion)
            {
                case 1:
                    System.out.println("Escriba la frase que desea evaluar");    
                    oScanner=new Scanner(System.in);
                    clsInvertir inv=new clsInvertir();
                    
                    System.out.println(inv.getCadena()+"Invertido "+inv.reverso());
                    System.out.println(inv.getCadena()+"Palindromo "+inv.crearP());
                    System.out.println("Escriba la palabra que busca: ");
                    buscar=oScanner.nextLine();
                    System.out.println(inv.getCadena()+"Resultado de la búsqueda "+inv.busca(buscar));
                break;
    }
    
}while(opcion<=7);
    }}
