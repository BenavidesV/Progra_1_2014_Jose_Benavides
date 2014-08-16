/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;

/**
 *
 * @author Jose E & Alvaro
 */
public class Jugadores {

    private NodoJugador listaJugadores;
    private NodoJugador goleadores;

    public void Insertar(String nombre, int edad, int goles) {
        NodoJugador nuevo;
        NodoJugador nuevoGol;

        nuevo = new NodoJugador();
        nuevoGol = new NodoJugador();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setGoles(goles);
        
        nuevoGol.setNombre(nombre);
        nuevoGol.setEdad(edad);
        nuevoGol.setGoles(goles);
        
        if (listaJugadores == null) {
            nuevo.setSiguienteJugador(null);
            listaJugadores = nuevo;
        } else {
            if ((nuevo.getEdad()<listaJugadores.getEdad())) {
                nuevo.setSiguienteJugador(listaJugadores);
                listaJugadores = nuevo;
            } else {
                NodoJugador recorre = listaJugadores;
                NodoJugador atras = listaJugadores;

                while ((nuevo.getEdad()>=recorre.getEdad()) && recorre.getSiguienteJugador()!= null) {
                    atras = recorre;
                    recorre = recorre.getSiguienteJugador();

                }
                if (nuevo.getEdad()>= recorre.getEdad()) {
                    recorre.setSiguienteJugador(nuevo);
                } else {
                    nuevo.setSiguienteJugador(recorre);
                    atras.setSiguienteJugador(nuevo);
                }

            }
        }
        
        //Lo inserto en la lista de goleadores
        if (goleadores == null) {
            nuevo.setSiguienteJugador(null);
            goleadores = nuevoGol;
        } else {
            if ((nuevoGol.getGoles()>goleadores.getGoles())) {
                nuevoGol.setSiguienteJugador(goleadores);
                goleadores = nuevoGol;
            } else {
                NodoJugador recorre = goleadores;
                NodoJugador atras = goleadores;

                while (nuevoGol.getGoles()<=recorre.getGoles()
                        &&recorre.getSiguienteJugador()!=null) {
                    atras = recorre;
                    recorre = recorre.getSiguienteJugador();

                }
                if (nuevoGol.getGoles()<= recorre.getGoles()) {
                    recorre.setSiguienteJugador(nuevoGol);
                } else {
                    nuevo.setSiguienteJugador(recorre);
                    atras.setSiguienteJugador(nuevoGol);
                }

            }
        }
        
    }
    public void Imprimir() {
        NodoJugador recorridoJugador = getListaJugadores();

        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }
    public void ImprimirGoleadores() {
        NodoJugador recorridoJugador = getGoleadores();

        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoJugador != null) {
            System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }

    public boolean EstaVacia() {
        return getListaJugadores() == null;
    }

    public void EliminarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        NodoJugador anterior = siguienteJugador;

        if (siguienteJugador == null) {
            System.out.println("Lista de jugadores vacia");
            return;
        }
        while (siguienteJugador != null) {
            if (nombre.equals(siguienteJugador.getNombre())) {
                if (siguienteJugador == listaJugadores) {
                    listaJugadores = siguienteJugador.getSiguienteJugador();
                    return;
                }
                anterior.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
                return;
            }
            anterior = siguienteJugador;
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }

    public NodoJugador BuscarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) {
            if (nombre.equals(siguienteJugador.getNombre())) {
                return siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return null;
    }

    public void ModificarJugador(String nombre, String nuevoNombre, int edad) {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) {
            if (nombre.equals(siguienteJugador.getNombre())) {
                siguienteJugador.setNombre(nuevoNombre);
                siguienteJugador.setEdad(edad);
                return;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }

    /**
     * @return the listaJugadores
     */
    public NodoJugador getListaJugadores() {
        return listaJugadores;
    }

    /**
     * @param listaJugadores the listaJugadores to set
     */
    private void setListaJugadores(NodoJugador listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    /**
     * @return the goleadores
     */
    public NodoJugador getGoleadores() {
        return goleadores;
    }

    /**
     * @param goleadores the goleadores to set
     */
    public void setGoleadores(NodoJugador goleadores) {
        this.goleadores = goleadores;
    }

}
