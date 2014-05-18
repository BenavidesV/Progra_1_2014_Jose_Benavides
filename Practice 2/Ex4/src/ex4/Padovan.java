/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex4;

/**
 *
 * @author Jose E
 */
public class Padovan {
    //metodo recursivo que calcula la sucesion de Padovan
    static int sucesionPadovan(int n)
    {
        if(n == 0 || n == 1 || n == 2)
            return 1;
        else
            return sucesionPadovan(n-2) + sucesionPadovan(n-3);
    }
}
