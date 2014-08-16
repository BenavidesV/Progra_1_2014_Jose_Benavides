/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoGrupo;
import Nodos.NodoJugador;
import Listas.Equipos;
import Nodos.NodoEquipoenGrupo;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jose E & Alvaro
 */
public class Grupos {

    private NodoGrupo grupoX;

    public void Crear(String grupo, Equipos equipo) {

        NodoGrupo nuevo;
        nuevo = new NodoGrupo();
        nuevo.setGrupo(grupo);
        nuevo.setListaEquipos(equipo);
        if (getGrupoX() == null) {
            nuevo.setSiguienteGrupo(null);
            setGrupoX(nuevo);
        } else {
            NodoGrupo auxiliar = getGrupoX();
            while (auxiliar.getSiguienteGrupo() != null) {
                auxiliar = auxiliar.getSiguienteGrupo();
            
            auxiliar.setSiguienteGrupo(nuevo);
        }

    }}

    public void Imprimir() {
        NodoGrupo recorridoG = getGrupoX();

        System.out.println("Listado de todos los equipos");
        while (recorridoG != null) {
            System.out.println(recorridoG.getGrupo());
            //System.out.println(recorridoG.getListaEquipos().getEquipoGrupo().getNombre()); 
            
            recorridoG = recorridoG.getSiguienteGrupo();
        }
        System.out.println();
    }

//    DefaultListModel imprimir() {
//        NodoGrupo recG = getGrupoX();
//        DefaultListModel model = new DefaultListModel();
//        while (recG != null) {
//            model.addElement(recG.getListaEquipos().getNombre() + "       |        " 
//                    + recG.getListaEquipos().g + "       |       " + datos[i].next + "       |        " + datos[i].prev);
//        }
//        return model;
//    }

    public boolean EstaVacia() {
        return getGrupoX() == null;
    }

    /**
     * @return the grupoX
     */
    public NodoGrupo getGrupoX() {
        return grupoX;
    }

    /**
     * @param grupoX the grupoX to set
     */
    public void setGrupoX(NodoGrupo grupoX) {
        this.grupoX = grupoX;
    }

}
