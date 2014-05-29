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
public class clsEx4 {

    int mes, anno, dias;
    boolean b;

    public clsEx4(int mes, int anno) {
        this.mes = mes;
        this.anno = anno;
    }

    public boolean bis() {
        if ((anno % 4 == 0) && (anno % 100 != 0) || (anno % 400 == 0)) {
            b = true;

        } else {
            b = false;
        }
        return b;

    }

    public int ndias() {
        if (mes == 2) {
            if (bis() == false) {
                dias = 28;
            } else {
                dias = 29;
            }
        } else if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
            dias = 31;
        } else {
            dias = 30;
        }
        System.out.println(b);
        return dias;
    }

}
