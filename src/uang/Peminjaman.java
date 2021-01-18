
package uang;

import java.util.Scanner;

public class Peminjaman {
    
    //variabel
    Scanner input = new Scanner (System.in);
    int lama;
    double hutang,bunga1,bunga,angsur,sisa,sisa1;
    double angsur1,total=0,totbunga,bayar,noregist;
    String nama,umur,tinggal;
    
    //method void untuk memulai program
    void awalan(){
     System.out.println("     ---  PROGRAM PEMINJAMAN UANG ---       ");
     System.out.println("===================================================");
    }
    
    //method void untuk memproses data program
    void isi(){
     System.out.println("Atas Nama              : ");nama=input.nextLine();
     System.out.println("Domisili               : ");tinggal=input.nextLine();
     System.out.println("No.Registrasi          : ");noregist=input.nextInt();
     System.out.print("Besar Pinjaman (Angka)   = ");hutang=input.nextDouble();
     System.out.print("Lama Angsuran (bulan)    = ");lama=input.nextInt();
     System.out.println("");
    }
   
    //method void untuk menghitung peminjaman uang
    void hitung(){
        for(int a=1;a<=lama;a++){
           angsur=hutang/lama;
           sisa=hutang-angsur*a;
           bunga=hutang/(sisa+angsur);
           bunga1=bunga*10/100*hutang; 
           bayar=bunga1+angsur;
           total+=bayar;
           
            System.out.println("Bulan ke - "+a);
            System.out.println("----------------------------");
            System.out.printf("Suku bunga     = %.2f",bunga);
            System.out.println(" persen");
            System.out.printf("Besar bunga    = %.2f",bunga1);
            System.out.println(" Rupiah");
            System.out.printf("Bayar          = %.2f",bayar);
            System.out.println(" Rupiah");
            System.out.printf("Sisa Pinjaman  = %.2f",sisa);
            System.out.println(" Rupiah");
            System.out.println("----------------------------");
        }
    }
        
    //method void untuk menampilkan hasil
    void hasil(){
    System.out.println("=============================================================================");
    System.out.println("Pinjaman awal   = "+hutang+" Rupiah");
    System.out.printf ("Total Pengembalian (pinjaman awa1+bunga dari bulan  1 - "+lama+" = %.2f",total);
    System.out.println(" Rupiah");
    System.out.println("--------------------------------");
    }
    
}
