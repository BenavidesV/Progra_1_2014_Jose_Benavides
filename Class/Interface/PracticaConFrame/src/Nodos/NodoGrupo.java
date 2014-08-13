/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nodos;

/**
 *
 * @author Jose E & Alvaro
 */
public class NodoGrupo {
    private String grupo;
    private NodoEquipo listaEquipos;
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
    public NodoEquipo getListaEquipos() {
        return listaEquipos;
    }

    /**
     * @param listaEquipos the listaEquipos to set
     */
    public void setListaEquipos(NodoEquipo listaEquipos) {
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
