/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrays;

/**
 *Problema 2:
 * Definir un vector de 5 componentes de tipo float que representen las alturas 
 * de 5 personas.Obtener el promedio de las mismas. Contar cuántas personas 
 * son más altas que el promedio y cuántas más bajas.

 * @author Jose E
 */
public class clsEx2A {
    private float alturas[]=new float[5];
    
    public void AgregarAltura(float altura){
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i]==0){
            alturas[i]=altura;
            break;}
            
        }}
    public float Promedio(){
    float sumpromedio=0, promedio;
        for (int i = 0; i <alturas.length; i++) {
            sumpromedio+=alturas[i];
            }
        promedio=sumpromedio/alturas.length;
        return promedio;
}
    public String ContarPersonas(){
        String retorno="";
        String personasBajas="";
        String personasAltas="";
        float promedio=this.Promedio();
        
        for (int i = 0; i < alturas.length; i++) {
            if(alturas[i]>promedio){
            personasAltas+="La persona #"+(i+1)+" es alta"+"\n";
            }else{
            personasBajas+="La persona #"+(i+1)+" es baja"+"\n";
            }
            
        }retorno=personasAltas+"\n"+personasBajas;
        return retorno;
    }
}
