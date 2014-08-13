/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg2.jose.benavides.Listas.clsListaFacturas;

import ex.pkg2.jose.benavides.clsProducto;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose E
 */
public class clsListaProductos {

    String descripcion="";
    Scanner teclado = new Scanner(System.in);
    private clsProducto Lista;
 

//Este método ingresa los productos a lista ordenados por # de ID
    public void AgregarProducto(int Id, String descripcion, float precio, int cantidad,
            boolean activo, boolean gravado, int impuesto, String fecha) {

        clsProducto nuevo;
        nuevo = new clsProducto();
        nuevo.setId(Id);
        nuevo.setDescripcion(descripcion);
        nuevo.setPrecioU(precio);
        nuevo.setCantidad(cantidad);
        nuevo.setActivo(activo);
        nuevo.setGravado(gravado);
        nuevo.setImpuesto(impuesto);
        nuevo.setFecha(fecha);

        if (getLista() == null) {
            setLista(nuevo);
        } else {
            clsProducto siguienteProducto = getLista();
            while (siguienteProducto != null) {
                if (nuevo.getId() == siguienteProducto.getId()) {
                    System.err.println("El Id ya existe");
                    return;
                }
                siguienteProducto = siguienteProducto.getSiguienteProducto();
            }
            if ((nuevo.getId() < getLista().getId())) {
                nuevo.setSiguienteProducto(getLista());
                setLista(nuevo);
            } else {
                clsProducto recorre = getLista();
                clsProducto atras = getLista();

                while ((nuevo.getId() >= recorre.getId())
                        && recorre.getSiguienteProducto() != null) {
                    atras = recorre;
                    recorre = recorre.getSiguienteProducto();

                }
                if (nuevo.getId() > recorre.getId()) {
                    recorre.setSiguienteProducto(nuevo);
                } else {
                    nuevo.setSiguienteProducto(recorre);
                    atras.setSiguienteProducto(nuevo);
                }

            }
        }

    }

    public void EditarProducto(int Id) {
        clsProducto siguienteProducto = getLista();
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {
                System.out.println("Digite la nueva descripción");
                descripcion=teclado.nextLine();
                siguienteProducto.setDescripcion(descripcion);
                
                return;
            }
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
    }

    public void EliminarProducto(int Id) {
        clsProducto siguienteProducto = getLista();
        clsProducto anterior = siguienteProducto;

        if (siguienteProducto == null) {
            System.out.println("No hay productos en el inventario");
            return;
        }
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {
                if (siguienteProducto == getLista()) {
                    setLista(siguienteProducto.getSiguienteProducto());
                    return;
                }
                anterior.setSiguienteProducto(siguienteProducto.getSiguienteProducto());
                return;
            }
            anterior = siguienteProducto;
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
    }

    public void DesactivarProducto(int Id) {
        clsProducto siguienteProducto = getLista();
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {
                siguienteProducto.setActivo(false);
                return;
            }
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
    }

    public void AgregarCantidadAProducto(int Id, int agregar) {
        clsProducto siguienteProducto = getLista();
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId()) {

                siguienteProducto.setCantidad(siguienteProducto.getCantidad()
                        + agregar);

                return;
            }
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
    }

    public boolean BuscarProducto(int Id, int cant) {
        clsProducto siguienteProducto = Lista;
        while (siguienteProducto != null) {
            if (Id == siguienteProducto.getId() && (cant <= siguienteProducto.getCantidad())) {
                return true;

            }
            siguienteProducto = siguienteProducto.getSiguienteProducto();
        }
        return false;

    }

    public void Imprimir() {
        clsProducto recorrido = getLista();

        System.out.println("Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getCantidad() + " "
                    + recorrido.getDescripcion());
            recorrido = recorrido.getSiguienteProducto();
        }
        System.out.println();
    }

    /**
     * @return the Lista
     */
    public clsProducto getLista() {
        return Lista;
    }

    /**
     * @param Lista the Lista to set
     */
    public void setLista(clsProducto Lista) {
        this.Lista = Lista;
    }

    /**
     * @return the paraFacturar
     */
}
