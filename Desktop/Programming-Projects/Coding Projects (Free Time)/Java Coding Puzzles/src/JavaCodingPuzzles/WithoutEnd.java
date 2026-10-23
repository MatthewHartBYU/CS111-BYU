/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class WithoutEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String word = "Hello";
         System.out.println(removeEnds(word));
    }
    public static String removeEnds(String word){
        return word.substring(1,word.length()-1);
    }
    
}
