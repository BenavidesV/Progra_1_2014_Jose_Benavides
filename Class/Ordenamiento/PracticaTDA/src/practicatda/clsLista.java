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
    private NodoDeLista raiz2da;
    int[] vector1 = new int[cantidad()];

    public clsLista() {
        raiz = null;
        raiz2da = null;

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

    public void InsertarOtra(int dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        if (raiz2da == null) {
            nuevo.setSiguiente(null);
            raiz2da = nuevo;
        } else {
            NodoDeLista auxiliar = raiz2da;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();

            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println("Listado de los elementos de la lista 1 ");
        while (recorrido != null) {
            System.out.println(recorrido.getDato());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();

        NodoDeLista recorrido2do = raiz2da;
        System.out.println("Listado de todos los elementos lista 2 ");
        while (recorrido2do != null) {
            System.out.println(recorrido2do.getDato());
            recorrido2do = recorrido2do.getSiguiente();
        }
        System.out.println();
    }
// Este es el ejercicio 2

    public int cantidad() {
        NodoDeLista recorrido = raiz;
        int cont = 0;
        while (recorrido != null) {
            cont++;
            recorrido = recorrido.getSiguiente();
        }
        return cont;
    }
// Este método retorna la sumatoria del cuadrado de los elementos de la lista

    public double SumatoriaCadrados() {
        NodoDeLista recorrido = raiz;
        double cuadrado = 0, sumatoria = 0;
        while (recorrido != null) {
            cuadrado = recorrido.getDato() * recorrido.getDato();
            sumatoria += cuadrado;
        }
        return sumatoria;
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

    public NodoDeLista concatenar() {
        NodoDeLista recorrido = raiz;
        while (recorrido != null) {

            if (recorrido.getSiguiente() == null) {
                recorrido.setSiguiente(raiz2da);
            }
            recorrido = recorrido.getSiguiente();
        }
        return recorrido;
    }
}
