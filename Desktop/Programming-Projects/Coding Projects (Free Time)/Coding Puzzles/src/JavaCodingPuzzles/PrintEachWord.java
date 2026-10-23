/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class PrintEachWord { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence = "I am programming right now!"; 
        printWords(sentence);
    }
    public static void printWords(String sentence){
        sentence += " ";
        int indexSpace = sentence.indexOf(" "); 
        String resultString = "";
        String curWord = ""; 
        int cursor = 0;  
        while(indexSpace != -1){   
            curWord = sentence.substring(cursor, indexSpace);
            System.out.println(curWord);
            resultString += curWord + " ";      
            cursor = indexSpace + 1; 
            indexSpace = sentence.indexOf(" ", cursor);
        }
    } 
    
}
