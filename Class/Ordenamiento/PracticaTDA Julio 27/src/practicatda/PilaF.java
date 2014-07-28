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
public class PilaF {

    private NodoDeListaFloat P1;
    private NodoDeListaFloat P2;
    private NodoDeListaFloat Resultado;
    private NodoDeListaFloat ultimo;

    public PilaF() {
        P2 = null;
        P1 = null;
    }

    public void Push(int dato) {
        NodoDeListaFloat nuevo;
        nuevo = new NodoDeListaFloat();
        nuevo.setDato(dato);
        if (P1 == null) {
            nuevo.setSiguiente(null);
            P1 = nuevo;
        } else {
            nuevo.setSiguiente(P1);
            P1 = nuevo;
        }
    }

    public void PushP(float dato) {
        NodoDeListaFloat nuevo;
        nuevo = new NodoDeListaFloat();
        nuevo.setDato(dato);
        if (P2 == null) {
            nuevo.setSiguiente(null);
            P2 = nuevo;
        } else {
            nuevo.setSiguiente(P2);
            P2 = nuevo;
        }
    }

    public Object Pop() {
        if (P1 != null) {
            Object info = P1.getDato();
            P1 = P1.getSiguiente();
            return info;
        }
        return new Object();
    }

    public void Imprimir() {
        NodoDeListaFloat recorrido = P1;
        System.out.println("Listado de todos los elementos de la pila.");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public boolean Vacia() {
        if (Resultado == null) {
            return true;
        } else {
            return false;
        }
    }

    public void PushPila() {

        NodoDeListaFloat recorrido = P1;
        NodoDeListaFloat recorrido2 = P2;
        NodoDeListaFloat nuevo;
        while (recorrido != null) {
            nuevo = new NodoDeListaFloat();
            nuevo.setDato(recorrido.getDato());
            nuevo.setSiguiente(null);
            if (Vacia()) {
                Resultado = nuevo;
                ultimo = nuevo;
            } else {
                ultimo.setSiguiente(nuevo);
                ultimo = nuevo;
            }
            recorrido=recorrido.getSiguiente();
        }
        while (recorrido2 != null) {
            nuevo = new NodoDeListaFloat();
            nuevo.setDato(recorrido2.getDato());
            nuevo.setSiguiente(null);
            if (Vacia()) {
                Resultado = nuevo;
                ultimo = nuevo;
            } else {
                ultimo.setSiguiente(nuevo);
                ultimo = nuevo;
            }
            recorrido2=recorrido2.getSiguiente();
        }
        NodoDeListaFloat imp = Resultado;
        System.out.println("Listado de todos los elementos de la NUEVA pila.");
        while (imp != null) {
            System.out.println(imp.getDato());
            imp = imp.getSiguiente();
        }
        System.out.println();
    }
}
