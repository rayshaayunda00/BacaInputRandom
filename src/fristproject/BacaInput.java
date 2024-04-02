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
public class BacaInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "";
        boolean gameover = true ;
        int score = 11;
        int highScore = 10;
        Scanner reader = new Scanner(System.in);
        if (gameover && score>highScore){
            System.out.println("please insert your name");
            name=reader.next();
        }
        System.out.println("Thank You" +name+ ",");
    }
    
}
