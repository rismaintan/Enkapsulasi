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
public class bus {
    public int penumpang ;
        public int maxpenumpang;
       
        public bus(int maxpenumpang){
            this.maxpenumpang = maxpenumpang;
            penumpang = 0;
        }
        //method mutator
        public void addpenumpang(int penumpang){
            int temp;
            temp = this.penumpang+penumpang;
            if(temp> maxpenumpang){
                System.out.println("Penumpang melebihi kuota");
            }else{
                this.penumpang=temp;
            }
        }
        public void getpenumpang(int password){
            if(password==24){
                System.out.println("password benar");
            }
            else{
                System.out.println("password salah");
            }
        }
        public void getAverage(double penumpang){
            double berat;
            berat =this.penumpang+penumpang;
            if(berat>maxpenumpang){
                System.out.println("Berat rata rata     :   "+berat);
            }
        }
        public void cetakpenumpang()
        {
            System.out.println("penumpang bus sekarang = "+penumpang);
            System.out.println("maksimun penumpang yang seharusnya "+maxpenumpang);
        }
}
