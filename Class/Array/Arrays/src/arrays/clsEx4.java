/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Jose E De menor a mayor
 */
public class clsEx4 {

    private double valores[] = new double[10];

    public void AgregarValor(double n1) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == 0) {
                valores[i] = n1;
                break;
            }
        }

    }

    public boolean ordenado() {
        boolean b = true;
        for (int j = 0; j < valores.length; j++) {
            if (valores[j] < valores[j + 1]) {
                b = true;
            } else {
                b = false;
            }

        }return b;
    }
}
