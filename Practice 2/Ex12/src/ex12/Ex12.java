/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex12;

/**
 *
 * @author Jose E
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int m=0;
     double porc=0.02,inv=1000, cap=0;
     //Calculo el interés y se lo sumo al capital
     while(m<12){
         cap=(inv*0.02);
         m=m+1;
         inv=inv+cap;
         System.out.println("El balance de la inversión para el mes "+m+" es $ "+inv);
         
         
     }
    }
    
}
