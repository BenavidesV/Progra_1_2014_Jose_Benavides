/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex3;
import java.util.Scanner;
/**
 *
 * @author Jose E
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables
        int N, inc, rest, dob;
        
        Scanner teclado =new Scanner (System.in);
        
        //Le asigno un valor
        System.out.print("Digite el valor de N ");
        N=Integer.parseInt(teclado.nextLine());
        
        //Incremetar 77
        inc=N+77;
        
        //Restar 3
        rest=N-3;
        
        //Duplicar
        dob=N*2;
        
        // Muestra el resultado de las operaciones
        System.out.print("El resultado es: "+"\n"+
                "N+77= "+inc+"\n"+
                "N-3= "+rest+"\n"+
                "N*2= "+dob+"\n");
    }
    
}
