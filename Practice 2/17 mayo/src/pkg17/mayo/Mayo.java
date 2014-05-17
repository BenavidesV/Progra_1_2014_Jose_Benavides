/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.mayo;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Mayo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean validar=true;
        int opcion;
        char continuar=' ';
        double monto=0;

        //Declaro la instancia de la clase
        Account p = new Account();
        //Utilizo el scanner para ingresar los datos
        Scanner teclado = new Scanner(System.in);
        
        while (validar){
            System.out.println("Digite 1 si quiere realizar un retiro y 2 si quiere realizar un depósito ");
            opcion=Integer.parseInt(teclado.nextLine());
            
            if(opcion==1){
                System.out.println("Digite el monto a retirar");
                monto=Double.parseDouble(teclado.nextLine());
                
                if(p.isHayError()){
                    System.out.println("El monto que solicita es incorrecto");
                }
                p.Retiro(monto);
            }
            if(opcion==2){
                System.out.println("Digite el monto a depositar");
                monto=Double.parseDouble(teclado.nextLine());
                p.Deposito(monto);
                
            }
            System.out.println("El saldo actual es de: "+p.getSaldoInicial());
            System.out.println("Desea continuar con otra transacción S/N");
            continuar=teclado.nextLine().charAt(0);
            if((continuar=='s')||(continuar=='S')){
                validar=true;
            }
            if((continuar=='n')||(continuar=='N')){
                validar=false;
            }
        }
    }

}
