/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbopertemuan3;

/**
 *
 * @author Administrator
 */
public class Complex {
    double real;
double imag;
 public Complex(double real, double imag) {
 this.real = real;//inisialisasi bilangan real
 this.imag = imag;//inisialisasi bilangan imajiner
 } 
 public static Complex add(Complex n1, Complex n2)
    {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = n1.real + n2.real;//menjumlahkan bilangan real n1,n2
        temp.imag = n1.imag + n2.imag;//menjumlahkan bilangan imajiner n1,n2

        return(temp);
    }


    
}
