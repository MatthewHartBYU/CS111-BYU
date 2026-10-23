/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class Shuffle2DArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[][] = new int[5][5];
        System.out.println("Original Array:");
        fillArray(nums);
    }
    public static void fillArray(int nums[][]){
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
               nums[i][j] = (int)(Math.random() * 10);
            }
        }
       printArray(nums);
       shuffleArray(nums);
    }
    public static void shuffleArray(int nums[][]){
      for (int i = nums.length - 1; i > 0; i--) {
        for (int j = nums[i].length - 1; j > 0; j--) {
            int m = (int)(Math.random() * (i + 1));
            int n = (int)(Math.random() * (j + 1));
            int temp = nums[i][j];
            nums[i][j] = nums[m][n];
            nums[m][n] = temp;
        }
      }
      System.out.println("Original Array Shuffled:");
      printArray(nums);
    }
    public static void printArray(int[][] nums){
         for(int[] row: nums){
            for(int element: row){
                System.out.print(element + " ");                      
            }
            System.out.println();
        }
    }
    
}
