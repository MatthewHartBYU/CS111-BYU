/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class ShuffleException {

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
               if( i == 0 || j == 0 || i == nums.length-1 || j == nums.length-1){
                   nums[i][j] = 0;
               }
               else{
                    nums[i][j] = (int)(Math.random() * 9) + 1;

               }
            }
        }
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
