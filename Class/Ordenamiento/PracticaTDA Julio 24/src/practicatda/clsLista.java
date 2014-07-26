/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatda;

import java.util.Collections;

/**
 *
 * @author Jose E
 */
public class clsLista {

    private NodoDeLista raiz;
    private NodoDeLista raiz2da;

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
    int[] vector1 = new int[cantidad()];

    public void AgregarAlArreglo() {
        for (int i = 0; i < vector1.length; i++) {
            NodoDeLista recorrido = raiz;
            while (recorrido != null) {
                if(vector1[i]!=0){
                vector1[i] = recorrido.getDato();
                recorrido = recorrido.getSiguiente();
            }}

            break;
        }
    }

    public int[] OrdenS() {
        int Indice = 0;
        int Indice2 = 0;
        int Menor = 0;
        int Posicion = 0;
        int Temporal = 0;
        for (Indice = 0; Indice < vector1.length - 1; Indice++) {
            Menor = vector1[Indice];
            Posicion = Indice;
            for (Indice2 = Indice + 1; Indice2 < vector1.length; Indice2++) {
                if (vector1[Indice2] < Menor) {
                    Menor = vector1[Indice2];
                    Posicion = Indice2;
                }
            }
            if (Posicion != Indice) {
                Temporal = vector1[Indice];
                vector1[Indice] = vector1[Posicion];
                vector1[Posicion] = Temporal;

            }
        }
        return vector1;
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

    public void ListaOrdenada() {
        int c = 0;
        NodoDeLista recorrido = raiz;
        while (recorrido != null) {
            recorrido.setDato(vector1[c]);
            c++;
            recorrido = recorrido.getSiguiente();

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

    public void concatenar() {
        NodoDeLista recorrido = raiz;
        while (recorrido != null) {

            if (recorrido.getSiguiente() == null) {
                recorrido.setSiguiente(raiz2da);
                break;
            } else {
                recorrido = recorrido.getSiguiente();
            }
        }
    }

    public void invertirLista() {

        NodoDeLista recorrido = raiz;
        NodoDeLista temp = null;

        while (recorrido.getSiguiente() != null) {

            temp = recorrido.getSiguiente();

            recorrido.setSiguiente(temp.getSiguiente());

            temp.setSiguiente(raiz);

            raiz = temp;

        }
    }

    public void intercalarListas() {
        NodoDeLista temp = raiz;
        NodoDeLista recorrido = raiz;
        NodoDeLista recorrido2 = raiz2da;
        while (recorrido!= null && recorrido2!= null) {
            temp = recorrido.getSiguiente();
            if(temp!=null){
            recorrido.setSiguiente(recorrido2);
            recorrido=(recorrido2.getSiguiente());
            recorrido2.setSiguiente(temp);
            recorrido2=temp.getSiguiente();
            temp.setSiguiente(recorrido);
            
        }}
    }
}
