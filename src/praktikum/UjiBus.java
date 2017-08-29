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
public class UjiBus {
    public static void main(String[] args)
    {bus Bus = new bus(5);
    
    Bus.getpenumpang(24);
    Bus.addpenumpang(1);
    Bus.cetakpenumpang();
    Bus.getAverage(50);
    //penambahan penumpang
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
    Bus.getAverage(60);
    //penambahan penumpang
    Bus.addpenumpang(1);
    Bus.cetakpenumpang();
    Bus.getAverage(40);
    //penambahan penummpang 2 orang
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
    //penambahan penumpang
    Bus.addpenumpang(2);
    Bus.cetakpenumpang();
        
    }
}
