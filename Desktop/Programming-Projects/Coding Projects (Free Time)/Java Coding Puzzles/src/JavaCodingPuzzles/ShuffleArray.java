/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class ShuffleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Shuffler Puzzle. Today, we will generate an array, and then shuffle it:");
        fillArray();
    }

    public static void fillArray() {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 11);
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        shuffleArray(nums);
    }

    public static void shuffleArray(int[] nums) {
        System.out.println("Now, we will shuffle the array and display it below:");
        for (int i = 0; i < nums.length; i++) {
            int randomNum = (int) (Math.random() * nums.length);
            int randomElement = nums[randomNum];
            nums[randomNum] = nums[i];
            nums[i] = randomElement;
        }
        System.out.println("Array has now been shuffled:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();       
    }

}
