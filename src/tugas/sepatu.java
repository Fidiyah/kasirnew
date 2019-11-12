/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author WINDOWS 10
 */

public class sepatu {
    String merk;
    String warna;
    String jenis;
    String kategori;
    
    
    public void merk(String merk){
        System.out.println("Merk sepatu : \n1.Adidas \n2.Nike \n3.Skechers \n4.puma \n5.reebok \n6.Vans \n7.Converse \n8.Fila \n9.910");
        this.merk = merk;
    }
    public void warna(String warna){
        System.out.println("Warna : \nblack \nwhite \ngold \nsliver \norange \ngreen \nyellow \nblue \nred");
        this.warna = warna;
    }
    public void jenis(String jenis){
        System.out.println("Jenis : \t1.cowok \t2.cewek");
        this.jenis = jenis;
    }
    public void kategori(String kategori ){
        System.out.println("Kategori : \n1.olahraga \n2.lari \n3.santai \n4.kantoran");
    }
    
}
