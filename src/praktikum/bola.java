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
public class bola {
    private double jarijari;
    public void bola(){
        }
     public void setjarijari(double jari){
            this.jarijari=jari;
            System.out.println("Jari Jarinya    :"+jarijari );
    
    }
     public void showdiameter(){
         double diameter;
         diameter=2*jarijari;
         System.out.println("Diameternya adalah : "+diameter);
         
     }
     public void showluaspermukaan(){
         double lp;
         lp=4*Math.PI*jarijari*jarijari;
         System.out.println("Luas permukaan : "+lp);
     }
     public void showvolume(){
         double volume;
         volume=(4/3)*Math.PI*jarijari*jarijari;
         System.out.println("Volume : "+volume);
     }
    
}
