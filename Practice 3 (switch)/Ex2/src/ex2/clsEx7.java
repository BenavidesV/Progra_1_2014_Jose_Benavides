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
public class clsEx7 {

    private int dia, mes, diaS;
    private String salida;

    public clsEx7(int dia) {
        this.dia = dia;
    }

    public String dsemana(int dia) {
        diaS = dia;
        do {
            diaS = diaS - 7;
        } while (diaS > 7);
        
        switch (diaS) {
            case 1:
                salida="lunes";
                break;

            case 2:
                salida="martes";
                break;
            case 3:
                salida="miércoles";
                break;
            case 4:
                salida="jueves";
                break;
            case 5:
                salida="viernes";
                break;
            case 6:
               salida="sábado";
                break;
            case 7:
                salida="domingo";
                break;
        }return salida;
    }

}
