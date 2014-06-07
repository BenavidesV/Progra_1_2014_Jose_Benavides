/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

/**
 *
 * @author Jose E 
 * Suma de dos vectores componente a componente en un tercer vector
 */
public class clsEx2 {

    private int arreglo1[] = new int[4];
    private int arreglo2[] = new int[4];
    private int arregloSuma[] = new int[4];

    public void AgregarValor(int v, int v2) {
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] == 0) {
                arreglo1[i] = v;
                
            }
            if (arreglo2[i] == 0) {
                arreglo2[i] = v2;
                break;
            }
            
        }

    }

    public String SumarValores() {
        int suma = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            suma = arreglo1[i] + arreglo2[i];
            arregloSuma[i] = suma;
            System.out.println("El valor de la suma de los vectores en la posición "
                    + (i) + " es " + arregloSuma[i]);

        }
        return "Fin";
    }
}
