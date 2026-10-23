/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverse.an.array;

/**
 *
 * @author Matthew
 */
public class ReverseAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[nums.length-1-i];
        }
        for(int curNum: nums){
            System.out.println(curNum);
        }
    }
    
}
