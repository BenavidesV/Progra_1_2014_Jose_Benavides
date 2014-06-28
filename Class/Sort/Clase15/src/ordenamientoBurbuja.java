/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ordenamientoBurbuja {

    public int[] OrdenamientoB(int[] arreglo, String ordenamiento) {
        int indice = 0;
        int indice2 = 0;
        int aux = 0;
        if (ordenamiento.equals("A")) {
            for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < arreglo.length - indice - 1; indice2++) {
                    if (arreglo[indice2 + 1] < arreglo[indice2]) {
                        aux = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = aux;
                    }

                }

            }
            return arreglo;

        } else {
            for (indice = 0; indice < arreglo.length - 1; indice++) {
                for (indice2 = 0; indice2 < arreglo.length - indice - 1; indice2++) {
                    if (arreglo[indice2 + 1] > arreglo[indice2]) {
                        aux = arreglo[indice2 + 1];
                        arreglo[indice2 + 1] = arreglo[indice2];
                        arreglo[indice2] = aux;
                    }

                }

            }
            return arreglo;
        }
    }}

