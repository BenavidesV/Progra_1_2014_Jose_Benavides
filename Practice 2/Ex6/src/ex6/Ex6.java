/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex6;

/**
 *
 * @author Jose E
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**Despliego los números de 5 dígitos que 
        * pueden formarse con los digitos del 1 al 9
        */
        System.out.println("Los numeros de 5 dígitos resultado de la combinación de digitos entre 1 y 9 son: ");
        for (int j = 11111; j <= 99999; j++) {
            
            if (j%10!=0){
                System.out.println(j);
            }
            
    }
    }
}
   
