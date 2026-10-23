/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class DaysInAMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getDays();
    }
    public static void getDays(){
        int randomMonth = (int)(Math.random() * 12) + 1;
        int numDays = 0; 
        if(randomMonth == 2){
            numDays = 28; 
        }
        else if(randomMonth % 2 == 0 || randomMonth == 7){
           numDays = 31; 
        }
        else{
            numDays = 30;
        }
        System.out.println("Month number " + randomMonth + " has " + numDays + " days!");
    }
    
}
