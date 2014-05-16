/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y,sumx, mulx, divx, restx;
        double n, m,suma, mul, div, rest;
        Scanner teclado =new Scanner(System.in);
        
        
        System.out.print("Digite el valor de x ");
        x=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de y ");
        y=Integer.parseInt(teclado.nextLine());
        
        System.out.print("Digite el valor de n ");
        n=Double.parseDouble(teclado.nextLine());
        
        System.out.print("Digite el valor de m ");
        m=Double.parseDouble(teclado.nextLine());
        
        //Realiza las operaciones + - / y *
        sumx=x+y;
        mulx=x*y;
        divx=x/y;
        restx=x-y;
        
        suma=n+m;
        mul=n*m;
        div=n/m;
        rest=n-m;
        
        System.out.print("Los valores son: "+"\n"+
                "x= "+x+"\n"+
                "y= "+y+"\n"+
                "n= "+n+"\n"+
                "m= "+m+"\n"+"\n"+
                "EL resultado de las operaciones es: "+"\n"+
                "x+y= "+sumx+"\n"+
                "x-y= "+restx+"\n"+
                "x*y= "+mulx+"\n"+
                "x/y= "+divx+"\n"+"\n"+
                "n+m= "+suma+"\n"+
                "n-m= "+rest+"\n"+
                "n*m= "+mul+"\n"+
                "n/m= "+div+"\n"+"\n");
        
        
    }
}
