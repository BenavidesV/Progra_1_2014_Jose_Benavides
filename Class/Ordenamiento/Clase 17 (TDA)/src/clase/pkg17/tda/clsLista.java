/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg17.tda;

/**
 *
 * @author Jose E
 */
public class clsLista {

    private NodoDeLista raiz;

    public clsLista() {
        raiz = null;
    }

    public void Insertar(String dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoDeLista temporal = raiz;
            NodoDeLista auxiliar = new NodoDeLista();
            while (raiz.getSiguiente() != null) {
                auxiliar.setDato(temporal.getDato());
                auxiliar.setSiguiente(temporal);
                temporal = temporal.getSiguiente();

            }
            auxiliar.setSiguiente(nuevo);
            raiz = auxiliar;
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
}
