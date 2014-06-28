/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosbusqueda;

/**
 *
 * @author Estudiante
 */
public class MetodosBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] arreglo = {"Mario", "Efrén", "Susana", "Cambell", "Agustin", "Elias"};
        clsBusquedaLineal b1 = new clsBusquedaLineal();
        System.out.println("La búsqueda lineal es: " + b1.BuscarNombre(arreglo, "Efrén"));
        System.out.println();
        String[] arreglo2 = {"Cambell", "Agustin", "Susana", "Elias", "Efrén", "Mario"};
        clsBusquedaBinaria bb = new clsBusquedaBinaria();
        System.out.println("La búsqueda binaria es: " + bb.BuscarNombre(arreglo2, "Cambell"));
        System.out.println();
    }

}
