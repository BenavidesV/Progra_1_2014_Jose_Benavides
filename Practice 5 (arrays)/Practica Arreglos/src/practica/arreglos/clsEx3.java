/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.arreglos;

/**
 *
 * @author Jose E 3.Se tienen las notas del primer parcial de los alumnos de dos
 * cursos, el curso A y el curso B, cada curso cuenta con 5 alumnos. Realizar un
 * programa que muestre el curso que obtuvo el mayor promedio general.
 */
public class clsEx3 {

    private double NotaA[] = new double[5];
    private double NotaB[] = new double[5];

    public void AgregarValor(double nA, double nB) {
        for (int i = 0; i < NotaA.length; i++) {
            if (NotaA[i] == 0) {
                NotaA[i] = nA;
                
            }
            if (NotaB[i] == 0) {
                NotaB[i] = nB;
                break;
            }
            
        }

    }
    public String PromedioMayor() {
        float sumpromedio = 0, promedio, sumpromediob = 0, promediob;
        String promedioM;
        for (int i = 0; i < NotaA.length; i++) {
            sumpromedio += NotaA[i];
        }
        promedio = sumpromedio / NotaB.length;

        for (int j = 0; j < NotaB.length; j++) {
            sumpromediob += NotaB[j];
        }
        promediob = sumpromediob / NotaB.length;

        if (promedio < promediob) {
            promedioM = "Curso B";
        } else {
            promedioM = "Curso A";
        }
        return promedioM;
    }

}
