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
public class Ex1 {

    //declaro los atributos de la clase
    private String mensaje;
    private char[][] letras;

    //Método constructor
    public Ex1(String mensaje) {
        this.mensaje = mensaje;
    }

    //creo la matriz para guardar las letras posibles
    public void generar() {
        letras = new char[5][5];
        letras[0][0] = 'A';
        letras[0][1] = 'B';
        letras[0][2] = 'C';
        letras[0][3] = 'D';
        letras[0][4] = 'E';

        letras[1][0] = 'F';
        letras[1][1] = 'G';
        letras[1][2] = 'H';
        letras[1][3] = 'I';
        letras[1][4] = 'J';

        letras[2][0] = 'L';
        letras[2][1] = 'M';
        letras[2][2] = 'N';
        letras[2][3] = 'O';
        letras[2][4] = 'P';

        letras[3][0] = 'Q';
        letras[3][1] = 'R';
        letras[3][2] = 'S';
        letras[3][3] = 'T';
        letras[3][4] = 'U';

        letras[4][0] = 'V';
        letras[4][1] = 'W';
        letras[4][2] = 'X';
        letras[4][3] = 'Y';
        letras[4][4] = 'Z';

    }
    //Este método convierte el mensaje a mayúsculas
    public String mayuscula(){
        String nueva="";
     for (int i = 0; i <getMensaje().length(); i++) {
             nueva=getMensaje().toUpperCase();
    }return nueva;}

//Este método encriptará el mensaje
    public void encripta() {        
        String ret = "", valorf = "", valorc = "";
        int f, c;
        for (int k = 0; k < mayuscula().length(); k++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (mayuscula().charAt(k) == letras[i][j]) {
                        //Obtengo la fila y la columna donde se encuentra el caracter
                        f = i + 1;
                        c = j + 1;
                        for (int l = 1; l <= f; l++) {
                            valorf += ".";
                        }
                        for (int l = 1; l <= c; l++) {
                            valorc += ".";
                        }

                    }

                }
                
            }
            ret += valorf + " " + valorc + " ";
            valorf="";
            valorc="";

        }
        System.out.println(ret);
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
