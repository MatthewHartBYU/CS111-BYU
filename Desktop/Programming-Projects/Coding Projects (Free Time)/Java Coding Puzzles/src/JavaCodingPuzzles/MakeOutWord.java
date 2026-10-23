/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class MakeOutWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String characters = "<<>>";
        String word = "dog";
        System.out.println(makeOut(characters,word));
    }
    public static String makeOut(String characters, String word){
        return characters.substring(0,2) + word +  characters.substring(word.length()-1, word.length()+1);
    }
    
}
