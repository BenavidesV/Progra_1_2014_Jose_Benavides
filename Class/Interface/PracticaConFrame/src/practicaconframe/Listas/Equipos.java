/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaconframe.Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;

/**
 *
 * @author Jimenez
 */
public class Equipos {

    private NodoEquipo raiz;

    public void Insertar(String nombre, Jugadores jugadores) {
        NodoEquipo nuevo;
        NodoEquipo temp;
        nuevo = new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if (raiz == null) {
            raiz = nuevo;
        } else {
            if ((nuevo.getNombre().compareTo(raiz.getNombre()) < 0)) {
                nuevo.setSiguienteEquipo(raiz);
                raiz = nuevo;
            } else {
                NodoEquipo recorre = raiz;
                NodoEquipo atras = raiz;

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

    public void Imprimir() {
        NodoEquipo recorridoEquipo = raiz;

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

    public void Cargar() {
        Jugadores alemania = new Jugadores();
        alemania.Insertar("Klose", 36);
        alemania.Insertar("Luka", 26);
        alemania.Insertar("Reus", 23);
        alemania.Insertar("Duarte", 25);

        Jugadores costaRica = new Jugadores();
        costaRica.Insertar("Campbell", 21);
        costaRica.Insertar("Ruiz", 27);
        costaRica.Insertar("Navas", 26);
        costaRica.Insertar("Duarte", 25);
        costaRica.Insertar("Bolaños", 30);
        costaRica.EliminarJugador("Duarte");

        Jugadores honduras = new Jugadores();
        honduras.Insertar("Paco", 29);
        honduras.Insertar("Lola", 21);
        honduras.Insertar("Duarte", 25);
        honduras.Insertar("Chico", 24);

        Jugadores francia = new Jugadores();
        francia.Insertar("Zidane", 25);
        francia.Insertar("Ribery", 21);
        francia.Insertar("Duarte", 22);
        francia.Insertar("Sissoko", 29);

        Equipos equipos = new Equipos();
        equipos.Insertar("Francia", francia);
        equipos.Insertar("Alemania", alemania);
        equipos.Insertar("Honduras", honduras);
        equipos.Insertar("Costa Rica", costaRica);

        equipos.Imprimir();
    }

    public boolean EstaVacia() {
        return raiz == null;
    }
}
