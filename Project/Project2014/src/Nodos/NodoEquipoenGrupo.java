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
public class NodoEquipoenGrupo 
{    
    private String nombre;
    private int PJ, G,E,P,GF,GC,Gd,Pts;
    private NodoEquipoenGrupo siguienteEquipo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the siguienteEquipo
     */
    public NodoEquipoenGrupo getSiguienteEquipo() {
        return siguienteEquipo;
    }

    /**
     * @param siguienteEquipo the siguienteEquipo to set
     */
    public void setSiguienteEquipo(NodoEquipoenGrupo siguienteEquipo) {
        this.siguienteEquipo = siguienteEquipo;
    }

    /**
     * @return the PJ
     */
    public int getPJ() {
        return PJ;
    }

    /**
     * @param PJ the PJ to set
     */
    public void setPJ(int PJ) {
        this.PJ = PJ;
    }

    /**
     * @return the G
     */
    public int getG() {
        return G;
    }

    /**
     * @param G the G to set
     */
    public void setG(int G) {
        this.G = G;
    }

    /**
     * @return the E
     */
    public int getE() {
        return E;
    }

    /**
     * @param E the E to set
     */
    public void setE(int E) {
        this.E = E;
    }

    /**
     * @return the P
     */
    public int getP() {
        return P;
    }

    /**
     * @param P the P to set
     */
    public void setP(int P) {
        this.P = P;
    }

    /**
     * @return the GF
     */
    public int getGF() {
        return GF;
    }

    /**
     * @param GF the GF to set
     */
    public void setGF(int GF) {
        this.GF = GF;
    }

    /**
     * @return the GC
     */
    public int getGC() {
        return GC;
    }

    /**
     * @param GC the GC to set
     */
    public void setGC(int GC) {
        this.GC = GC;
    }

    /**
     * @return the Gd
     */
    public int getGd() {
        return Gd;
    }

    /**
     * @param Gd the Gd to set
     */
    public void setGd(int Gd) {
        this.Gd = Gd;
    }

    /**
     * @return the Pts
     */
    public int getPts() {
        return Pts;
    }

    /**
     * @param Pts the Pts to set
     */
    public void setPts(int Pts) {
        this.Pts = Pts;
    }
       
}
