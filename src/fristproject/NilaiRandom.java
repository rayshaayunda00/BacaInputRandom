/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fristproject;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NilaiRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arisan keluar hari ini"+ Math.random());
        double x = 10.73;
        int y = (int)x;
        System.out.println("Nilai Y"+ y);
        double luasLingkaran,r;
        Scanner read = new Scanner(System.in);
        System.out.println("Masukkan jari-jari lingkuran");
        r = read.nextDouble();
        luasLingkaran = Math.PI*r*r;
        System.out.println("Luas Lingkaran adalah"+ luasLingkaran);
        double answer = Math.sqrt(625);
        System.out.println("Akar 625 ="+answer);
    }
    
}
