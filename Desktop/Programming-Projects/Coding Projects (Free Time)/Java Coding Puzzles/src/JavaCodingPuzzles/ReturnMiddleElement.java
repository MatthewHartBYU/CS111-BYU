/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class ReturnMiddleElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The program you are about to witness will do the following things:");
        System.out.println("First, this program, will fill an array with random numbers");
        System.out.println("Then, it will find the middle element and display it. If there is an even number of numbers, it will sum the two middle ones and divide by two");
        createArray();
    }
    public static void createArray(){
        int min = 1;
        int max = 10;
        int[] nums = new int[(int)(Math.random() * (max-min) + min)];
        while(nums.length < 3){
            nums = new int[(int)(Math.random() * (max-min) + min)];
        }
        for(int i = 0; i<nums.length; i++){
            int randomNum = (int)(Math.random() * (max-min) + min);
            nums[i] = randomNum;           
        }
        System.out.println("Random Array Generated:");
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
        //Now we will find the middle number
        if(nums.length%2 == 1){
            System.out.println("Middle value is: " + nums[nums.length/2]);
        }
        else{
            System.out.println("Middle value is: " + ((double)nums[nums.length/2] + nums[nums.length/2 -(1)])/2);
        }
    }
    
}
