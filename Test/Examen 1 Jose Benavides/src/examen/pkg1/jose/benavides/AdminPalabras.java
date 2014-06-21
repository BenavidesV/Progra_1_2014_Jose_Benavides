/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen.pkg1.jose.benavides;

/**
 *
 * @author Jose E
 */
public class AdminPalabras {
    private String []listaPalabras;
    
    public AdminPalabras(String []lista){
    listaPalabras=lista;}
    
    public int ContarPalabrasPosibles( String letras){
        int cont=0, c2=0;
        for (int i = 0; i < listaPalabras.length;i++) {
            if(listaPalabras[i]==letras){
                cont++;
            }
            }
        if (cont==letras.length()){
            c2++;
        }
        
    return c2++;
    }

    /**
     * @return the listaPalabras
     */
    public String[] getListaPalabras() {
        return listaPalabras;
    }

    /**
     * @param listaPalabras the listaPalabras to set
     */
    public void setListaPalabras(String[] listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
}
