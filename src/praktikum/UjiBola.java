/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author rismaiw
 */
public class UjiBola {
    public static void main(String[]args){
        bola Bola= new bola();
        Bola.showdiameter();
        Bola.showluaspermukaan();
        Bola.showvolume();
        
        Bola.setjarijari(7);
        Bola.showdiameter();
        Bola.showluaspermukaan();
        Bola.showvolume();
    }
}
