/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = ReverseString("Cougar");
    }
    public static String ReverseString(String word){
       for(int i = word.length()-1; i>=0; i--){
           System.out.print(word.charAt(i));
       }
       System.out.println();
       return word; 
    }
    
}
