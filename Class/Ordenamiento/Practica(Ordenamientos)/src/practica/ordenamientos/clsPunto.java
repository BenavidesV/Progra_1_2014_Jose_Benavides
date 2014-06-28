/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.ordenamientos;

import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class clsPunto {
    private double x; 
    private double y;
    
    Random o=new Random();

    public clsPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public clsPunto(){
    double r;
    r=o.nextDouble();
    this.x=r;
    r=o.nextDouble();
    this.y=r;}

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    public double distancia(){
    return(Math.sqrt((this.x-getX())*(this.x-getX()))+
            (this.y-getY())*(this.y-getY()));}
   
   
    
    
    
}
