/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

/**
 *
 * @author Familia
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String h = "", min = "", s = "";
        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 60; j++) {

                for (int k = 0; k < 60; k++) {
                    if ((i < 10) || (j < 10) || (k < 10)) {
                        if (i < 10) {
                            h = "0" + String.valueOf(i);
                        } else {
                            h = String.valueOf(i);
                        }
                        if (j < 10) {
                            min = "0" + String.valueOf(j);
                        } else {
                            min = String.valueOf(j);
                        }
                        if (k < 10) {
                            s = "0" + String.valueOf(k);
                        } else {
                            s = String.valueOf(k);
                        }

                    } else {
                        h = String.valueOf(i);
                        min = String.valueOf(j);
                        s = String.valueOf(k);
                        
                    }System.out.println("Hora Actual: " + h + ":" + min + ":" + s);
                }

            }
        }
    }
}
