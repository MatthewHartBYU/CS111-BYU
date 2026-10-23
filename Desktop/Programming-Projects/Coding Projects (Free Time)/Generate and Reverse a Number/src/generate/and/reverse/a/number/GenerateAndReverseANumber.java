/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generate.and.reverse.a.number;

/**
 *
 * @author Matthew
 */
public class GenerateAndReverseANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 901) + 100;
        System.out.println("Random Number generated: " + randomNum);
        int reversedNum = 0;
        while(randomNum != 0){
            int digit = randomNum % 10;
            reversedNum =  reversedNum * 10 + digit;
            randomNum /= 10;
        }
        System.out.println("Random Number genereated reversed: " + reversedNum);
    }
    
}
