/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg2.jose.benavides;

import ex.pkg2.jose.benavides.Listas.clsListaFacturas.clsListaFacturas;
import ex.pkg2.jose.benavides.Listas.clsListaFacturas.clsListaProductos;
import java.util.Scanner;

/**
 *
 * @author Jose E 
 *
 */
public class Ex2JoseBenavides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char continuar = ' ';
        int ex = 0, n, m;
        boolean validar = true;

        int Idfactura;
        int Idprod;
        int cant;
        String cliente;
        float Tgravado;
        float Texento;
        float Subtotal;
        float total;
        String fecha;
        boolean activo;
        clsProducto ListaProductos;
        clsFactura FacturaActual;

        Scanner teclado = new Scanner(System.in);

        clsListaProductos oproducto = new clsListaProductos();
        oproducto.AgregarProducto(000, "Manzana", 500, 20, true, true, 10,
                "2 Marzo");
        oproducto.AgregarProducto(001, "Mango", 200, 10, true, true, 15,
                "20 Mayo");
        oproducto.AgregarProducto(011, "Cerveza", 650, 18, true, true, 10,
                "28 Mayo");

        oproducto.Imprimir();

        clsListaFacturas ofacturas = new clsListaFacturas();

        do {

            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Crear una factura" + "\n" + "2.Editar Factura"
                    + "\n" + "3.Desactivar Factura" + "\n" + "4.Reimprimir Factura"
                    + "\n" + "5.Agregar productos al inventario" + "\n"
                    + "6.Editar Inventario" + "\n" + "7.Desactivar inventario" + "\n"
                    + "8.Agregar más cantidad de productos");
            ex = (Integer.parseInt(teclado.nextLine()));
            switch (ex) {

                case 1:
                    System.out.println("Nombre del cliente: ");
                    cliente = teclado.nextLine();

                    System.out.println("Id de la factura");
                    Idfactura = teclado.nextInt();
                    
                    System.out.println("Id del producto");
                    Idprod = teclado.nextInt();

                    System.out.println("Cantidad");
                    cant = teclado.nextInt();
                    
                  
                    
//                    ofacturas.AgregarFactura(Idfactura, cliente, Texento, Tgravado, Subtotal, total, activo, ListaProductos, fecha);

                    break;

                case 2:
                    System.out.println("Nombre del cliente: ");
                    cliente = teclado.nextLine();

                    System.out.println("Fecha");
                    fecha = teclado.nextLine();

                    System.out.println("Cantidad");
                    cant = teclado.nextInt();

                    break;
                case 3:

                    teclado = new Scanner(System.in);
                    System.out.println("Digite el id de la factura que desea"
                            + "desactivar");
                    Idfactura = teclado.nextInt();

                    break;
                case 4:

                    teclado = new Scanner(System.in);
                    System.out.println("Digite el id de la factura que desea"
                            + "reimprimir");
                    Idfactura = teclado.nextInt();
                    ofacturas.Imprimir();

                    break;
                case 5:

                    teclado = new Scanner(System.in);
                    System.out.println("Digite el id del producto");
                    Idprod = teclado.nextInt();
                    System.out.println("Digite la cantidad del producto");
                    cant = teclado.nextInt();
                    System.out.println("Digite el id del producto");
                    Idprod = teclado.nextInt();
                    System.out.println("Digite el id del producto");
                    Idprod = teclado.nextInt();
                    ofacturas.Imprimir();

                    break;
                case 6:

                    teclado = new Scanner(System.in);
                    System.out.println("Digite el id de la factura que desea"
                            + "reimprimir");
                    Idfactura = teclado.nextInt();
                    ofacturas.Imprimir();

                    break;
                case 7:

                    teclado = new Scanner(System.in);
                    System.out.println("Digite el producto que quiere descativar"
                            + " del inventario");
                    Idprod = teclado.nextInt();
                    oproducto.DesactivarProducto(Idprod);

                    break;
                case 8:

                    teclado = new Scanner(System.in);
                    
                    System.out.println("Digite el id del producto");
                    Idprod = teclado.nextInt();
                    
                    System.out.println("Cantidad");
                    cant = teclado.nextInt();
                    oproducto.AgregarCantidadAProducto(Idprod, cant);

                    break;

                default:

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
