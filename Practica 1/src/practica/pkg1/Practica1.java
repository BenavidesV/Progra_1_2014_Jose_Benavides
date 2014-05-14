/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.Scanner;
import sun.misc.ASCIICaseInsensitiveComparator;

/**
 *
 * @author profe
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N=10;
        double A=5.0;
        char C='p';
        Scanner teclado= new Scanner(System.in); 
       
        //Asigno los valores
        System.out.print("Digite el valor de N ");
        N=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de A ");
        A=Double.parseDouble(teclado.nextLine());
        
        System.out.print("Digite el valor de C ");
        C= teclado.nextLine().charAt(0);
        
         int ascii = (int)C;
                
        System.out.print("Valores: "+"\n"+
                "N= "+ N +"\n"+
                "A= "+ A +"\n"+
                "C= "+ "El valor numerico de C es: "+ascii+"\n");
        
       
        
        //imprime la suma de N+A
        System.out.print("La suma de N+A es: "+(N+A)+"\n"+
                "La difrencia de A-N es: "+(A-N)+"\n");
    }
}
