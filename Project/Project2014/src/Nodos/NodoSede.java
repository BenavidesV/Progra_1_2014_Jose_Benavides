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
public class NodoSede {
    private String estadio;
    private NodoPartidos partidosD;
    private NodoSede siguienteSede;

    public void setPartidosD(NodoPartidos partidosD) {
        this.partidosD = partidosD;
    }

    public NodoPartidos getPartidosD() {
        return partidosD;
    }

    /**
     * @return the estadio
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public NodoSede getSiguienteSede() {
        return siguienteSede;
    }

    public void setSiguienteSede(NodoSede siguienteSede) {
        this.siguienteSede = siguienteSede;
    }
    
}
