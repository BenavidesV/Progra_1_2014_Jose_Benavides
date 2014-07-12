/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jose.benavides.project.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jose E
 */
public class clsJuego {

    //Declaro los atributos de la clase
    private int[][] area;
    private int[][] celdaAliados;
    private int[][] celdaEnemigos;
    private int largo;
    private int ancho;
    private int ele;        //es la cantidad de elementos con los que se jugará

    //Para llevar las estadísticas
    int enemigosDestruidos = 0, aliadosDestruidos = 0;
    int partJugadas = 0, intentosA = 0, intentosE = 0;
    int cant1 = 0, cant2 = 0, cantp1 = 0, cantp2 = 0;

    public clsJuego(int largo, int ancho, int ele) {
        this.largo = largo;
        this.ancho = ancho;
        this.ele = ele;
        celdaAliados = EscogerCeldaAliado();

        celdaEnemigos = EscogerCeldaEnemigo();

    }

    /**
     * @return the area
     */
    public int[][] getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(int[][] area) {
        this.area = area;
    }

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the ele
     */
    public int getEle() {
        return ele;
    }

    /**
     * @param ele the ele to set
     */
    public void setEle(int ele) {
        this.ele = ele;
    }

    //Para ver los datos de la matriz
    public void ImprimirDatos(int[][] matriz) {
        area = matriz;
        for (int f = 0; f < this.ancho; f++) {
            for (int c = 0; c < this.largo; c++) {
                System.out.print(area[f][c] + " ");

            }
            System.out.println();

        }
    }

    //Este método generará el área de juego
    public int[][] area(int ancho, int largo) {
        area = new int[this.ancho][this.largo];
        int s = 1;

        //se rellena el área en todos sus espacios
        for (int f = 0; f < this.ancho; f++) {
            for (int c = 0; c < this.largo; c++) {
                this.area[f][c] = s;

                s++;
            }
        }
        return this.area;
    }

    //Este método funciona para saber si un elemento está contenido en un arreglo
    public boolean presencia(int puntos[], int posible) {
        boolean presente = false;
        for (int i = 0; i < puntos.length; i++) {
            if (posible == puntos[i]) {
                presente = true;
            }
        }
        return presente;

    }

    public int[] Objetivos(int ele) {
        Random rand = new Random();
        int[] puntos;
        boolean presente = false;
        puntos = new int[ele];
        int multiplicar = this.ancho * this.largo;

        //Se generan las posiciones aleatorias donde estarán los elementos
        for (int k = 0; k < ele; k++) {
            int s = 0;
            int posible = rand.nextInt(multiplicar);
            presente = presencia(puntos, posible);

            while (presente) {
                posible = rand.nextInt(multiplicar);
                presente = presencia(puntos, posible);

            }
            puntos[k] = posible;
        }
        return puntos;
    }

    public int[][] EscogerCeldaAliado() {
        celdaAliados = area(this.ancho, this.largo);
        int[] objsAliado = Objetivos(this.ele);
        for (int i = 0; i < this.ancho; i++) {
            for (int j = 0; j < this.largo; j++) {

                if (presencia(objsAliado, celdaAliados[i][j])) {
                    celdaAliados[i][j] = -2;
                } else {
                    celdaAliados[i][j] = 0;
                }
            }
        }

        return celdaAliados;
    }

    public int[][] EscogerCeldaEnemigo() {
        celdaEnemigos = area(this.ancho, this.largo);
        int[] objsEnemigo = Objetivos(this.ele);
        for (int i = 0; i < this.ancho; i++) {
            for (int j = 0; j < this.largo; j++) {

                if (presencia(objsEnemigo, celdaEnemigos[i][j])) {
                    celdaEnemigos[i][j] = -2;
                } else {
                    celdaEnemigos[i][j] = 0;
                }
            }
        }

        return celdaEnemigos;
    }

    public void EscogerJugadorAliado() {
        int f, c;

        if (Ganador() == "No hay ganador") {
            try {
                Scanner teclado = new Scanner(System.in);

                //Solicito al usuario la posición que quiera atacar
                System.out.print("Escriba la posición Enemiga que quiere atacar" + "\n"
                        + "Fila " + "(0-" + (this.ancho - 1) + ")= ");
                f = teclado.nextInt();
                System.out.print("Columna (0-" + (this.largo - 1) + ")= ");
                c = teclado.nextInt();

                //Cuando el jugador aliado acierte
                if (celdaEnemigos[f][c] == -2) {
                    celdaEnemigos[f][c] = -1;
                    AcertarBlancoEnemigo();

                    //cuando el jugador aliado falle
                } else {
                    celdaEnemigos[f][c] = -1;
                    FallarBlancoEnemigo();
                }
            } catch (ArrayIndexOutOfBoundsException id1) {
                System.err.println("La posición no está dentro del área Aliada"
                        + "\n" + "Los índices deben estra en el rango indicado"
                        + " entre paréntesis");
                EscogerJugadorAliado();
            }
        } else {
            System.out.println(Ganador());
            Menu2();
        }
    }

