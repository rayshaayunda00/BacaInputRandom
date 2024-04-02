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
public class PersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double panjang,lebar,luas;
        Scanner  reader = new Scanner(System.in);
        System.out.print("Masukkan Panjang");
        panjang = reader.nextDouble();
        System.out.print("Masukkan Lebar");
        lebar = reader.nextDouble();
        luas = panjang * lebar;
        System.out.println("Luas ="+luas);
    }
    
}
