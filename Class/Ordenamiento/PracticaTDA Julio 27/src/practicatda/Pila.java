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
public class Pila {

    private NodoDeLista raiz;
    private NodoDeLista raizP;
    private NodoDeLista ultimo;
    private NodoDeLista temporal;

    public Pila() {
        raiz = null;
    }

    public void Push(int dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    }

    public void PushP(int dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raizP == null) {
            nuevo.setSiguiente(null);
            raizP = nuevo;
        } else {
            nuevo.setSiguiente(raizP);
            raizP = nuevo;
        }
    }

    public Object Pop() {
        if (raiz != null) {
            Object info = raiz.getDato();
            raiz = raiz.getSiguiente();
            return info;
        }
        return new Object();
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public boolean Vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public int Cantidad() {
        int cantidad = 0;
        NodoDeLista recorrido = raiz;
        while (recorrido != null) {
            cantidad++;
            recorrido = recorrido.getSiguiente();
        }
        return cantidad;
    }

    public void PushPila(int dato) {

        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setSiguiente(null);
        if (Vacia()) {
            raiz = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void PilaInvertida() {
        while (raiz != null) {
            Object info = raiz.getDato();
            PushP(raiz.getDato());
            raiz = raiz.getSiguiente();
        }
        NodoDeLista recorrido = raizP;
        System.out.println("Listado de todos los elementos de la pila Invertida");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();

    }

    public void DuplicarLista() {
        temporal = raiz;
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la pila");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
        recorrido = temporal;
        System.out.println("Listado de todos los elementos de la copia de pila");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public void InvertirListas() {
        temporal = raiz;
        raiz = raizP;
        raizP = temporal;

        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos de la pila 1");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
        recorrido = raizP;
        System.out.println("Listado de todos los elementos de la pila 2");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();

    }

    public void MoverYCopiar() {
        NodoDeLista recorrido = raiz;
        while (recorrido != null) {
            PushP(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }

        recorrido = raiz;
        System.out.println("Listado de todos los elementos de la pila 1");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
        recorrido = raizP;
        System.out.println("Listado de todos los elementos de la pila 2");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

}
