/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosbusqueda;

/**
 *
 * @author Jose E
 */
public class clsBusquedaBinaria {

    public int BuscarNombre(String[] nombres, String busqueda) {
        int inicial = 0;
        int Elementofinal = nombres.length;
        while (inicial < Elementofinal) {
            int central = (inicial + Elementofinal) / 2;
            if (busqueda.compareTo(nombres[central]) > 0) {
                inicial = central + 1;
            } else {
                if (busqueda.compareTo(nombres[central]) < 0) {
                    Elementofinal=central-1;
                } else {
                    return central;
                }
            }
            
        }return -1;
    }}