    public void EscogerJugadorEnemigo() {

        try {

            Scanner teclado = new Scanner(System.in);

            //Solicito al usuario la posición que quiera atacar
            System.out.print("Escriba la posición Aliada que quiere atacar" + "\n"
                    + "Fila " + "(0-" + (this.ancho - 1) + ")= ");
            int f = teclado.nextInt();
            System.out.print("Columna (0-" + (this.largo - 1) + ")= ");
            int c = teclado.nextInt();

            //Cuando el jugador enemigo acierte
            if (celdaAliados[f][c] == -2) {
                celdaAliados[f][c] = -1;
                AcertarBlancoAliado();

                //cuando el jugador enemigo falle
            } else {
                celdaAliados[f][c] = -1;
                FallarBlancoAliado();
            }
        } catch (ArrayIndexOutOfBoundsException id1) {
            System.err.println("La posición no está dentro del área Aliada"
                    + "\n" + "Los índices deben estra en el rango indicado"
                    + " entre paréntesis");
            EscogerJugadorEnemigo();
        }
    }

    public int turnoAliados(String nuevaPartida) {

        if (nuevaPartida.equals("S")) {
            intentosA = 0;
            //Si se quiere hacer una consulta se llama al método con "C"
        } else if (nuevaPartida.equals("C")) {

        } else {
            intentosA++;
        }
        return intentosA;
    }

    public int turnoEnemigos(String nuevaPartida) {

        if (nuevaPartida.equals("S")) {
            intentosE = 0;
        } else if (nuevaPartida.equals("C")) {
        } else {
            intentosE++;
        }
        return intentosE;
    }

    public void AcertarBlancoEnemigo() {
        System.out.println("Acertó");
        SumarEnemigoDestruido("N");
        turnoAliados("N");
        Jugar('A');
    }

    public void AcertarBlancoAliado() {
        System.out.println("Acertó");
        SumarAliadoDestruido("N");
        turnoEnemigos("N");
        Jugar('E');
    }

    public void FallarBlancoEnemigo() {
        System.out.println("Ha fallado");
        turnoAliados("N");
        Jugar('E');
    }

    public void FallarBlancoAliado() {
        System.out.println("Ha fallado");
        turnoEnemigos("N");
        Jugar('A');
    }

    public int SumarEnemigoDestruido(String nuevaPartida) {
        if (nuevaPartida.equals("S")) {
            enemigosDestruidos = 0;
            //Si se quiere hacer una consulta se llama al método con "C"
        } else if (nuevaPartida.equals("C")) {
        } else {
            enemigosDestruidos++;
        }

        return enemigosDestruidos;
    }

    public int SumarAliadoDestruido(String nuevaPartida) {

        if (nuevaPartida.equals("S")) {
            aliadosDestruidos = 0;
            //Si se quiere hacer una consulta se llama al método con "C"
        } else if (nuevaPartida.equals("C")) {
        } else {
            aliadosDestruidos++;
        }
        return aliadosDestruidos;
    }

    public void verEstadisticas() {
        System.out.println("Cantidad de partidas jugadas " + partJugadas);
        System.out.println("Aliados" + "\n" + "Intentos=" + turnoAliados("C"));
        System.out.println("Aciertos=" + SumarEnemigoDestruido("C") + "\n");

        System.out.println("Enemigos" + "\n" + "Intentos=" + turnoEnemigos("C"));
        System.out.println("Aciertos=" + SumarAliadoDestruido("C") + "\n");

    }

    public void IniciarNuevaPartida() {
        Scanner teclado = new Scanner(System.in);
        char b=' ';
        cantidadPartidasJugadas("N");
        clsJuego nueva = new clsJuego(largo, ancho, ele);
        clsJugadores n=new clsJugadores("jugador1", "jugador2");
        //Asigno la celda aliado y enemigo de cada jugador
            System.out.println(n.getJugador1()
                    + " Escriba A si quiere ser aliado"
                    + " o E si quiere ser enemigo");

            teclado = new Scanner(System.in);
            b = teclado.nextLine().charAt(0);
            if (b == 'A' || b == 'a') {
                nueva.EscogerJugadorAliado();
            } else {
                nueva.EscogerJugadorEnemigo();
            }

    }

    public char rendirse() {
        verEstadisticas();
        return 'R';
    }

    public String Ganador() {
        String ganador;
        if (SumarAliadoDestruido("C") == this.ele) {
            ganador = "GANADOR jugador Enemigo";
        } else if (SumarEnemigoDestruido("C") == this.ele) {
            ganador = "GANADOR jugador Aliado";
        } else {
            ganador = "No hay ganador";
        }

        return ganador;
    }

    public void Perdedor(char r, String ganador) {
        String perdedor;
        ganador = Ganador();
        if (r == 'R' || ganador == "GANADOR jugador Enemigo") {
            perdedor = "jugador Aliado";
        } else if (r == 'R' || ganador == "GANADOR jugador Aliado") {
            perdedor = "jugador enemigo";
        }
    }

