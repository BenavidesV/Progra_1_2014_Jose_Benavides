/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion.jose.benavides;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class AdminPalabras {

    private String[] listaPalabras;

    public AdminPalabras(String[] lista) {
        listaPalabras = lista;
    }

    public int ContarPalabrasPosibles(String letras) {
        int cont = 0, c2 = 0, cant = 0, cant2 = 0;
        String sub = "", nuevasletras;

        for (int i = 0; i < listaPalabras.length; i++) {
            for (int j = 1; j <= listaPalabras[i].length(); j++) {
                nuevasletras = letras;
                String palabra = listaPalabras[i];
                //crea un substring (una letra)para buscarla en las palabras
                sub = listaPalabras[i].substring(j - 1, j);
                //System.out.println(sub);
                while (nuevasletras.indexOf(sub) > -1) {
                    nuevasletras = nuevasletras.substring(nuevasletras.indexOf(sub)
                            + sub.length(), nuevasletras.length());
                    cant++;
                }
                while (palabra.indexOf(sub) > -1) {
                    palabra = palabra.substring(palabra.indexOf(sub)
                            + sub.length(), palabra.length());
                    cant2++;
                }
                if (cant >= cant2) {
                    cont++;
                }
                if (cont == listaPalabras[i].length()) {
                    c2++;
                }
            }

           
            //System.out.println(listaPalabras[i] + " contador " + c2);
            cant2 = 0;
            cant = 0;
            cont = 0;

        }
        return c2;
    }

    /**
     * @return the listaPalabras
     */
    public String[] getListaPalabras() {
        return listaPalabras;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(String[] listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
}
