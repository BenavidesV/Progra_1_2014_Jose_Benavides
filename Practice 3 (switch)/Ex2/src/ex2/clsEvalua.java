/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import static java.lang.Math.sqrt;

/**
 *
 * @author Jose E
 */
public class clsEvalua {

    int num;

    public clsEvalua(int num) {
        this.num = num;
        
    }

    public int ultimo(int ultnum) {
        ultnum = num % 10;
        int resultado=0;
        if ((ultnum == 2) || (ultnum == 5) || (ultnum == 8)) {
            resultado= num*num;
        }
        if ((ultnum == 4) || (ultnum == 7) || (ultnum == 9)) {
            resultado= num*5;
        }
        if ((ultnum == 0) || (ultnum == 1) || (ultnum == 3)|| (ultnum == 6)) {
            resultado= num;
        }return resultado;
        }
}