    public int cantidadPartidasJugadas(String inicio) {

        if (inicio.equals("S")) {
            partJugadas = 0;
        } else {
            partJugadas++;
        }
        return partJugadas;
    }

    public int CantidadDePartidasGanadasJugador2(String ganador) {

        if (ganador == "jugador2") {
            cant2++;
        }
        return cant2;
    }

    public int CantidadDePartidasGanadasJugador1(String ganador) {
        if (ganador == "jugador1") {
            cant1++;
        }
        return cant1;
    }

    public int CantidadDePartidasPerdidasJugador2(String perdedor) {
        if (perdedor == "jugador2") {
            cantp2++;
        }
        return cantp2;
    }

    public int CantidadDePartidasPerdidasJugador1(String perdedor) {
        if (perdedor == "jugador1") {
            cantp1++;
        }
        return cantp1;
    }

    public void Jugar(char jugador) {
        int opc;
        String jugando;
        Scanner teclado = new Scanner(System.in);
        if (jugador == 'A') {
            jugando = "Aliado";
        } else {
            jugando = "Enemigo";
        }
        do {

            System.out.println("Jugador " + jugando + "\n");
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Rendirse" + "\n"
                    + "2. Iniciar Nueva Partida" + "\n"
                    + "3. Elegir posición a atacar" + "\n"
                    + "4.Ver estadísticas");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    rendirse();
                    verEstadisticas();
                    Menu2();
                    break;

                case 2:
                    Menu2();
                    break;

                case 3:
                    if (jugador == 'A') {
                        EscogerJugadorAliado();
                    } else {
                        EscogerJugadorEnemigo();
                    }

                case 4:
                    verEstadisticas();
                    Jugar(jugador);

                default:
            }
            Ganador();

        } while ((Ganador() == "No hay ganador")&&(opc>2));
    }

    public void Menu2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el número de la acción que quiere ejecutar"
                + "\n" + "1. Reiniciar juego" + "\n"
                + "2. Cambiar jugador" + "\n"
                + "3. SALIR" + "\n");
        int a = teclado.nextInt();
        switch (a) {
            case 1:
                //Reinicio los datos de las estadisticas
                SumarAliadoDestruido("S");
                SumarEnemigoDestruido("S");
                turnoAliados("S");
                turnoEnemigos("S");
                //Creo nuevas áreas de juego
                clsJuego nuevo = new clsJuego(largo, ancho, ele);
                System.out.print("Largo= ");
                    largo = teclado.nextInt();
                    System.out.print("Ancho= ");
                    ancho = teclado.nextInt();
                    while (largo <= 0 || ancho <= 0 || (largo == 1 && ancho == 1)) {
                        System.out.println("Las dimesiones deben ser mayores");
                        System.out.print("Largo= ");
                        largo = teclado.nextInt();
                        System.out.print("Ancho= ");
                        ancho = teclado.nextInt();
                    }

                    System.out.println("Digite la cantidad de elementos (1-"
                            + ((largo * ancho) - 1) + ")");
                    ele = teclado.nextInt();

                    /**
                     * Cuando la cantidad de elementos es incorrecta se vuelve a
                     * solicitar
                     */
                    while ((ele >= (largo * ancho)) || ele < 1) 
                        System.out.println("La cantidad de elementos debe estar"
                                + " entre 1 y " + ((largo * ancho) - 1));
                        System.out.println("Digite la cantidad de elementos (1-"
                                + ((largo * ancho) - 1) + ")");
                        ele = teclado.nextInt();

                System.out.println("Escriba A si quiere ser aliado"
                        + " o E si quiere ser enemigo");
                teclado = new Scanner(System.in);
                char b = teclado.nextLine().charAt(0);
                if (b == 'A' || b == 'a') {
                    Jugar('A');
                } else {
                    Jugar('E');
                }
                break;

            case 2:
                //solicito el nombre a los jugadores
                System.out.println("Digite el nombre del jugador 1 ");
                String jugador1 = teclado.nextLine();
                System.out.println("Digite el nombre del jugador 2 ");
                String jugador2 = teclado.nextLine();
                clsJugadores n = new clsJugadores(jugador1, jugador2);

                //Reinicio los datos de las estadisticas
                SumarAliadoDestruido("S");
                SumarEnemigoDestruido("S");
                turnoAliados("S");
                turnoEnemigos("S");

                clsJuego nvo = new clsJuego(largo, ancho, ele);
                
                System.out.println("Escriba A si quiere ser aliado"
                        + "o E si quiere ser enemigo");
                b = teclado.nextLine().charAt(0);
                if (b == 'A' || b == 'a') {
                    Jugar('A');
                } else {
                    Jugar('E');
                }
                break;
                
            case 3:
                //ganador="  ";

            default:
        }

    }
}
