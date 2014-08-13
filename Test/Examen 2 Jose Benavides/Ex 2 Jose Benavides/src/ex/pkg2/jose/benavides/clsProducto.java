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
public class clsProducto {
    private int Id;
    private String descripcion;
    private float precioU;
    private int cantidad;
    private boolean activo;
    private boolean gravado;
    private int impuesto;
    private String fecha;
    private clsProducto siguienteProducto;

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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precioU
     */
    public float getPrecioU() {
        return precioU;
    }

    /**
     * @param precioU the precioU to set
     */
    public void setPrecioU(float precioU) {
        this.precioU = precioU;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
     * @return the gravado
     */
    public boolean isGravado() {
        return gravado;
    }

    /**
     * @param gravado the gravado to set
     */
    public void setGravado(boolean gravado) {
        this.gravado = gravado;
    }

    /**
     * @return the impueto
     */
    public int getImpuesto() {
        return impuesto;
    }

    /**
     * @param impueto the impueto to set
     */
    public void setImpuesto(int impueto) {
        this.impuesto = impueto;
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
     * @return the siguienteProducto
     */
    public clsProducto getSiguienteProducto() {
        return siguienteProducto;
    }

    /**
     * @param siguienteProducto the siguienteProducto to set
     */
    public void setSiguienteProducto(clsProducto siguienteProducto) {
        this.siguienteProducto = siguienteProducto;
    }
    
    
    
    
    
}
