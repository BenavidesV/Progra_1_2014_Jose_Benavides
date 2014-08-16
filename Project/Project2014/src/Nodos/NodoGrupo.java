/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nodos;

import Listas.Equipos;

/**
 *
 * @author Jose E & Alvaro
 */
public class NodoGrupo {
    private String grupo;
    private Equipos listaEquipos;
    private NodoGrupo siguienteGrupo;

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the listaEquipos
     */
    public Equipos getListaEquipos() {
        return listaEquipos;
    }

    /**
     * @param listaEquipos the listaEquipos to set
     */
    public void setListaEquipos(Equipos listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    /**
     * @return the siguienteGrupo
     */
    public NodoGrupo getSiguienteGrupo() {
        return siguienteGrupo;
    }

    /**
     * @param siguienteGrupo the siguienteGrupo to set
     */
    public void setSiguienteGrupo(NodoGrupo siguienteGrupo) {
        this.siguienteGrupo = siguienteGrupo;
    }

    
    
}
