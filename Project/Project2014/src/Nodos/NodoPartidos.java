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
public class NodoPartidos {
    private String local;
    private int Glocal;
    private String visita;
    private int Gvisita;
    private NodoPartidos calendario;
    private String hora;
    private String fecha;
    private String sede;
    private String golesV;
    private String golesL;
    private int temperatura;
    private int humedad;
    private int viento;
    private NodoPartidos siguientePartido;

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the visita
     */
    public String getVisita() {
        return visita;
    }

    /**
     * @param visita the visita to set
     */
    public void setVisita(String visita) {
        this.visita = visita;
    }

    /**
     * @return the calendario
     */
    public NodoPartidos getCalendario() {
        return calendario;
    }

    /**
     * @param calendario the calendario to set
     */
    public void setCalendario(NodoPartidos calendario) {
        this.calendario = calendario;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the sede
     */
    public String getSede() {
        return sede;
    }

    /**
     * @param sede the sede to set
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    /**
     * @return the golesV
     */
    public String getGolesV() {
        return golesV;
    }

    /**
     * @param golesV the golesV to set
     */
    public void setGolesV(String golesV) {
        this.golesV = golesV;
    }

    /**
     * @return the golesL
     */
    public String getGolesL() {
        return golesL;
    }

    /**
     * @param golesL the golesL to set
     */
    public void setGolesL(String golesL) {
        this.golesL = golesL;
    }

    /**
     * @return the siguientePartido
     */
    public NodoPartidos getSiguientePartido() {
        return siguientePartido;
    }

    /**
     * @param siguientePartido the siguientePartido to set
     */
    public void setSiguientePartido(NodoPartidos siguientePartido) {
        this.siguientePartido = siguientePartido;
    }

    /**
     * @return the temperatura
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the humedad
     */
    public int getHumedad() {
        return humedad;
    }

    /**
     * @param humedad the humedad to set
     */
    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    /**
     * @return the viento
     */
    public int getViento() {
        return viento;
    }

    /**
     * @param viento the viento to set
     */
    public void setViento(int viento) {
        this.viento = viento;
    }

    /**
     * @return the Glocal
     */
    public int getGlocal() {
        return Glocal;
    }

    /**
     * @param Glocal the Glocal to set
     */
    public void setGlocal(int Glocal) {
        this.Glocal = Glocal;
    }

    /**
     * @return the Gvisita
     */
    public int getGvisita() {
        return Gvisita;
    }

    /**
     * @param Gvisita the Gvisita to set
     */
    public void setGvisita(int Gvisita) {
        this.Gvisita = Gvisita;
    }
    
    
    
}
