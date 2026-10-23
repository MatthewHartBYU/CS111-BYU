/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class DoesItFallBetween {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the number generator");
        System.out.println("I will generate a random number between 1 and 100");
        System.out.println("You will enter two numbers: a high and a low range and I will display my random numbers that fall between the range.");
        System.out.println("Enter the low range:");
        int lowRange = keyboard.nextInt(); 
        System.out.println("Enter the high range:");
        int highRange = keyboard.nextInt();
        System.out.println("Random numbers generated that fall in the range:");
        for(int i = lowRange; i<= highRange; i++){
            int num = (int)(Math.random() * 100) + 1;
            if(num >= lowRange && num <= highRange){
                System.out.print(num + " ");
            }
        }
        System.out.println();
        
    }
    
}
