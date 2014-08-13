/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaconframe.Listas;

import Nodos.NodoEquipo;
import Nodos.NodoGrupo;
import Nodos.NodoJugador;


/**
 *
 * @author Jose E & Alvaro
 */
public class Grupos {

    //Raiz es la lista de equipos de cada grupo
    private NodoGrupo raiz;

    public void Crear(String grupo, NodoEquipo equipo) {

        NodoGrupo nuevo;
        nuevo = new NodoGrupo();
        nuevo.setGrupo(grupo);
        nuevo.setListaEquipos(equipo);
        if (raiz == null) {
            nuevo.setSiguienteGrupo(null);
            raiz = nuevo;
        } else {
            NodoGrupo auxiliar = raiz;
            while (auxiliar.getSiguienteGrupo() != null) {
                auxiliar = auxiliar.getSiguienteGrupo();
            }
            auxiliar.setSiguienteGrupo(nuevo);
        }

    }

    public void Imprimir() {
        NodoGrupo recorridoG = raiz;

        System.out.println("Listado de todos los equipos");
        while (recorridoG != null) {
            System.out.println(recorridoG.getGrupo());

            NodoEquipo recorridoE = recorridoG.getListaEquipos();
            while (recorridoE != null) {
                System.out.println(recorridoE.getNombre());
                recorridoE = recorridoE.getSiguienteEquipo();
            }
            recorridoG = recorridoG.getSiguienteGrupo();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return raiz == null;
    }


}
