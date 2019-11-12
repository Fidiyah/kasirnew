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
import java.util.Scanner;


   
public class kasir {

    
    public static void main(String[] args) {
        int pilihan;
        int pilih;
        int cari;
        int carikan;
        
        
        identitasSepatu kasir = new identitasSepatu();
        Scanner bagus = new Scanner(System.in);
         Scanner gaes = new Scanner(System.in);
          Scanner waw = new Scanner(System.in);
           Scanner mahal = new Scanner(System.in);
           
         
        System.out.println("====SELAMAT DATANG DI TOKO JAYABARU====");
        System.out.println("Silahkan mengisi pilihan dibawah ini , agar kami dapat membantu anda");
        kasir.merk("");
        System.out.print("Masukkan pilihan anda : ");
        pilihan = bagus.nextInt();
        kasir.ukuran(0);
        System.out.print("Masukkan pilihan anda :");
        pilih =gaes.nextInt();
        kasir.jenis("");
         System.out.print("Masukkan pilihan anda :");
         cari = waw.nextInt();
        kasir.kategori("");
        System.out.print("Masukkan pilihan anda :");
         carikan = mahal.nextInt();
         
         
         
         System.out.println("======RINCIAN PEMBELIAN=====");
         System.out.println("\tkasir : FDY");
         
        
         
        if(pilihan == 1 ){
            System.out.println("Merk : Adidas");
            System.out.println("Rp 300.000,00");
            }else if(pilihan == 2){
            System.out.println("Merk : Nike");
            System.out.println("Rp 350.000,00");
           }else if(pilihan == 3){
            System.out.println("Merk : Skechers");
            System.out.println("Rp 450.000,00");
            }else if(pilihan == 4){
            System.out.println("Merk : Puma");
            System.out.println("Rp 450.000,00");
            }else if(pilihan == 5){
            System.out.println("Merk : reebok");
            System.out.println("Rp 500.000,00");
             }else if(pilihan == 6){
            System.out.println("Merk : vans");
            System.out.println("Rp 550.000,00");
             }else if(pilihan == 7){
                 System.out.println("Merk : converse");
                 System.out.println("Rp 600.000,00");
             }else if(pilihan == 8){
                 System.out.println("Merk : fila");
                 System.out.println("Rp 650.000,00");
             }else if(pilihan == 9){
                 System.out.println("Merk : 910");
                 System.out.println("Rp 700.000,00");
             
            
               
    }
        if(pilih == 25){
            System.out.println("Size : 25");
        }else if(pilih == 26){
            System.out.println("Size : 26");
        }else if(pilih == 27){
            System.out.println("Size : 27");
        }else if(pilih == 28){
            System.out.println("Size : 28");
        }else if(pilih == 29){
            System.out.println("Size : 29");
        }else if(pilih == 30){
            System.out.println("Size : 30");
        }else if(pilih == 31){
            System.out.println("Size : 31");
        }else if(pilih == 32){
            System.out.println("Size : 32");
        }else if(pilih == 33){
            System.out.println("Size : 33");
        }else if(pilih == 34){
            System.out.println("Size : 34");
        
        }
        
        if(cari == 1){
            System.out.println("Jenis : cowok");
        }else if(cari == 2){
        System.out.println("Jenis : cewek");
         
        }
        
        if(carikan == 1){
            System.out.println("Kategori : olahraga");
        }else if(carikan == 2){
            System.out.println("Kategori : lari ");
        }else if(carikan == 3){
            System.out.println("Kategori : santai");
        }else if(carikan == 4){
            System.out.println("Kategori : kantoran");
        }
   
    
    
        
        System.out.println("======SELAMAT DATANG KEMBALI=====");
        
           
        
}
}




