/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg7;

/**
 *
 * @author Jose E
 */
public class clsEj1 {
    private String email;

    public clsEj1(String pEmail) {
        this.email = pEmail;
    }
    public String Validacorreo(){
    String mensaje="El correo no contiene @";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@'){
            mensaje="El correo si contiene @";}
            
        }return mensaje;
    }
    
    
}
