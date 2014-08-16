/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2014;

import Listas.Partidos;
import Nodos.NodoPartidos;

/**
 *
 * @author Jose E & Alvaro
 */
public class clsLlenarCalendario {

    //Se insertan los partidos
    public Partidos Llenarcalendario(Partidos calendario) {

        NodoPartidos Partido = new NodoPartidos();
        Partido.setLocal("BRASIL");
        Partido.setGlocal(3);
        Partido.setVisita("CROACIA");
        Partido.setGvisita(1);
        Partido.setFecha("12 JUNIO");
        Partido.setHora("17:00");
        Partido.setSede("ARENA DE SAO PAULO");
        Partido.setGolesL("29' 71'GP NEYMAR JR"+ "\n" + "OSCAR 90'+1");
        Partido.setGolesV("11'GPM MARCELO ");
        Partido.setTemperatura(24);
        Partido.setViento(8);
        Partido.setHumedad(63);
        
        NodoPartidos Partido1 = new NodoPartidos();
        
        Partido1.setLocal("MEXICO");
        Partido1.setGlocal(1);
        Partido1.setVisita("CAMERUN");
        Partido1.setGvisita(0);
        Partido1.setFecha( "13 JUNIO");
        Partido1.setHora("13:00");
        Partido1.setSede("ESTADIO DAS DUNAS");
        Partido1.setGolesL("61' PERALTA");
        Partido1.setGolesV("");
        Partido1.setTemperatura(27);
        Partido1.setViento(22);
        Partido1.setHumedad(65);
        
        NodoPartidos Partido2 = new NodoPartidos();
        Partido2.setLocal("ESPAÑA");
        Partido2.setGlocal(1);
        Partido2.setVisita("PAISES BAJOS");
        Partido2.setGvisita(5);
        Partido2.setFecha("12 JUNIO");
        Partido2.setHora("16:00");
        Partido2.setSede("ARENA FONTE NOVA");
        Partido2.setGolesL("27' GP ALONSO");
        Partido2.setGolesV("44', 72' V. PERSIE" + "\n"
                + "53', 80' ROBBEN" + "\n" + "65' DE VRIJ");
        Partido2.setTemperatura(27);
        Partido2.setViento(12);
        Partido2.setHumedad(87);
        
        NodoPartidos Partido3 = new NodoPartidos();
        Partido3.setLocal("CHILE");
        Partido3.setGlocal(3);
        Partido3.setVisita("AUSTRALIA");
        Partido3.setGvisita(1);
        Partido3.setFecha("13 JUNIO");
        Partido3.setHora("18:00");
        Partido3.setSede("ARENA PANTANAL");
        Partido3.setGolesL("12' ALEXIS" + "\n" + "14' VALDIVIA"
                + "\n" + "90'+2 BEAUSEJOUR");
        Partido3.setGolesV("35' CAHILL");
        Partido3.setTemperatura(29);
        Partido3.setViento(14);
        Partido3.setHumedad(55);
        
        NodoPartidos Partido4 = new NodoPartidos();
        Partido4.setLocal("COLOMBIA");
        Partido4.setGlocal(3);
        Partido4.setVisita("GRECIA");
        Partido4.setGvisita(0);
        Partido4.setFecha(" 14 JUNIO");
        Partido4.setHora(",13:00");
        Partido4.setSede("ESTADIO MINEIRAO");
        Partido4.setGolesL("5' ARMERO" + "\n" + "58' TEO" +
                        "\n" + "90'+3 JAMES");
        Partido4.setGolesV("");
        Partido4.setTemperatura(24);
        Partido4.setViento(11);
        Partido4.setHumedad(51);
       
        NodoPartidos Partido5 = new NodoPartidos();
        Partido5.setLocal("URUGUAY");
        Partido5.setGlocal(1);
        Partido5.setVisita("COSTA RICA");
        Partido5.setGvisita(3);
        Partido5.setFecha("14 JUNIO");
        Partido5.setHora("16:00");
        Partido5.setSede("ESTADIO CASTELAO");
        Partido5.setGolesL("24' CAVANI");
        Partido5.setGolesV("57' DUARTE" + "\n" + "54' CAMPELL"
                + "\n" + "84' UREÑA");
        Partido5.setTemperatura(30);
        Partido5.setViento(19);
        Partido5.setHumedad(58);
       
        NodoPartidos Partido6 = new NodoPartidos();
        Partido6.setLocal("INGLATERRA");
        Partido6.setGlocal(1);
        Partido6.setVisita("ITALIA");
        Partido6.setGvisita(2);
        Partido6.setFecha(" 14 JUNIO");
        Partido6.setHora("18:00");
        Partido6.setSede("ARENA AMAZONIA");
        Partido6.setGolesL("37' STURRIDGE");
        Partido6.setGolesV("50' BALOTELLI" + "\n" + "35' MARCHISIO");
        Partido6.setTemperatura(-1);
        Partido6.setViento(-1);
        Partido6.setHumedad(-1);
        
        NodoPartidos Partido7 = new NodoPartidos();
        Partido7.setLocal("COSTA DE MARFIL");
        Partido7.setGlocal(2);
        Partido7.setVisita("JAPON");
        Partido7.setGvisita(1);
        Partido7.setFecha(" 14 JUNIO");
        Partido7.setHora("22:00");
        Partido7.setSede("ARENA PERNAMBUCO");
        Partido7.setGolesL("64' WILFRIED"+ "\n" +
                "66' GERVINHO");
        Partido7.setGolesV("16' HONDA");
        Partido7.setTemperatura(26);
        Partido7.setViento(10);
        Partido7.setHumedad(77);
        
        
        NodoPartidos Partido8 = new NodoPartidos();
        Partido8.setLocal("SUIZA");
        Partido8.setGlocal(2);
        Partido8.setVisita("ECUADOR");
        Partido8.setGvisita(1);
        Partido8.setFecha(" 15 JUNIO");
        Partido8.setHora("13:00");
        Partido8.setSede("ESTADIO NACIONAL");
        Partido8.setGolesL("48' MEHMEDI"+ "\n" +"90'+3 SEFEROVIC ");
        Partido8.setGolesV("22' VALENCIA");
        Partido8.setTemperatura(24);
        Partido8.setViento(21);
        Partido8.setHumedad(61);
        
        
        NodoPartidos Partido9 = new NodoPartidos();
        Partido9.setLocal("COSTA RICA");
        Partido9.setGlocal(0);
        Partido9.setVisita("INGLATERRA");
        Partido9.setGvisita(0);
        Partido9.setFecha(" 24 JUNIO");
        Partido9.setHora("13:00");
        Partido9.setSede("ESTADIO MINEIRAO");
        Partido9.setGolesL("");
        Partido9.setGolesV("");
        Partido9.setTemperatura(24);
        Partido9.setViento(3);
        Partido9.setHumedad(44);
        
        
                
                
        
        
        
        

        

       

        

        

//        ListaPartidos.Insertar("FRANCIA",3, "HONDURAS",0, " 15 JUNIO", "16:00",
//                " ESTADIO BEIRA-RIO", "45' GP, 72' BENZEMA" + "\n"
//                + "48' GPM' VALLADARES","",18,19,78);
//
//        ListaPartidos.Insertar("ARGENTINA",2, "BOSNIA Y HERZEGOVINA",1, " 15 JUNIO",
//                "19:00", " ESTADIO MARACANA", "85' IBIŠEVIĆ" + "\n"
//                + "3' GPM KOLAŠINAC", "65' MESSI ",25,10,69);
//
//        ListaPartidos.Insertar("ALEMANIA",4, "PORTUGAL",0, " 16 JUNIO", "13:00",
//                "ARENA FONTE NOVA", "" + "\n" + "12', 45'+1, 78 GP MULLER",
//                "32' HUMMELS ",26,13,79);
//
//        ListaPartidos.Insertar("IRÁN",0, "NIGERIA",0, " 16 JUNIO", "16:00",
//                "ARENA DA BAIXADA", "", "",21,8,68);
//
//        ListaPartidos.Insertar("GHANA",1, "EEUU",2, " 16 JUNIO", "19:00",
//                "ESTADIO DAS DUNAS", "86' BROOKS" + "\n" + "1',DEMPSEY",
//                "82' AYEW ",28,6,67);
//
//        ListaPartidos.Insertar("BÉLGICA",2, "ARGELIA",1, " 17 JUNIO", "13:00",
//                "ESTADIO MINEIRAO", "25'GP FEGHOULI" + "\n" + "70' FELLAINI",
//                "80' MERTENS ",29,5,37);
//
//        ListaPartidos.Insertar("BRASIL",0, "MEXICO",0, " 17 JUNIO", "16:00",
//                "ESTADIO CASTELAO", "", "",28,27,66);
//
//        ListaPartidos.Insertar("RUSIA",1, "REPUBLICA DE COREA",1, " 17 JUNIO",
//                "18:00", "ARENA PANTANAL", "68' LEE", "74' KERZHAKOV",26,20,70);
//
//        ListaPartidos.Insertar("AUSTRALIA",2, "PAISES BAJOS",3, " 18 JUNIO", "13:00",
//                "ESTADIO BEIRA-RIO", "58'PERSIE" + "68' MEMPHIS " + "20' ROBBEN" + "\n"
//                + "21' CAHILL ", "54'GP JEDINAK ",14,15,65);
//
//        ListaPartidos.Insertar("ESPAÑA",0, "CHILE",2, " 18 JUNIO", "16:00",
//                "ESTADIO MARACANA", "43' ARANGUIZ" + "20' VARGAS " + "\n", ""
//        ,26,14,74);
//
//        ListaPartidos.Insertar("CAMERUN ",0, "CROACIA",4, "18 JUNIO", "18:00",
//                "ARENA AMAZONIA", "48' PERIŠIĆ" + "11' OLIĆ " + "61',63'MANDŽUKIĆ "
//                + "\n", "",27,6,86);
//
//        ListaPartidos.Insertar("COLOMBIA ",2, "COSTA DE MARFIL",1, "19 JUNIO", "13:00",
//                "ESTADIO NACIONAL BRASILIA", "73' GERVINHO" + "\n", "64' JAMES"
//                + "70' QUINTERO",26,18,77);
//
//        ListaPartidos.Insertar("URUGUAY",2, "INGLATERRA",1, " 19 JUNIO", "16:00",
//                "ARENA DE SAO PAULO", "75' ROONEY" + "\n", "39', 85' SUAREZ",
//                12,18,77);
//
//        ListaPartidos.Insertar("JAPON",0, "GRECIA",0, " 19 JUNIO", "19:00",
//                "ESTADIO DAS DUNAS", "" + "\n", "",29,5,65);
//
//        ListaPartidos.Insertar("ITALIA",0, "COSTA RICA",1, " 20 JUNIO", "13:00",
//                "ARENA PERNAMBUCO", "44' RUIZ" + "\n", "",29,15,70);
//
//        ListaPartidos.Insertar("SUIZA",2, "FRANCIA",5, " 20 JUNIO", "16:00",
//                "ARENA FONTE NOVA", "18' MATUIDI" + "17'GIROUD "
//                + "67' BENZEMA" + "40' VALBUENA " + "73'SISSOKO " + "\n",
//                "81 DZEMAILI" + "87' XHAKA",26,12,69);
//
//        ListaPartidos.Insertar("HONDURAS",1, "ECUADOR",2, " 20 JUNIO", "19:00",
//                "ARENA DA BAIXADA", "75' ROONEY" + "\n", "39', 85' SUAREZ",
//                13,3,77);
//
//        ListaPartidos.Insertar("ARGENTINA",1, "IRAN",0, " 21 JUNIO", "13:00",
//                "ESTADIO MINEIRAO", "" + "\n", "90'+1 MESSI",23,8,51);
//
//        //Falta un gol de Ghana
//        ListaPartidos.Insertar("ALEMANIA",2, "GHANA",2, " 21 JUNIO", "16:00",
//                "ESTADIO CASTELAO", "63' GYAN" + "\n", "51' GOETZE" + 
//                        "71' KLOSE",29,19,61);
//
//        ListaPartidos.Insertar("NIGERIA",1, "BOSNIA Y HERZEGOVINA",0, " 21 JUNIO",
//                "18:00", "ARENA PANTANAL", "" + "\n", "29' ODEMWINGIE",29,7,55);
//
//        ListaPartidos.Insertar("BELGICA",1, "RUSIA",0, " 22 JUNIO",
//                "13:00", "ESTADIO MARACANA", "" + "\n", "88' ORIGI",24,8,73);
//
//        ListaPartidos.Insertar("REPUBLICA DE COREA",2, "ARGELIA",4, " 22 JUNIO",
//                "16:00", "ESTADIO BEIRA-RIO", "38' DJABOU " + "28' HALLICHE "
//                + "26' SLIMANI" + "62' BRAHIMI " + "\n", "50' SON" + "72' KOO",
//                21,5,57);
//
//        ListaPartidos.Insertar("EEUU",2, "PORTUGAL", 2," 22 JUNIO",
//                "18:00", "ARENA AMAZONIA", "90'+5 VARELA" + "5' NANI" + "\n",
//                "64' JONES" + "81' DEMPSEY",30,8,66);
//
//        ListaPartidos.Insertar("PAISES BAJOS",2, "CHILE",0, " 23 JUNIO",
//                "13:00", "ARENA SAO PAULO", "" + "\n",
//                "77' FER" + "90'+2 MEMPHIS",20,6,53);
//
//        ListaPartidos.Insertar("AUSTRALIA",0, "ESPAÑA",3, " 23 JUNIO",
//                "13:00", "ARENA DA BAIXADA", "82' MATA" + "69' TORRES"
//                + "36' VILLA" + "\n", "",18,8,73);
//
//        ListaPartidos.Insertar("CAMERUN",1, "BRASIL",4, " 23 JUNIO",
//                "17:00", "ESTADIO NACIONAL BRASILIA", "49' FRED" + "17',35' NEYMAR"
//                + "84' FERNANDINHO" + "\n", "26' MATIP",24,26,57);
//
//        ListaPartidos.Insertar("CROACIA",1, "MEXICO",3, " 23 JUNIO",
//                "17:00", "ARENA PERNAMBUCO", "75' GUARDADO" + "72' MARQUEZ"
//                + "82' HERNANDEZ" + "\n", "87' PERIŠIĆ",26,16,82);
//
//        ListaPartidos.Insertar("ITALIA",0, "URUGUAY",1, " 24 JUNIO",
//                "13:00", "ESTADIO DAS DUNAS", "81' GODIN" + "\n", "",33,14,45);
//
//        
//
//        ListaPartidos.Insertar("JAPON",1, "COLOMBIA",4, " 24 JUNIO",
//                "16:00", "ARENA PANTANAL", "55', 82' JACKSON" + "17'GP CUADRADO"
//                + "90' JAMES" + "\n", "45'+1 OKAZAKI",31,10,30);
//
//        ListaPartidos.Insertar("GRECIA",2, "COSTA DE MARFIL",1, " 24 JUNIO",
//                "17:00", "ESTADIO CASTELAO", "74' WILFRIED" + "\n", "42' SAMARIS"
//                + "90'+3 GP SAMARAS",29,27,58);
//
//        ListaPartidos.Insertar("NIGERIA",0, "ARGENTINA",1, " 25 JUNIO",
//                "13:00", "ESTADIO BEIRA-RIO", "50' ROJO" + " 3',45'+1' MESSI"
//                + "\n", "4', 47' MUSA",20,6,87);
//
//        ListaPartidos.Insertar("BOSNIA Y HERZEGOVINA",3, "IRAN",1, " 25 JUNIO",
//                "13:00", "ARENA FONTE NOVA", "82' REZA" + "\n", "23' DŽEKO"
//                + "59' PJANIĆ" + "83' VRŠAJEVIĆ",25,10,76);
//
//        ListaPartidos.Insertar("HONDURAS",0, "SUIZA",3, " 25 JUNIO",
//                "16:00", "ARENA AMAZONIA", "" + "\n", "31', 6', 71' SHAQIRI"
//                + "90'+3 GP SAMARAS",26,8,88);
//
//        ListaPartidos.Insertar("ECUADOR",0, "FRANCIA",0, " 25 JUNIO",
//                "17:00", "ESTADIO MARACANA", "" + "\n", "",28,15,48);
//        ListaPartidos.Insertar("PORTUGAL",2, "GHANA",1, " 26 JUNIO",
//                "13:00", "ESTADIO NACIONAL BRASILIA", "57' GYAN" + "\n",
//                "31' GPM BOYE" + "80' RONALDO",26,21,50);
//
//        ListaPartidos.Insertar("EEUU",0, "ALEMANIA",1, " 26 JUNIO",
//                "13:00", "ARENA PERNAMBUCO", "55' MULLER" + "\n", "",27,12,79);

//        ListaPartidos.Insertar("REPUBLICA COREA",0, "BELGICA",1, " 26 JUNIO",
//                "17:00", "ARENA DE SAO PAULO", "78' VERTONGHEN" + "\n", "",
//                24,11,46);
//
//        ListaPartidos.Insertar("ARGELIA",1, "RUSIA",1, " 26 JUNIO",
//                "17:00", "ARENA DA BAIXADA", "6' KOKORIN" + "\n", "60' SLIMANI",
//                23,6,57);
//
//        ListaPartidos.Insertar("BRASIL",1, "CHILE",1, " 28 JUNIO",
//                "17:00", "ESTADIO MINEIRAO", "32' ALEXIS" + "\n", "18' LUIZ",
//                26,6,45);
//
//        ListaPartidos.Insertar("COLOMBIA",2, "URUGUAY",0, " 28 JUNIO",
//                "17:00", "ESTADIO MARACANA", "" + "\n", "28', 50' JAMES",26,
//                15,74);
////
//        ListaPartidos.Insertar("PAISES BAJOS",2, "MEXICO",1, " 29 JUNIO",
//                "13:00", "ESTADIO CASTELAO", "48' DOS SANTOS" + "\n", "88' SNEIJDER "
//                + "90'+4 GP HUNTELAAR",32,21,68);
//
//        ListaPartidos.Insertar("COSTA RICA",1, "GRECIA",1, " 29 JUNIO",
//                "17:00", "ARENA PERNAMBUCO", "90'+1' SOKRATIS" + "\n",
//                "52' RUIZ",28,14,73);
//
//        ListaPartidos.Insertar("FRANCIA",1, "NIGERIA",0, " 30 JUNIO",
//                "13:00", "ESTADIO NACIONAL BRASILIA", "" + "\n", "90'+2 GPM' YOBO"
//                + "79' POGBA",27,11,33);
//
//        ListaPartidos.Insertar("ALEMANIA",1, "ARGELIA",0, " 30 JUNIO",
//                "17:00", "ESTADIO BEIRA-RIO", "120'+1' DJABOU" + "\n", "92' SCHUERRLE"
//                + "120' ÖZIL",14,21,93);
//
//        ListaPartidos.Insertar("ARGENTINA",1, "SUIZA",0, " 1 JULIO",
//                "13:00", "ARENA DE SAO PAULO", "" + "\n", "118' DI MARIA",
//                23,11,30);
//
//        ListaPartidos.Insertar("BELGICA",2, "EEUU",1, " 1 JULIO",
//                "17:00", "ARENA FONTE NOVA", "107' GREEN" + "\n", "105' LUKAKU"
//                + "93' BRUYNE",26,10,82);
//
//        ListaPartidos.Insertar("FRANCIA",0, "ALEMANIA",1, " 4 JULIO",
//                "13:00", "ESTADIO MARACANA", "13' HUMMELS" + "\n", "",26,8,88);
//
//        ListaPartidos.Insertar("BRASIL",2, "COLOMBIA",1, " 4 JULIO",
//                "17:00", "ESTADIO CASTELAO", "80' GP' JAMES" + "\n", "7' SILVA"
//                + "69' LUIZ",29,21,51);
//
//        ListaPartidos.Insertar("ARGENTINA",1, "BELGICA",0, " 5 JULIO",
//                "13:00", "ESTADIO NACIONAL BRASILIA", "" + "\n", "8' HIGUAIN"
//                ,26,21,34);
//
//        ListaPartidos.Insertar("PAISES BAJOS",0, "COSTA RICA",0, " 5 JULIO",
//                "17:00", "ARENA FONTE NOVA", "" + "\n", "",26,11,81);
//
//        ListaPartidos.Insertar("BRASIL",1, "ALEMANIA",7, " 8 JULIO",
//                "17:00", "ESTADIO NIMEIRAO", "24', 26' KROOS" + "23' KLOSE"
//                + "11' MULLER" + "69', 79' SCHURRLE" + "29' KHEDIRA" + "\n",
//                "90' OSCAR",22,7,51);
//
//        ListaPartidos.Insertar("PAISES BAJOS",0, "ARGENTINA",0, " 9 JULIO",
//                "17:00", "ARENA DE SAO PAULO", "" + "\n", "",15,10,79);
//
//        ListaPartidos.Insertar("BRASIL",0, "PAISES BAJOS",4, " 12 JULIO",
//                "17:00", "ESTADIO NACIONAL BRASILIA", "17' BLIND" + "69', 79' PERSIE"
//                + "90'+1 WIJNALDUM" + "\n", "",26,19,50);

//        ListaPartidos.Insertar("ALEMANIA",1, "ARGENTINA",0, " 13 JULIO",
//                "16:00", "ESTADIO MARACANA", " " + "\n", "113'GOTZE ",23,12,65);
        calendario.Insertar(Partido);
        calendario.Insertar(Partido1);
        calendario.Insertar(Partido2);
        calendario.Insertar(Partido3);
        calendario.Insertar(Partido4);
        calendario.Insertar(Partido5);
        calendario.Insertar(Partido6);
        calendario.Insertar(Partido7);
        calendario.Insertar(Partido8);
        calendario.Insertar(Partido9);
        
        return calendario;
    }

}
