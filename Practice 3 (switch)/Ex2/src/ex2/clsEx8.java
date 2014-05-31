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
public class clsEx8 {

    private int ad;
    private String dw;

    public clsEx8(String dw) {
        this.dw = dw;
    }
//defino el primer dia del mes
    public int nd() {
        if (dw == "lunes" || dw == "Lunes") {
            ad = 0;
        } else if (dw == "martes" || dw == "Martes") {
            ad = 1;
        } else if (dw == "miercoles" || dw == "Miercoles") {
            ad = 2;
        } else if (dw == "jueves" || dw == "Jueves") {
            ad = 3;
        } else if (dw == "viernes" || dw == "Viernes") {
            ad = 4;
        } else if (dw == "sábado" || dw == "Sábado") {
            ad = 5;
        } else if (dw == "domingo" || dw == "Domingo") {
            ad = 6;
        } else {
            System.out.println("Esa información no corresponde a ningún día de la semana");
        }
        return ad;
    }

}
