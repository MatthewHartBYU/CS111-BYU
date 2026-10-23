/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7boom;

/**
 *
 * @author Matthew
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {11, 881, 50, 6, 5, 716511}; 
        System.out.println("Array contains a number with the value 7: " + checkNums(nums));
    }

    public static boolean checkNums(int[] nums) {
        for (int num : nums) {
            while (num > 0) {  
                if (num % 10 == 7) {
                    return true;
                }
                num /= 10;
            }
        }
        return false;
    }

}
