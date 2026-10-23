/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class FindMiddleLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //find the middle letter(s) of a word
        System.out.println(findMiddleLetter("computer!")); 
    }
    public static String findMiddleLetter(String word){
        if(word.length() % 2 != 0){
            return word.charAt((word.length() / 2)) + "";
        }
        else{
           return word.charAt((word.length() / 2) - 1) + "" + word.charAt((word.length() / 2));
        }
    }
    
}
