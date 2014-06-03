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
//Método constructor
    public clsInvertir(String cadena) {
        this.cadena = cadena;
    }
//Muestra el inverso del String
    public String reverso() {
        String retorno="";
       
        for (int i = getCadena().length()-1; i >= 0; i--) {
            retorno+=getCadena().charAt(i);
        }        
        return retorno; 
        }
//crea el palíndromo
    public String crearP() {
        String ret = "";
        for (int i = getCadena().length() - 2; i >= 0; i--) {

            ret += getCadena().charAt(i);
        }
        ret = getCadena() + ret;
        return ret;

    }
//Realiza una búsqueda dentro del la frase
    public String Busca(String buscar) {
        String nuevacadena = "";

        nuevacadena = getCadena().replaceAll(buscar, "*"+buscar+"*");
        return nuevacadena;
    }
//Calcula el número de inicidencias de una palabra
    public int cuenta(String palabra){
    int cont=0;
        for (int i = 0; i <=getCadena().length(); i++) {
            if (getCadena().startsWith(palabra,i)==true){
            cont++;
            }
        }
    return cont;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

}
