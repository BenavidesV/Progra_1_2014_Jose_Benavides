/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.string;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class clsInvertir {

    private String cadena;
    

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String reverso() {
        String retorno = "";

        for (int i = getCadena().length() - 1; i >= 0; i--) {
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String crearP() {
        String ret = "";
        for (int i = getCadena().length() - 2; i >= 0; i--) {

            ret += getCadena().charAt(i);
        }
        ret = getCadena() + ret;
        return ret;

    }

    public String busca(String buscar) {
        String nuevacadena = "";
        
            nuevacadena=getCadena().replaceAll(cadena, buscar);
        return nuevacadena;
    }

}
