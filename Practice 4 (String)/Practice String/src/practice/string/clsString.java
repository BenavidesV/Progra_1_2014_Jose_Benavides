/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.string;

/**
 *
 * @author Jose E
 */
public class clsString {

    private String cadena;

    public clsString(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    //retorna el substring desde la posición begin hasta la posicion end
    public String Sub(int begin, int end) {
        String ret = "";
        for (int i = begin; i <= end; i++) {
            ret += getCadena().charAt(i);
        }
        return ret;
    }

    //Retorna el string con todas las letras mayúsculas
    
    /** public String Upper(){
         for (int i = 0; i <getCadena().length(); i++) {
             if((getCadena().charAt(i)=="A")||(getCadena().charAt(i)=="a")){
                 setCadena(cadena)="A";
             }
             
         }
     }
     **/
    //retorna el valor del string que representa la posición i
    public char Valori(int pos) {
        char ret = ' ';
        ret = getCadena().charAt(pos);

        return ret;
    }

    //este método retorna la posición en la que inicia el string buscado
    public int posinicio(String busca2, int beg) {
        int ini = 0, cant = 0, fin = 0;

        for (int i = beg; i < getCadena().length() - 1; i++) {

            if ((getCadena().charAt(i)) == (busca2.charAt(cant))) {
                fin = i;
                if (cant < busca2.length()-1) {
                    cant++;
                }
            }
        }
        if(cant==0){
            System.out.println("La búsqueda no produjo ningun resultado");}
        if (cant == busca2.length()-1) {
            ini = fin - cant;
        }
        return ini;
    }

}
