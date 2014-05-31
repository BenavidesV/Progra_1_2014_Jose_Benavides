/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char continuar = ' ';
        String letra = " ",dw= "";
        int num = 0, ultnum = 0, ex = 0, mes=0, anno,n,dia,ndia;
        boolean validar = true;
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("Digite el número de ejercicio");
            ex = (Integer.parseInt(teclado.nextLine()));
            switch (ex) {

                case 2:
                    System.out.println("Digite el número ");
                    num = Integer.parseInt(teclado.nextLine());

                    clsEvalua e = new clsEvalua(num);
                    System.out.println(e.ultimo(ultnum));

                    break;

                case 3:
                    System.out.println("Digite una letra: A, B, C, D, E");
                    letra = teclado.nextLine();

                    clsEx3 l = new clsEx3(letra);
                    System.out.println(l.valora());
                    break;
                case 4:
                    System.out.println("Digite el mes");
                    mes = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Digite el año");
                    anno = Integer.parseInt(teclado.nextLine());
                    

                    clsEx4 o = new clsEx4(mes,anno);
                    System.out.println(" el mes "+mes+" del año "+anno+" tiene "+o.ndias()+" días");
                    break;
                case 5:
                    System.out.println("NUMEROS ROMANOS "+"\n");
                    //brinda un numero entre 1 y 3000
                    n = 1+(int)(Math.random()*3000);
                   
                    clsEx5 x5 = new clsEx5(n);
                    System.out.println("El numero "+n+" representado en numeración romana es: "+x5.numR());
                    break;
                case 6:
                    System.out.println("Bienvenido "+"\n"+"Coloque la fecha actual "+"\n");
                    System.out.println("Día"+"\n");
                    dia = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Mes"+"\n");
                    mes = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Año"+"\n");
                    anno = Integer.parseInt(teclado.nextLine());
                   
                    clsEx6 x6 = new clsEx6(dia,mes,anno);
                    System.out.println("El día anterior a "+dia+"/"+mes+"/"+anno+
                            " es "+x6.cdia()+"/"+x6.cmes()+"/"+x6.canno());
                    break;
                case 7:
                    System.out.println("Bienvenido "+"\n"+"Coloque la fecha actual "+"\n");
                    System.out.println("Día"+"\n");
                    dia = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Mes"+"\n");
                    mes = Integer.parseInt(teclado.nextLine());
                    
                   
                    clsEx7 x7 = new clsEx7(dia);
                    System.out.println("El día " + dia + " del mes " + mes+" es "+x7.dsemana(dia));
                    break;
                case 8:
                    System.out.println("Bienvenido "+"\n"+"Coloque la fecha actual "+"\n");
                    System.out.println("Día"+"\n");
                    dia = Integer.parseInt(teclado.nextLine());
                    
                    System.out.println("Escriba el primer día del mes "+"\n");
                    dw = teclado.nextLine();
                    
                   
                    clsEx8 x8 = new clsEx8(dw);
                    ndia=dia+x8.nd(dw);
                    System.out.println(ndia);
                    clsEx7 ad=new clsEx7(ndia);
                    System.out.println("El día " + dia + " de este mes es "+ad.dsemana(ndia));
                    break;

                default:

            }

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
