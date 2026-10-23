/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java.edabit.coding.puzzles;

/**
 *
 * @author Matthew
 */
public class WarOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.
        int nums[] = {12,90,75};
        System.out.println(warOfNumbers(nums));
        
    }
    public static int warOfNumbers(int[] nums){
        int sumOdds = 0;
        int sumEvens = 0;
        for(int num: nums){
            if(num % 2 == 0){
                sumEvens += num;
            }
            else{
                sumOdds += num;
            }
        }
        if(sumOdds > sumEvens){
            return sumOdds - sumEvens;
        }
        else{
            return sumEvens - sumOdds;
        }
    }
    
}
