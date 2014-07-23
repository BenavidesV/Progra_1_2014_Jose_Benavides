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
public class clsLista {

    private NodoDeLista raiz;
    int[] vector1 = new int[cantidad()];

    public clsLista() {
        raiz = null;

    }

    public void Insertar(int dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoDeLista auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();

            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todos los elementos ");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public int cantidad() {
        NodoDeLista recorrido = raiz;
        int cont = 0;
        while (recorrido != null) {
            cont++;
            recorrido = recorrido.getSiguiente();
        }
        return cont;
    }

    public void Eliminar(int dato) {
        NodoDeLista recorrido = raiz;
        NodoDeLista anterior;
        while (recorrido != null) {
            anterior = recorrido;
            recorrido = recorrido.getSiguiente();
            if (anterior.getSiguiente().getDato() == dato) {
                anterior.setSiguiente(recorrido.getSiguiente());
            }
            recorrido = recorrido.getSiguiente();
        }
    }
}
