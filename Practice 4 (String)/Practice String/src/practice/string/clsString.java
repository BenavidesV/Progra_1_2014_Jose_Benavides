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
    
    public String Upper(){
        String ret="";
         for (int i = 0; i <getCadena().length(); i++) {
             if(getCadena().charAt(i)=='a'){
                 ret+="A";
             }
             else if(getCadena().charAt(i)=='b'){
                 ret+="B";
             }
             else if(getCadena().charAt(i)=='c'){
                 ret+="C";
             }
             else if(getCadena().charAt(i)=='d'){
                 ret+="D";
             }
             else if(getCadena().charAt(i)=='e'){
                 ret+="E";
             }
             else if(getCadena().charAt(i)=='g'){
                 ret+="G";
             }
             else if(getCadena().charAt(i)=='h'){
                 ret+="H";
             }
             else if(getCadena().charAt(i)=='i'){
                 ret+="I";
             }
             else if(getCadena().charAt(i)=='j'){
                 ret+="J";
             }
             else if(getCadena().charAt(i)=='k'){
                 ret+="K";
             }
             else if(getCadena().charAt(i)=='l'){
                 ret+="L";
             }
             else if(getCadena().charAt(i)=='m'){
                 ret+="M";
             }
             else if(getCadena().charAt(i)=='n'){
                 ret+="N";
             }
             else if(getCadena().charAt(i)=='o'){
                 ret+="O";
             }
             else if(getCadena().charAt(i)=='p'){
                 ret+="P";
             }
             else if(getCadena().charAt(i)=='q'){
                 ret+="Q";
             }
             else if(getCadena().charAt(i)=='r'){
                 ret+="R";
             }
             else if(getCadena().charAt(i)=='s'){
                 ret+="S";
             }
             else if(getCadena().charAt(i)=='t'){
                 ret+="T";
             }
             else if(getCadena().charAt(i)=='u'){
                 ret+="U";
             }
             else if(getCadena().charAt(i)=='v'){
                 ret+="V";
             }
             else if(getCadena().charAt(i)=='x'){
                 ret+="X";
             }
             else if(getCadena().charAt(i)=='y'){
                 ret+="Y";
             }
             else if(getCadena().charAt(i)=='z'){
                 ret+="Z";
             }
             else if(getCadena().charAt(i)=='w'){
                 ret+="W";
             }
             else if(getCadena().charAt(i)=='f'){
                 ret+="F";
             }else{
             ret+=getCadena().charAt(i);
             }
             
         }return ret;
     }
    
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
