/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

/**
 *
 * @author Jose E Ordenado
 */
public class clsEx4 {

    private double vector[] = new double[10];

    public void AgregarValor(double n1) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                vector[i] = n1;
                break;
            }
        }

    }

    public String ordenado() {
        boolean b = true;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i - 1] < vector[i]) {
                b = true;
            } else {
                b = false;
            }
            break;
        }
        if (b == true) {
            return "El vector está ordenado de menor a mayor ";
        } else {
            return "El vector NO está ordenado";
        }
    }

}
