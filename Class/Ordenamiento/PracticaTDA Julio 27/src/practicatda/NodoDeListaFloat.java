/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatda;

/**
 *
 * @author Jose E
 */
public class NodoDeListaFloat {

    private float dato;
    private NodoDeListaFloat siguiente;

    public NodoDeListaFloat() {
        dato=0;
        siguiente=null;
        
    }

    /**
     * @return the dato
     */
    public float getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(float dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDeListaFloat getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeListaFloat siguiente) {
        this.siguiente = siguiente;
    }
   

}
