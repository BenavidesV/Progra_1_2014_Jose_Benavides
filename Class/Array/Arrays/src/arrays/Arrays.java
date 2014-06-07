/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double []sueldos=new double[5];
        int cantidadTrabajadores=1;
        double sueldo=0;
        Scanner teclado=new Scanner(System.in);
        //Este es elejercicio 1
        /*do{
            System.out.println("Digite el sueldo del trabajador # "+cantidadTrabajadores);
            sueldo=teclado.nextDouble();
            sueldos[cantidadTrabajadores-1]=sueldo;
            cantidadTrabajadores++;
            
        }while(cantidadTrabajadores<6);
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("El sueldo del trabajador #"+(i+1)+" es de "+sueldos[i]);
            
        }*/
        int cantidadPersonas=1;
        float alturaPersona=0;
        clsEx2A alt=new clsEx2A();
        
        do{
            System.out.println("Digite la altura de la persona #"+cantidadPersonas);
        alturaPersona=teclado.nextFloat();
        alt.AgregarAltura(alturaPersona);
        cantidadPersonas++;
        }while (cantidadPersonas<6);
        System.out.println("El promedio es de "+alt.Promedio());
        System.out.println(alt.ContarPersonas());
    }
}

