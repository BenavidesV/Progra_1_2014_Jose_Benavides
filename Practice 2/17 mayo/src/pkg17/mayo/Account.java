/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg17.mayo;

/**
 *
 * @author Jose E
 */
public class Account {
    private double saldoInicial;
    private boolean hayError;
     //metodo constructor que inicailiza valores de la clase
    public Account(){
        saldoInicial=0;
        hayError=true;
    }
    // Este método sirve para añadir fondos a la cuenta
    public void Deposito(double monto){
        setSaldoInicial(getSaldoInicial() + monto);
    }
    /**Este método funciona para realizar retiros 
     * si cuenta con fondos suficientes
     */
    public void Retiro(double monto){
        if (getSaldoInicial()>=monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }
}
