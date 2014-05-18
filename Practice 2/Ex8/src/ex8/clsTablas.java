/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author Jose E
 */
public class clsTablas {

    private int num;

    //Método constructor
    public clsTablas(int pNum) {
        this.num = pNum;
    }

    //Método que calcula la tabla con ciclo While
    public String calculaWhile() {
//Variable para almacernar la tabla
        String tabla = "";
        int cont = 1, r;
        while (cont <= 10) {
            r = this.num * cont;
            tabla = tabla + "\n" + this.num
                    + "*" + cont + "=" + r;
            cont++;
        }
        return tabla;
    }
//método que calcula la tabla con ciclo do while

    public String calculaDowhile() {
        String tabla = "";
        int cont = 1, r;
        do {
            r = this.num * cont;
            tabla = tabla + "\n" + this.num
                    + "*" + cont + "=" + r;
            cont++;
        } while (cont < 11);
        return tabla;
    }
//método que calcula la tabla usando ciclo for

    public String calculaFor() {
        String tabla = "";
        int r;
        for (int i = 1; i <= 10; i++) {
            r=this.num*i;
            tabla = tabla + "\n" + this.num
                    + "*" + i + "=" + r;
        }
        return tabla;
    }
}
