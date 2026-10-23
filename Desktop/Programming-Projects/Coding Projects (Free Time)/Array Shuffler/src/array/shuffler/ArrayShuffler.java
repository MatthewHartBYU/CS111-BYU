/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.shuffler;

/**
 *
 * @author Matthew
 */
public class ArrayShuffler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        printArray(shuffleArray(nums)); 
    }
    public static int[] shuffleArray(int[] array){
        for(int i = array.length-1; i>0; i--){
           int j = (int)Math.floor(Math.random() * (i + 1));
           int temp = array[i];
           array[i] = array[j];
           array[j] = temp;
        }
        return array;
    }
    public static void printArray(int[] nums){
        System.out.println("Array shuffled:");
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
