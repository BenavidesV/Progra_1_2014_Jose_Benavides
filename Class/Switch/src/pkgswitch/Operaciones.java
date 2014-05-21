/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author Jose E
 */
public class Operaciones {

    public double Suma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double Resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplica(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double divida(double valor1, double valor2) {
        if (valor2 == 0) {
            return 0;

        } else {
            return valor1 / valor2;
        }
    }

    public double raiz(double valor1) {
        if (valor1 < 0) {
            return 0;

        } else {
            return Math.sqrt(valor1);
        }
    }

    public double potencia(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }

}
