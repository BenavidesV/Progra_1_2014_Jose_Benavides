/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Estudiante
 */
public class Clase15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]arreglo={50,26,70,9,15};
        int[]arregloOrdenado;
        ordenamientoBurbuja ob=new ordenamientoBurbuja();
        arregloOrdenado=ob.OrdenamientoB(arreglo, "A");
        
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arregloOrdenado[i]);
            
        }
        
        
    }
    
}
