/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex15;

/**
 *
 * @author Familia
 */
public class clsParidad {
   private int n;

    public clsParidad(int pN) {
        this.n = pN;
    }

    public boolean parImpar() {

        boolean b;
        if (this.n % 2 == 0) {
            b = true;
        } else {
            b = false;
        }
        return b;

      
}}
