/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jose.benavides.project.pkg1;

import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class clsJugadores {

    //Declaro los atributos de la clase
    private String jugador1;
    private String jugador2;

    public clsJugadores(String jugador1, String jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    /**
     * @return the jugador1
     */
    public String getJugador1() {
        return jugador1;
    }

    /**
     * @param jugador1 the jugador1 to set
     */
    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    /**
     * @return the jugador2
     */
    public String getJugador2() {
        return jugador2;
    }

    /**
     * @param jugador2 the jugador2 to set
     */
    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

}
