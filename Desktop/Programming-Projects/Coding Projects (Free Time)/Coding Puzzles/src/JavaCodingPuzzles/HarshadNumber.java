/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class HarshadNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A number is said to be Harshad if it's exactly divisible by the sum of its digits. 
        //Create a function that determines whether a number is a Harshad or not.
        int num = 156;
        int sumDigits = sumDigits(num);
        System.out.println(isHarshad(num, sumDigits));
        
    }
    public static int sumDigits(int num){
        int sum = num % 10;
        if(num <= 0){
            return 0;
        }
        else{
            return sum + sumDigits(num/10);
        }
    }
    public static boolean isHarshad(int num, int sumDigits){
        return num % sumDigits == 0;
    }
    
}
