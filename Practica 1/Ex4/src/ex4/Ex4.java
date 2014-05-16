/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex4;
import java.util.Scanner;
/**
 *
 * @author Jose E
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Declaro las variables
        int a, b, c, d, t;
        
      //le asigno un vaor a cada una
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite el valor de A ");
        a=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de B ");
        b=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de C ");
        c=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de D ");
        d=Integer.parseInt(teclado.nextLine());
        
        //intercambio los valores
        t=a;
        a=d;
        d=b;
        b=c;
        c=t;
        //Muestro los valores iniciales y finales
        System.out.print("Valores iniciales "+"\n"+
                "A= "+c+"\n"+
                "B= "+d+"\n"+
                "C= "+b+"\n"+
                "D= "+a+"\n"+"\n"+
                "Valores Finales"+"\n"+
                "A= "+a+"\n"+
                "B= "+b+"\n"+
                "C= "+c+"\n"+
                "D= "+d+"\n"+"\n");
    }
    
}
