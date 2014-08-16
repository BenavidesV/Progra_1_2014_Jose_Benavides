/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;
import Nodos.NodoPartidos;
import Nodos.NodoSede;
import Listas.Partidos;

/**
 *
 * @author Jose E & Alvaro
 */
public class Sedes {

    private NodoSede raiz;
    

    public void Insertar(String nombre, NodoPartidos LPartidos) {
        NodoSede nuevo;
        nuevo = new NodoSede();
        nuevo.setEstadio(nombre);
        nuevo.setPartidosD(LPartidos);
        if (raiz.getEstadio() == null) {
            nuevo.setSiguienteSede(null);
            raiz = nuevo;
        } else {

            NodoSede auxiliar = nuevo;
            while (auxiliar.getSiguienteSede() != null) {
                auxiliar = auxiliar.getSiguienteSede();
            }
            auxiliar.setSiguienteSede(nuevo);

        }
    }

    public void Imprimir() {
        NodoSede recorridoS = raiz;

        System.out.println("Listado de todos las sedes");
        while (recorridoS != null) {
            System.out.println(recorridoS.getEstadio());

            NodoPartidos recorridoP = recorridoS.getPartidosD();
            while (recorridoP != null) {
                System.out.println(recorridoP.getLocal() + recorridoP.getVisita());
                recorridoP = recorridoP.getSiguientePartido();
            }
            recorridoS = recorridoS.getSiguienteSede();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return raiz == null;
    }

    public NodoSede getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoSede raiz) {
        this.raiz = raiz;
    }

}
