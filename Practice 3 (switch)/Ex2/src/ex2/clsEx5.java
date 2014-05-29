/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Jose E
 */
public class clsEx5 {

    private int n;
    int m, c, d, u;
    String Rom = "", ns = "", ms = "", cs = "", ds = "", us = "";

    public clsEx5(int n) {
        this.n = n;
    }

    public String numR() {
        ns = Integer.toString(n);
        m = n / 1000;
        c = (n % 1000) / 100;
        d = (n % 100) / 10;
        u = n % 10;
        //PARA LOS MILLARES
        switch (m) {
            case 0:
                ms = "";
                break;
            case 1:
                ms = "M";
                break;
            case 2:
                ms = "MM";
                break;
            case 3:
                ms = "MMM";
                break;
        }
        //PARA LAS CENTENAS
        switch (c) {
            case 0:
                cs = "";
                break;
            case 1:
                cs = "C";
                break;
            case 2:
                cs = "CC";
                break;
            case 3:
                cs = "CCC";
                break;
            case 4:
                cs = "CD";
                break;
            case 5:
                cs = "D";
                break;
            case 6:
                cs = "DC";
                break;
            case 7:
                cs = "DCC";
                break;
            case 8:
                cs = "DCCC";
                break;
            case 9:
                cs = "CM";
                break;
            //PARA LAS DECENAS
        }
        switch (d) {
            case 0:
                ds = "";
                break;
            case 1:
                ds = "X";
                break;
            case 2:
                ds = "XX";
                break;
            case 3:
                ds = "XXX";
                break;
            case 4:
                ds = "XL";
                break;
            case 5:
                ds = "L";
                break;
            case 6:
                ds = "LX";
                break;
            case 7:
                ds = "LXX";
                break;
            case 8:
                ds = "LXXX";
                break;
            case 9:
                ds = "XC";
                break;
        }
        //PARA LAS UNIDADES
        switch (u) {
            case 0:
                us = "";
                break;
            case 1:
                us = "I";
                break;
            case 2:
                us = "II";
                break;
            case 3:
                us = "III";
                break;
            case 4:
                us = "IV";
                break;
            case 5:
                us = "V";
                break;
            case 6:
                us = "VI";
                break;
            case 7:
                us = "VII";
                break;
            case 8:
                us = "VIII";
                break;
            case 9:
                us = "IX";
                break;
        }
        Rom = ms + cs + ds + us;
        return Rom;

    }
}
