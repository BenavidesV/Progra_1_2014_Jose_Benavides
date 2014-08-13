/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.pkg2.jose.benavides.Listas.clsListaFacturas;

import ex.pkg2.jose.benavides.clsFactura;
import ex.pkg2.jose.benavides.clsProducto;

/**
 *
 * @author Jose E

 */
public class clsListaFacturas {
    private clsFactura facturas;
    
//Este método ingresa las facturas a lista (ordenadas por # de ID)
    public void AgregarFactura(int Id, String cliente, float Texento,
            float TGRavado,float Subtotal, float total,boolean activo,
            clsProducto ListaP,String fecha) {
        clsFactura nuevo;

        nuevo = new clsFactura();
        nuevo.setId(Id);
        nuevo.setCliente(cliente);
        nuevo.setTgravado(TGRavado);
        nuevo.setTexento(Texento);
        nuevo.setSubtotal(Subtotal);
        nuevo.setTotal(total);
        nuevo.setActivo(activo);
        nuevo.setFecha(fecha);
        nuevo.setListaProductos(ListaP);

        if (getFacturas() == null) {
            setFacturas(nuevo);
        } else {
            clsFactura siguienteFactura = getFacturas();
            while (siguienteFactura != null) {
                if (nuevo.getId() == siguienteFactura.getId()) {
                    System.err.println("El Id ya existe");
                    return;
                }
                siguienteFactura = siguienteFactura.getSiguienteFactura();
            }
            if ((nuevo.getId() < getFacturas().getId())) {
                nuevo.setSiguienteFactura(getFacturas());
                setFacturas(nuevo);
            } else {
                clsFactura recorre = getFacturas();
                clsFactura atras = getFacturas();

                while ((nuevo.getId() >= recorre.getId())
                        && recorre.getSiguienteFactura()!= null) {
                    atras = recorre;
                    recorre = recorre.getSiguienteFactura();

                }
                if (nuevo.getId() > recorre.getId()) {
                    recorre.setSiguienteFactura(nuevo);
                } else {
                    nuevo.setSiguienteFactura(recorre);
                    atras.setSiguienteFactura(nuevo);
                }

            }
        }

    }

    public void EditarFactura(int Id) {
        clsFactura siguienteFactura = getFacturas();
        while (siguienteFactura != null) {
//            if (Id == siguienteProducto.getId()) {
//
//                siguienteProducto.setNombre(nuevoNombre);
//                siguienteProducto.setEdad(edad);
//                return;
//            }
            siguienteFactura = siguienteFactura.getSiguienteFactura();
        }
    }
    
    public void Imprimir() {
        clsFactura recorridoF = getFacturas();

        System.out.println("Listado de todos los elementos de la lista");
         while (recorridoF != null) {
            System.out.println(recorridoF.getCliente()+" "+recorridoF.getFecha());
            clsProducto recorridoP = recorridoF.getListaProductos();

            while (recorridoP != null) {
                System.out.println(recorridoP.getDescripcion()+ " " + 
                        recorridoP.getCantidad()+" "+recorridoP.getPrecioU()+
                        recorridoP.isGravado());
                recorridoP = recorridoP.getSiguienteProducto();
            }
            recorridoF = recorridoF.getSiguienteFactura();
        }

    }
    
    public void DesactivarFactura(int Id) {
        clsFactura siguienteFactura = getFacturas();
        while (siguienteFactura != null) {
            if (Id == siguienteFactura.getId()) {
                siguienteFactura.setActivo(false);
                return;
            }
            siguienteFactura = siguienteFactura.getSiguienteFactura();
        }
    }

    /**
     * @return the facturas
     */
    public clsFactura getFacturas() {
        return facturas;
    }

    /**
     * @param facturas the facturas to set
     */
    public void setFacturas(clsFactura facturas) {
        this.facturas = facturas;
    }

    
    
}
