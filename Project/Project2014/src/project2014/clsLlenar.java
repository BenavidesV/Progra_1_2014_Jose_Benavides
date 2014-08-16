/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2014;

import Listas.Equipos;
import Listas.Jugadores;
import Listas.Partidos;
import Nodos.NodoEquipo;
import Nodos.NodoJugador;


/**
 *
 * @author Jose E & Alvaro
 */
public class clsLlenar {
    
    public Equipos relleno(Equipos raiz){
    

//En esta sección se insertan los equipos en una lista ordenada alfabéticamente
        Jugadores alemania = new Jugadores();
        alemania.Insertar("GOETZE", 22,2 );
        alemania.Insertar("SCHUERRLE", 23,3);
        alemania.Insertar("KROOS", 24,2);
        alemania.Insertar("MUELLER", 24,5);
        alemania.Insertar("HUMMELS", 25,2);
        alemania.Insertar("OEZIL", 25,1);
        alemania.Insertar("KHEDIRA", 25,1);
        alemania.Insertar("KLOSE", 36,2);

        Jugadores argelia = new Jugadores();
        argelia.Insertar("FEGHOULI", 24,1);
        argelia.Insertar("BRAHIMI", 24,1);
        argelia.Insertar("SLIMANI", 25,2);
        argelia.Insertar("DJABOU", 27,2);
        argelia.Insertar("HALLICHE", 27,1);

        Jugadores argentina = new Jugadores();
        argentina.Insertar("ROJO", 24,1);
        argentina.Insertar("DI MARIA", 26,1);
        argentina.Insertar("HIGUAIN", 26,1);
        argentina.Insertar("MESSI", 27,4);
        argentina.Insertar("LAVEZZI", 29,0);

        Jugadores australia = new Jugadores();
        australia.Insertar("DAVIDSON", 23,0);
        australia.Insertar("LANGERAK", 25,0);
        australia.Insertar("WILKINSON", 29,0);
        australia.Insertar("JEDINAK", 29,1);
        australia.Insertar("CAHILL", 34,2);

        Jugadores belgica = new Jugadores();
        belgica.Insertar("ORIGI", 19,1);
        belgica.Insertar("LUKAKU", 21,1);
        belgica.Insertar("DE BRUYNE", 23,1);
        belgica.Insertar("FELLAINI", 26,1);
        belgica.Insertar("VERTONGHEN", 27,1);
        belgica.Insertar("MERTENS", 27,1);

        Jugadores bosnia = new Jugadores();
        bosnia.Insertar("PJANIC", 24,1);
        bosnia.Insertar("DZEKO", 28,1);
        bosnia.Insertar("VRSAJEVIC", 28,1);
        bosnia.Insertar("IBIZEVIC", 29,1);
        bosnia.Insertar("AVDUKIC", 33,0);

        Jugadores brasil = new Jugadores();
        brasil.Insertar("OSCAR", 20,2);
        brasil.Insertar("NEYMAR JR", 22,4);
        brasil.Insertar("DAVID LUIZ", 27,2);
        brasil.Insertar("SILVA", 29,1);
        brasil.Insertar("FERNANDIHNO", 29,1);
        brasil.Insertar("FRED", 30,1);

        Jugadores camerun = new Jugadores();
        camerun.Insertar("MATIP", 22,1);
        camerun.Insertar("SONG", 26,0);
        camerun.Insertar("MBIA", 28,0);
        camerun.Insertar("ENOH", 28,0);
        camerun.Insertar("ETOO", 33,0);

        Jugadores chile = new Jugadores();
        chile.Insertar("VARGAS", 24,1);
        chile.Insertar("SANCHEZ", 25,2);
        chile.Insertar("ARANGUIZ", 25,1);
        chile.Insertar("BEASEJOUR", 30,1);
        chile.Insertar("VALDIVIA", 30,1);

        Jugadores colombia = new Jugadores();
        colombia.Insertar("QUINTERO", 21,1);
        colombia.Insertar("JAMES", 23,6);
        colombia.Insertar("CUADRADO", 26,1);
        colombia.Insertar("MARTINEZ", 27,2);
        colombia.Insertar("ARMERO", 27,1);
        colombia.Insertar("GUTIERREZ", 29,1);

        Jugadores cMarfil = new Jugadores();
        cMarfil.Insertar("BONY", 25,2);
        cMarfil.Insertar("GERVINHO", 27,2);
        cMarfil.Insertar("TOURE", 31,0);
        cMarfil.Insertar("BOKA", 31,0);
        cMarfil.Insertar("DROGBA", 36,0);

        Jugadores cRica = new Jugadores();
        cRica.Insertar("CAMPBELL", 22,1);
        cRica.Insertar("CALVO", 23,0);
        cRica.Insertar("URENA", 24,1);
        cRica.Insertar("DUARTE", 25,1);
        cRica.Insertar("RUIZ", 28,2);

        Jugadores croacia = new Jugadores();
        croacia.Insertar("PERISIC", 25,2);
        croacia.Insertar("MANDZUKIC", 28,2);
        croacia.Insertar("MODRIC", 28,0);
        croacia.Insertar("EDUARDO", 31,0);
        croacia.Insertar("OLIC", 34,1);

        Jugadores ecuador = new Jugadores();
        ecuador.Insertar("VALENCIA", 24,3);
        ecuador.Insertar("ERAZO", 26,0);
        ecuador.Insertar("NOBOA", 27,0);
        ecuador.Insertar("ARROYO", 29,0);
        ecuador.Insertar("MINDA", 31,0);

        Jugadores eu = new Jugadores();
        eu.Insertar("GREEN", 19,1);
        eu.Insertar("BROOKS", 21,1);
        eu.Insertar("DEMPSEY", 31,2);
        eu.Insertar("JONES", 32,1);
        eu.Insertar("BEASLEY", 32,0);

        Jugadores espana = new Jugadores();
        espana.Insertar("MATA", 26,1);
        espana.Insertar("RAMOS", 28,0);
        espana.Insertar("INIESTA", 30,0);
        espana.Insertar("TORRES", 30,1);
        espana.Insertar("VILLA", 32,1);
        espana.Insertar("ALONSO", 32,1);

        Jugadores francia = new Jugadores();
        francia.Insertar("POGBA", 21,1);
        francia.Insertar("SISSOKO", 24,1);
        francia.Insertar("BENZEMA", 26,3);
        francia.Insertar("GIROUD", 27,1);
        francia.Insertar("MATUIDI", 27,1);
        francia.Insertar("VALVUENA", 29,1);

        Jugadores ghana = new Jugadores();
        ghana.Insertar("J AYEW", 22,0);
        ghana.Insertar("WARIS", 22,0);
        ghana.Insertar("AYEW", 24,2);
        ghana.Insertar("GYAN", 28,2);

        Jugadores grecia = new Jugadores();
        grecia.Insertar("MANOLAS", 23,0);
        grecia.Insertar("SAMARIS", 25,1);
        grecia.Insertar("PAPASTATHOPOULOS", 26,1);
        grecia.Insertar("GLYCOS", 27,0);
        grecia.Insertar("SAMARAS", 29,1);

        Jugadores honduras = new Jugadores();
        honduras.Insertar("BENGTSON", 27,0);
        honduras.Insertar("MONTES", 28,0);
        honduras.Insertar("GARCIA", 29,0);
        honduras.Insertar("COSTLY", 32,1);

        Jugadores inglaterra = new Jugadores();
        inglaterra.Insertar("WELBECK", 23,0);
        inglaterra.Insertar("STURRIDGE", 24,1);
        inglaterra.Insertar("ROONEY", 28,1);
        inglaterra.Insertar("GERRARD", 34,0);
        inglaterra.Insertar("LAMPARD", 36,0);

        Jugadores iran = new Jugadores();
        iran.Insertar("JAHAN BAKHSH", 20,0);
        iran.Insertar("ANSAFARI FARD", 24,0);
        iran.Insertar("GHOOCHANNEJAD", 26,1);
        iran.Insertar("DAVARI", 26,0);

        Jugadores italia = new Jugadores();
        italia.Insertar("BALOTELLI", 23,1);
        italia.Insertar("MARCHISIO", 28,1);
        italia.Insertar("PIRLO", 35,0);
        italia.Insertar("BUFFON", 36,0);

        Jugadores japon = new Jugadores();
        japon.Insertar("UCHIDA", 26,0);
        japon.Insertar("HONDA", 28,1);
        japon.Insertar("OKAZAKI", 28,1);
        japon.Insertar("ENDO", 34,0);

        Jugadores mexico = new Jugadores();
        mexico.Insertar("DOS SANTOS", 25,1);
        mexico.Insertar("HERNANDEZ", 26,1);
        mexico.Insertar("GUARDADO", 27,1);
        mexico.Insertar("OCHOA", 29,0);
        mexico.Insertar("PERALTA", 30,1);
        mexico.Insertar("MARQUEZ", 35,1);

        Jugadores nigeria = new Jugadores();
        nigeria.Insertar("MUSA", 21,2);
        nigeria.Insertar("ODUNLAMI", 23,0);
        nigeria.Insertar("MIKEL", 27,0);
        nigeria.Insertar("YOBO", 33,0);
        nigeria.Insertar("ODEMWINGIE", 33,1);

        Jugadores pBajos = new Jugadores();
        pBajos.Insertar("DEPAY", 20,2);
        pBajos.Insertar("DE VRIJ", 22,1);
        pBajos.Insertar("WIJNALDUM", 23,1);
        pBajos.Insertar("FER", 24,1);
        pBajos.Insertar("BLIND", 24,1);
        pBajos.Insertar("HUNTELARR", 30,1);
        pBajos.Insertar("ROBBEN", 30,3);
        pBajos.Insertar("VAN PERSIE", 30,4);
        pBajos.Insertar("SNEIJDER", 30,1);

        Jugadores portugal = new Jugadores();
        portugal.Insertar("NETO", 26,0);
        portugal.Insertar("NANI", 27,1);
        portugal.Insertar("VARELA", 29,1);
        portugal.Insertar("CRISTIANO RONALDO", 29,1);
        portugal.Insertar("BETO", 32,0);

        Jugadores rCorea = new Jugadores();
        rCorea.Insertar("SON", 22,1);
        rCorea.Insertar("KOO", 25,1);
        rCorea.Insertar("KI", 25,0);
        rCorea.Insertar("LEE", 29,1);
        rCorea.Insertar("HA", 29,0);

        Jugadores rusia = new Jugadores();
        rusia.Insertar("KOKORIN", 23,1);
        rusia.Insertar("IONOV", 25,0);
        rusia.Insertar("GRANAT", 27,0);
        rusia.Insertar("KERZHAKOV", 31,1);

        Jugadores suiza = new Jugadores();
        suiza.Insertar("XHAKA", 21,1);
        suiza.Insertar("SEFEROVIC", 22,1);
        suiza.Insertar("SHAKIRI", 22,3);
        suiza.Insertar("MEHMEDI", 23,1);
        suiza.Insertar("DZEMAILI", 28,1);

        Jugadores uruguay = new Jugadores();
        uruguay.Insertar("LODEIRO", 25,0);
        uruguay.Insertar("CAVANI", 27,1);
        uruguay.Insertar("SUAREZ", 27,2);
        uruguay.Insertar("GODIN", 28,1);
        uruguay.Insertar("LUGANO", 33,0);
        
        //inserto los equipos en la lista raiz
        raiz.Insertar("ALEMANIA", alemania, alemania);
        raiz.Insertar("ARGELIA", argelia, argelia);
        raiz.Insertar("ARGENTINA", argentina, argentina);
        raiz.Insertar("AUSTRALIA", australia, australia);
        raiz.Insertar("BELGICA", belgica, belgica);
        raiz.Insertar("BOSNIA Y HERZEGOVINA", bosnia, bosnia);
        raiz.Insertar("BRASIL", brasil, brasil);
        raiz.Insertar("CAMERUN", camerun, camerun);
        raiz.Insertar("CHILE", chile, chile);
        raiz.Insertar("COLOMBIA", colombia, colombia);
        raiz.Insertar("COSTA DE MARFIL", cMarfil, cMarfil);
        raiz.Insertar("COSTA RICA", cRica, cRica);
        raiz.Insertar("CROACIA", croacia, croacia);
        raiz.Insertar("ECUADOR", ecuador, ecuador);
        raiz.Insertar("ESTADOS UNIDOS", eu, eu);
        raiz.Insertar("ESPAÑA", espana, espana);
        raiz.Insertar("GHANA", ghana, ghana);
        raiz.Insertar("GRECIA", grecia, grecia);
        raiz.Insertar("HONDURAS", honduras, honduras);
        raiz.Insertar("INGLATERRA", inglaterra, inglaterra);
        raiz.Insertar("IRAN",iran,iran);
        raiz.Insertar("ITALIA",italia,italia);
        raiz.Insertar("JAPON",japon,japon);
        raiz.Insertar("MEXICO",mexico,mexico);
        raiz.Insertar("NIGERIA",nigeria,nigeria);
        raiz.Insertar("PAISES BAJOS",pBajos,pBajos);
        raiz.Insertar("PORTUGAL",portugal,portugal);
        raiz.Insertar("REPUBLICA DE COREA",rCorea,rCorea);
        raiz.Insertar("RUSIA",rusia,rusia);
        raiz.Insertar("SUIZA",suiza,suiza);
        raiz.Insertar("URUGUAY",uruguay,uruguay);        

        
        return raiz;
    }
}
