/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class RomanNumeralCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String phrase = "XVII";
        System.out.println(returnNumeral(phrase));
    }
    public static String returnNumeral(String phrase){
        int sumDigits = 0;
        for(int i = 0; i<phrase.length(); i++){
            if(phrase.charAt(i) == 'I'){
                sumDigits += 1;
            }
            if(phrase.charAt(i) == 'V'){
                sumDigits += 5;
            }
            if(phrase.charAt(i) == 'X'){
               sumDigits += 10; 
            }
        }
        return  phrase + " - " + String.valueOf(sumDigits); 
    }
    
}
