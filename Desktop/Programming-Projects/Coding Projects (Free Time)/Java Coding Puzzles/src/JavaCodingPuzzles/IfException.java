/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class IfException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[] = new int[10];
        System.out.println("Original List Generated");
        fillArray(nums);
        ifException(nums, 9);
        
    }
    public static void fillArray(int nums[]){
        for(int i = 0; i< nums.length; i++){
           nums[i] = (int)(Math.random() * (9) + 1);  
        }
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void ifException(int nums[], int checkNum){
        System.out.println("The way this program works is it checks how many times a target value occurs in the array, if it is include 2 times, it needs to be changed to a new number");
        int numOcc = 0;
        for(int num: nums){
            if(num == checkNum){
                numOcc++;
            }
        }
        if(numOcc  == 2){
           for(int i = 0; i< nums.length; i++){
             if(nums[i] == checkNum){
                 nums[i] = (int)(Math.random() * (9) + 1); 
                 System.out.println(checkNum + " appeared at index " + i);
             }
           }
           System.out.println("We hit an exception! The number " + checkNum + " appeared " + numOcc + " times in the array. Time to change the values with a little big of magic");
        }
        for(int num: nums){
            System.out.print(num + " ");
                    
        }
        System.out.println();
        
    }
}
