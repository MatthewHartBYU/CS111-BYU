/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class SumArrayViaRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[] = {1,2,3,4,5}; 
        System.out.println(sumArray(nums, nums.length));
    }
    public static int sumArray(int[] nums, int curPos){
        if(curPos <= 0){
            return 0;
        }
        else{
            return sumArray(nums, curPos-1) + nums[curPos-1];
        }
    }
    
}
