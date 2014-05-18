/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex8;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose E
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        char r = 'S', opt = ' ';
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));
        //Crear la instancia de la clase 
        clsTablas t = new clsTablas(n);
        
        do {
            opt = JOptionPane.showInputDialog("Seleccione una opción: "
                    + "\n" + "1: Ciclo While"
                    + "\n" + "2: Ciclo Do While"
                    + "\n" + "3: Ciclo For").charAt(0);
            switch (opt) {
                case '1':
                    JOptionPane.showMessageDialog(null, t.calculaWhile());
                    break;
                case '2':
                    JOptionPane.showMessageDialog(null, t.calculaDowhile());
                    break;
                case'3':
                    JOptionPane.showMessageDialog(null, t.calculaFor());
                    break;
            }
            r = JOptionPane.showInputDialog("¿Desea continuar?").charAt(0);
        } while ((r == 's') || (r == 'S'));
    }
    
}
