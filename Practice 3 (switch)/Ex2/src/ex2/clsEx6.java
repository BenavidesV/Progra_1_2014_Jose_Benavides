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
public class clsEx6 {

    int dia, mes, anno;

    public clsEx6(int dia, int mes, int anno) {
        this.dia = dia;
        this.mes = mes;
        this.anno = anno;
    }

    int cdia() {

        if (dia == 1) {
            if (mes == 3) {
                clsEx4 x4 = new clsEx4((mes), anno);
                if (x4.bis() == true) {
                    dia = 29;
                } else {
                    dia = 28;
                }

            } else {
                clsEx4 x4 = new clsEx4((mes - 1), anno);
                if (x4.ndias() == 31) {
                    dia = 31;
                } else {
                    dia = 30;
                }
            }
        } else {
            dia = dia - 1;
        }
        return dia;
    }

    int cmes() {
        if (dia == 1) {
            if (mes == 1) {
                mes = 12;
            } else {
                mes = mes - 1;
            }
        }
        return mes;
    }

    int canno() {
        if ((dia == 1) && (mes == 1)) {
            anno = anno - 1;
        }
        return anno;
    }

}
