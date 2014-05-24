/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Jose E
 */
public class clsEx3 {

    String letra, mensaje="hola";

    public clsEx3(String letra) {
        this.letra = letra;
    }

    public String valora() {
      
        switch (letra.toUpperCase()) {
            case "A":
                mensaje= "Excelente";
                break;
            case "B":
                mensaje= "Bueno";
                break;
            case "C":
                mensaje= "Regular";
                break;
            case "D":
                mensaje= "Malo";
                break;
            case "E":
                mensaje= "Pésimo";
                break;
            default:
        }return mensaje;
    }

}
