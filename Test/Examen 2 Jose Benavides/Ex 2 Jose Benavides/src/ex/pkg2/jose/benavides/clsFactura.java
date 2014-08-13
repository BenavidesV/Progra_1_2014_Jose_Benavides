/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.pkg2.jose.benavides;

/**
 *
 * @author Jose E
 *
 */
public class clsFactura {
    private int Id;
    private String cliente;
    private float Tgravado;
    private float Texento;
    private float Subtotal;
    private float total;
    private String fecha;
    private boolean activo;
    private clsProducto ListaProductos;
    private clsFactura siguienteFactura;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the Tgravado
     */
    public float getTgravado() {
        return Tgravado;
    }

    /**
     * @param Tgravado the Tgravado to set
     */
    public void setTgravado(float Tgravado) {
        this.Tgravado = Tgravado;
    }

    /**
     * @return the Texento
     */
    public float getTexento() {
        return Texento;
    }

    /**
     * @param Texento the Texento to set
     */
    public void setTexento(float Texento) {
        this.Texento = Texento;
    }

    /**
     * @return the Subtotal
     */
    public float getSubtotal() {
        return Subtotal;
    }

    /**
     * @param Subtotal the Subtotal to set
     */
    public void setSubtotal(float Subtotal) {
        this.Subtotal = Subtotal;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the ListaProductos
     */
    public clsProducto getListaProductos() {
        return ListaProductos;
    }

    /**
     * @param ListaProductos the ListaProductos to set
     */
    public void setListaProductos(clsProducto ListaProductos) {
        this.ListaProductos = ListaProductos;
    }

    /**
     * @return the siguienteFactura
     */
    public clsFactura getSiguienteFactura() {
        return siguienteFactura;
    }

    /**
     * @param siguienteFactura the siguienteFactura to set
     */
    public void setSiguienteFactura(clsFactura siguienteFactura) {
        this.siguienteFactura = siguienteFactura;
    }
    
    
    
}
