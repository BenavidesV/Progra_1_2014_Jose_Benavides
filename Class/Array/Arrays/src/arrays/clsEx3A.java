/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Jose E
 */
public class clsEx3A {

    private double SalarioManana[] = new double[4];
    private double SalarioTarde[] = new double[4];

    public void AgregarSalarioManana(double sueldo) {
        for (int i = 0; i < SalarioManana.length; i++) {
            if (SalarioManana[i] == 0) {
                SalarioManana[i] = sueldo;
                break;
            }

        }}
    public void AgregarSalarioTarde(double sueldo) {
        for (int i = 0; i < SalarioTarde.length; i++) {
            if (SalarioTarde[i] == 0) {
                SalarioTarde[i] = sueldo;
                break;
            }

        }}
public String ImprimirGastos(){
double sumaSalarioManana=0;
double sumaSalarioTarde=0;
    for (int i = 0; i < SalarioManana.length; i++) {
        sumaSalarioManana+=SalarioManana[i];
        
    }
    for (int i = 0; i < SalarioTarde.length; i++) {
        sumaSalarioManana+=SalarioTarde[i];
        
    }return "El salario en el turno de la mañana es "+sumaSalarioManana+"\n"+
            "El salario en el turno de la tarde es "+sumaSalarioTarde;
}}
    
