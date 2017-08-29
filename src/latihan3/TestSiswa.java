/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author rismaiw
 */
public class TestSiswa {
    public static void main (String args[]){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Risma Intan Wulandari");
        siswa.setAbsen(34);
        siswa.setAddress("Jalan Danau Laut Tawar ");
        
        System.out.println("Name : "+ siswa.getName() + "\nAbsen : " + siswa.getAbsen() + "\nAddress : "+ siswa.getAddress());
    }
}
