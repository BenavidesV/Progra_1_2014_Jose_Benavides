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
public class clsEx4 {
    int mes, anno;
    boolean b=true;

    public clsEx4(int mes, int anno) {
        this.mes = mes;
        this.anno = anno;
    }
    public boolean bis(){
    if ((anno%4==0)&&(anno%100!=0)){
        if (anno%400==0){
            b=false;
        }else{
        b=true;}
    }return b;}
    
}
