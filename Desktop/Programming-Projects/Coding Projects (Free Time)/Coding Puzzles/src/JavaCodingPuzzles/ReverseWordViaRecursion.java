/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class ReverseWordViaRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word = "Cowabunga goes moo and more moo!";
        System.out.println(reverseWord(word));
    }
    public static String reverseWord(String word){
        if(word.equals("")){
            return word;
        }
        return reverseWord(word.substring(1)) + word.charAt(0);
    }
    
}
