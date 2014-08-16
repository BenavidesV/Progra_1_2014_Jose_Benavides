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

/**
 *
 * @author Jose E & Alvaro
 */
public class Partidos {

    private NodoPartidos calendario;
    private Partidos siguientePartidos;

    public void Insertar(NodoPartidos partido){ 
        NodoPartidos nuevo;
        nuevo = new NodoPartidos();
        nuevo=partido;

        if (getCalendario() == null) {
            nuevo.setSiguientePartido(null);
            setCalendario(nuevo);

        } else {
            NodoPartidos auxiliar = getCalendario();
            while (auxiliar.getSiguientePartido() != null) {
                auxiliar = auxiliar.getSiguientePartido();
            }
            auxiliar.setSiguientePartido(nuevo);
        }

    }
//    public void Insertar(String local,int Glocal, String visita,int Gvisita,
//            String fecha,String hora, String sede, String golesV, String golesL, 
//            int temperautura, int viento, int humedad){ 
//        NodoPartidos nuevo;
//        nuevo = new NodoPartidos();
//        nuevo.setFecha(fecha);
//        nuevo.setHora(hora);
//        nuevo.setLocal(local);
//        nuevo.setGlocal(Glocal);
//        nuevo.setVisita(visita);
//        nuevo.setGvisita(Gvisita);
//        nuevo.setSede(sede);
//        nuevo.setGolesL(golesL);
//        nuevo.setGolesV(golesV);
//        nuevo.setTemperatura(temperautura);
//        nuevo.setViento(viento);
//        nuevo.setHumedad(humedad);
//
//        if (getCalendario() == null) {
//            nuevo.setSiguientePartido(null);
//            setCalendario(nuevo);
//
//        } else {
//            NodoPartidos auxiliar = getCalendario();
//            while (auxiliar.getSiguientePartido() != null) {
//                auxiliar = auxiliar.getSiguientePartido();
//            }
//            auxiliar.setSiguientePartido(nuevo);
//        }
//
//    }

    public void Imprimir(NodoPartidos SedeSeleccionada) {
        NodoPartidos recorridoP = SedeSeleccionada;
        System.out.println("Listado de todos los partido de la sede");
        while (recorridoP != null) {
            System.out.println(recorridoP.getSede());
            System.out.println(recorridoP.getLocal() + " - " + recorridoP.getVisita());
//            System.out.println(recorridoP.getLocal() +"\n"+ recorridoP.getGolesL());
//            System.out.println();
//            System.out.println(recorridoP.getVisita() +"\n"+ recorridoP.getGolesV());
            System.out.println();
            recorridoP = recorridoP.getSiguientePartido();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return getCalendario().getCalendario() == null;
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
     * @return the siguientePartidos
     */
    public Partidos getSiguientePartidos() {
        return siguientePartidos;
    }

    /**
     * @param siguientePartidos the siguientePartidos to set
     */
    public void setSiguientePartidos(Partidos siguientePartidos) {
        this.siguientePartidos = siguientePartidos;
    }

}
