/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.boom;

/**
 *
 * @author Matthew
 */
public class Boom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {17,15,1025,100};
        hasSeven(nums);
    }
    public static void hasSeven(int[] nums){
        for(int num: nums){
           while(num > 0){
            if(num % 7 == 0){
                System.out.println("Array contains a value with the number 7.");
            }
            num /= 10; 
          }  
        }
        System.out.println("Array does not contain an values with the number 7.");
    }
    
}
