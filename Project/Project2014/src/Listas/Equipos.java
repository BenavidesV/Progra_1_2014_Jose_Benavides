/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoEquipoenGrupo;
import Nodos.NodoJugador;

/**
 *
 * @author Jose E & Alvaro
 */
public class Equipos {

    private NodoEquipo raiz;
    private NodoEquipoenGrupo EquipoGrupo;
    private Equipos SiguienteEquipos;

    public void Insertar(String nombre, Jugadores jugadores, Jugadores goleadores) {
        NodoEquipo nuevo;
        NodoEquipo temp;
        nuevo = new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        nuevo.setGoleadores(jugadores.getGoleadores());
        if (getRaiz() == null) {
            setRaiz(nuevo);
        } else {
            if ((nuevo.getNombre().compareTo(getRaiz().getNombre()) < 0)) {
                nuevo.setSiguienteEquipo(getRaiz());
                setRaiz(nuevo);
            } else {
                NodoEquipo recorre = getRaiz();
                NodoEquipo atras = getRaiz();

                while (((nuevo.getNombre().compareTo(recorre.getNombre())) >= 0) && recorre.getSiguienteEquipo() != null) {
                    atras = recorre;
                    recorre = recorre.getSiguienteEquipo();

                }
                if (nuevo.getNombre().compareTo(recorre.getNombre()) > 0) {
                    recorre.setSiguienteEquipo(nuevo);
                } else {
                    nuevo.setSiguienteEquipo(recorre);
                    atras.setSiguienteEquipo(nuevo);
                }

            }
        }
    }
    public void InsertarEnGrupo(String nombre, int PJ,int ganados,int empatados,
            int perdidos,int gFavor,int gContra,int Gdif,int Pts) {
        NodoEquipoenGrupo nuevo;
        NodoEquipoenGrupo temp;
        nuevo = new NodoEquipoenGrupo();
        nuevo.setNombre(nombre);
        nuevo.setPJ(PJ);
        nuevo.setG(ganados);
        nuevo.setE(empatados);
        nuevo.setP(perdidos);
        nuevo.setGF(gFavor);
        nuevo.setGC(gContra);
        nuevo.setGd(Gdif);
        nuevo.setPts(Pts);
        if (getEquipoGrupo()== null) {
            setEquipoGrupo(nuevo);
        } else {
            if ((nuevo.getPts()< getEquipoGrupo().getPts())) {
                nuevo.setSiguienteEquipo(getEquipoGrupo());
                setEquipoGrupo(nuevo);
            } else {
                NodoEquipoenGrupo recorre = getEquipoGrupo();
                NodoEquipoenGrupo atras = getEquipoGrupo();

                while ((nuevo.getPts() >= recorre.getPts()) && recorre.getSiguienteEquipo() != null) {
                    atras = recorre;
                    recorre = recorre.getSiguienteEquipo();

                }
                if (nuevo.getPts()>= recorre.getPts()) {
                    recorre.setSiguienteEquipo(nuevo);
                } else {
                    nuevo.setSiguienteEquipo(recorre);
                    atras.setSiguienteEquipo(nuevo);
                }

            }
        }
    }

    public void Imprimir() {
        NodoEquipo recorridoEquipo = getRaiz();

        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoEquipo != null) {
            System.out.println(recorridoEquipo.getNombre());
            NodoJugador recorridoJugadores = recorridoEquipo.getJugadores();

            while (recorridoJugadores != null) {
                System.out.println(recorridoJugadores.getNombre() + " " + recorridoJugadores.getEdad());
                recorridoJugadores = recorridoJugadores.getSiguienteJugador();
            }
            recorridoEquipo = recorridoEquipo.getSiguienteEquipo();
        }

    }

    public boolean EstaVacia() {
        return getRaiz() == null;
    }

    /**
     * @return the raiz
     */
    public NodoEquipo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoEquipo raiz) {
        this.raiz = raiz;
    }

    /**
     * @return the EquipoGrupo
     */
    public NodoEquipoenGrupo getEquipoGrupo() {
        return EquipoGrupo;
    }

    /**
     * @param EquipoGrupo the EquipoGrupo to set
     */
    public void setEquipoGrupo(NodoEquipoenGrupo EquipoGrupo) {
        this.EquipoGrupo = EquipoGrupo;
    }

    /**
     * @return the SiguienteEquipos
     */
    public Equipos getSiguienteEquipos() {
        return SiguienteEquipos;
    }

    /**
     * @param SiguienteEquipos the SiguienteEquipos to set
     */
    public void setSiguienteEquipos(Equipos SiguienteEquipos) {
        this.SiguienteEquipos = SiguienteEquipos;
    }
}
