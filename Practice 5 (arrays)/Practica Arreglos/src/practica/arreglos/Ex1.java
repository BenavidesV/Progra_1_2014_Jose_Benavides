/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

/**
 *
 * @author Jose E 1.	Desarrollar un programa que permita ingresar un vector de 8
 * elementos, e informe:
 *
 * •	El valor acumulado de todos los elementos del vector.
 *
 * •	El valor acumulado de los elementos del vector que sean mayores a 36.
 * Cantidad de valores mayores a 50.
 *
 */
public class Ex1 {

    private double arreglo1[] = new double[8];

    public void AgregarValor(double v) {
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] == 0) {
                arreglo1[i] = v;
                break;
            }

        }
    }

    public double SumarValores() {
        double suma = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            suma += arreglo1[i];
        }
        return suma;

    }

    public double Suma36() {
        double suma = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] > 36) {
                suma += arreglo1[i];
            }

        }
        return suma;
    }
    public double Suma50() {
        double suma = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] > 50) {
                suma += arreglo1[i];
            }

        }
        return suma;
    }
}
