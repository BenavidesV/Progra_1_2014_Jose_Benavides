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
public class NodoDeListaString {

    private String dato;
    private NodoDeListaString siguiente;

    public NodoDeListaString() {
        dato="";
        siguiente=null;
        
    }

    /**
     * @return the dato
     */
    public String getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(String dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDeListaString getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeListaString siguiente) {
        this.siguiente = siguiente;
    }
   

}
