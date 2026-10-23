/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class IfInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int daNums[] = {4,3,2,1,4,5,6,1,1,2,3,22,23322};
        int checkNum = 1;
        checkNum(daNums, checkNum);
    }
    public static void checkNum(int numbers[], int checkValue){
        int numTimes = 0;
        for(int num: numbers){
            if(num == checkValue){
                numTimes++;
            }
        }
        System.out.println("The number " + checkValue + " appears " + numTimes + " times in the array!");
    }
    
}
