/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odd.and.even.checkeer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class OddAndEvenChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Number> nums = new ArrayList<Number>();
        System.out.println("Welcome to the odd/even number checker!");
        System.out.println("Enter the lower limit:");
        int lowerLimit = keyboard.nextInt();
        System.out.println("Enter the upper limit:");
        int upperLimit = keyboard.nextInt();
        //populate arraylist of number objects
        for(int i = lowerLimit; i<=upperLimit; i++){
            nums.add(new Number(i));
        }
        int numEvens = 0;
        int numOdds = 0;
        System.out.println();
        System.out.println("Even numbers between " + lowerLimit + " and " + upperLimit + ":");
        for(int i = 0; i<nums.size()-1; i++){
            if(nums.get(i).isEven()){
               System.out.print(nums.get(i).getValue() + " ");
               numEvens++;
            }
        }
        System.out.println();
        System.out.println("Number of even values: " + numEvens);
        System.out.println();
        
         System.out.println("Odd numbers between " + lowerLimit + " and " + upperLimit + ":");
        for(int i = 0; i<nums.size()-1; i++){
            if(!nums.get(i).isEven()){
               System.out.print(nums.get(i).getValue() + " ");
               numOdds++;
            } 
        }
        System.out.println();
        System.out.println("Number of odd values: " + numOdds);
        System.out.println();
        
    }
    
}
