/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.ordenamientos;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class PracticaOrdenamientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         char continuar = ' ';
        int n;
        double dMax;
        double[]arregloDistancia;
        double[]arregloPuntosX;
        double[]arregloPuntosY;
        boolean validar = true;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Digite la cantidad de puntos");
            n = teclado.nextInt();
            
            arregloDistancia=new double[n];
            arregloPuntosX=new double[n];
            arregloPuntosY=new double[n];
            
            for (int i = 0; i < arregloPuntosX.length; i++) {
                clsPunto pto=new clsPunto();
                arregloPuntosX[i]= pto.getX();
                arregloPuntosY[i]=pto.getY();
                arregloDistancia[i]=pto.distancia();
                
            }
            clsOrdenamiento orden =new clsOrdenamiento();
            orden.OrdenS(arregloDistancia);
            orden.OrdenS(arregloPuntosX);
            orden.OrdenS(arregloPuntosY);
            
            dMax=arregloDistancia[arregloDistancia.length-1]-arregloDistancia[0];
            System.out.println("Distancia máxima= "+dMax);
            System.out.print("Menor= ("+arregloPuntosX[0]+","+arregloPuntosY[0]+")"+"\n");
            System.out.println("Mayor= "+arregloPuntosX[arregloPuntosX.length-1]
                    +","+arregloPuntosY[arregloPuntosY.length-1]);
            
            for (int v = 0; v < arregloDistancia.length; v++) {
                System.out.println(arregloDistancia[v]);
                
            }
            teclado = new Scanner(System.in);
            System.out.println("Desea continuar con otra operación S/N ");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
}

    

