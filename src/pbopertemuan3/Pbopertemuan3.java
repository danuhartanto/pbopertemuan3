/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbopertemuan3;

import static pbopertemuan3.Complex.add;//untuk memanggil method library Cmplex(public static Complex add(Complex n1, Complex n2))

/**
 *
 * @author Administrator
 */
public class Pbopertemuan3 {public static void main(String[] args) {
 Complex n1 = new Complex(2.3, 4.5),
                n2 = new Complex(3.4, 5.0),
                temp;

 temp = add(n1, n2);//penampung-->untuk menjumlahkan bilangan real dan emajiner dari bilangan complex n1 dan n2

        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
        System.out.println();

 
 // membuat objek dari class Waktu
 Waktu mulai = new Waktu(8, 12, 15);//merupakan code untuk memanggil dari class library waktu (jam,menit,detik)
 Waktu selesai = new Waktu(12, 34, 55);
 Waktu selisih;
 // memanggil method perbedaan
 selisih = perbedaan(mulai, selesai);
 System.out.printf("Selisih Waktu: %d:%d:%d - ", mulai.jam, mulai.menit,
mulai.detik);
 System.out.printf("%d:%d:%d ", selesai.jam, selesai.menit, selisih.detik);
 System.out.printf("= %d:%d:%d\n", selisih.jam, selisih.menit, selisih.detik);
 }
 public static Waktu perbedaan(Waktu mulai, Waktu selesai)
 {
 Waktu selisih = new Waktu(0, 0, 0);
 // jika detik mulai lebih besar
 // konversi menit selesai ke dalam detik
 // dan tambahkan detik ke detik selesai
 if(mulai.detik > selesai.detik){
 --selesai.menit;
 selesai.detik += 60;
 }
 selisih.detik = selesai.detik - mulai.detik;
 // jika menit mulai lebih besar
 // konversi jam selesai ke dalam menit
 // kemudian tambahkan ke dalam menit selesai
 if(mulai.menit > selesai.menit){
 --selesai.jam;
 selesai.menit += 60;
 }
 selisih.menit = selesai.menit - mulai.menit;
 selisih.jam = selesai.jam - mulai.jam;
 // return the difference time
 return(selisih);
 
  
 
 } 
    
}
