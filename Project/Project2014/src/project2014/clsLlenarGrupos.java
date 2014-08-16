/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2014;

import Listas.Equipos;
import Listas.Grupos;

/**
 *
 * @author Jose E & Alvaro
 */
public class clsLlenarGrupos {

    //Se insertan los partidos
    public Grupos LlenarGrupo(Grupos grupoX) {
        //Si se quiere ver solo los equipos de algún grupo
        
        Equipos EquiposA = new Equipos();
        EquiposA.InsertarEnGrupo("BRASIL", 3,2,1,0,7,2,5,7);
        EquiposA.InsertarEnGrupo("MEXICO",3,2,1,0,4,1,3,7 );
        EquiposA.InsertarEnGrupo("CROACIA",3,1,0,2,6,6,0,3 );
        EquiposA.InsertarEnGrupo("CAMERUN",3,0,0,3,1,9,-8,0);

        Equipos EquiposB = new Equipos();
        EquiposB.InsertarEnGrupo("AUSTRALIA",3,0,0,3,3,9,-6,0);
        EquiposB.InsertarEnGrupo("CHILE",3,2,0,1,5,3,2,6);
        EquiposB.InsertarEnGrupo("ESPAÑA",3,1,0,2,4,7,-3,3);
        EquiposB.InsertarEnGrupo("PAISES BAJOS",3,3,0,0,10,3,7,9);

        Equipos EquiposC = new Equipos();
        EquiposC.InsertarEnGrupo("COSTA DE MARFIL",3,1,0,2,4,5,-1,3);
        EquiposC.InsertarEnGrupo("COLOMBIA",3,3,0,0,9,2,7,9);
        EquiposC.InsertarEnGrupo("GRECIA",3,1,1,1,2,4,-2,4);
        EquiposC.InsertarEnGrupo("JAPON",3,0,1,2,2,6,-4,1);
        

        Equipos EquiposD = new Equipos();
        EquiposD.InsertarEnGrupo("COSTA RICA",3,2,1,0,4,1,3,7);
        EquiposD.InsertarEnGrupo("URUGUAY",3,2,0,1,4,4,0,6);
        EquiposD.InsertarEnGrupo("INGLATERRA",3,0,1,2,2,4,-2,1);
        EquiposD.InsertarEnGrupo("ITALIA",3,1,0,2,2,3,-1,3);

        Equipos EquiposE = new Equipos();
        EquiposE.InsertarEnGrupo("FRANCIA",3,2,1,0,8,2,6,7);
        EquiposE.InsertarEnGrupo("ECUADOR",3,1,1,1,3,3,0,4);
        EquiposE.InsertarEnGrupo("SUIZA",3,2,0,1,7,6,1,6);
        EquiposE.InsertarEnGrupo("HONDURAS",3,0,0,3,1,8,-7,0);

        Equipos EquiposF = new Equipos();
        EquiposF.InsertarEnGrupo("ARGENTINA",3,3,0,0,6,3,3,9);
        EquiposF.InsertarEnGrupo("BOSNIA Y HERZEGOVINA",3,1,0,2,4,4,0,3);
        EquiposF.InsertarEnGrupo("NIGERIA",3,1,1,1,3,3,0,4);
        EquiposF.InsertarEnGrupo("IRAN",3,0,1,2,1,4,-3,1);

        Equipos EquiposG = new Equipos();
        EquiposG.InsertarEnGrupo("ALEMANIA",3,2,1,0,7,2,5,7);
        EquiposG.InsertarEnGrupo("ESTADOS UNIDOS",3,1,1,1,4,4,0,4);
        EquiposG.InsertarEnGrupo("GHANA",3,0,1,2,4,6,-2,1);
        EquiposG.InsertarEnGrupo("PORTUGAL",3,1,1,1,4,7,-3,4);

        Equipos EquiposH = new Equipos();
        EquiposH.InsertarEnGrupo("BELGICA",3,3,0,0,4,1,3,9);
        EquiposH.InsertarEnGrupo("ARGELIA",3,1,1,1,6,5,1,4);
        EquiposH.InsertarEnGrupo("RUSIA",3,0,2,1,2,3,-1,2);
        EquiposH.InsertarEnGrupo("REPUBLICA DE COREA",3,0,1,2,3,6,-3,1);
        
        grupoX.Crear("A", EquiposA);
        grupoX.Crear("B", EquiposB);
        grupoX.Crear("C", EquiposC);
        grupoX.Crear("D", EquiposD);
        grupoX.Crear("E", EquiposE);
        grupoX.Crear("F", EquiposF);
        grupoX.Crear("G", EquiposG);
        grupoX.Crear("H", EquiposH);

        
        return grupoX;
    }

}
