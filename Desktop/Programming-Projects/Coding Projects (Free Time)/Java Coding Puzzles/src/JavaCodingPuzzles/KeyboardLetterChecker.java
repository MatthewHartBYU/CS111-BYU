/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matth
 */
public class KeyboardLetterChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);   
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter Some Words, and I will count how many start with the same letter. Type blank to stop.");
        String input = keyboard.nextLine();
        String phrase = "";
        while(!input.equals(" ")){
            phrase += input + " ";
           input = keyboard.nextLine();   
        }
        String[] array = phrase.split("\\s+");
        System.out.println("Words you Entered:");
        int numWords = 0;
        for(String word: array){
            if(word.substring(0,1).equalsIgnoreCase("L")){
                numWords++;
            }
            System.out.println(word);
        }
        if(numWords == 1){
            System.out.println("Numbers of words that start with L is " + numWords + " word");
        }else{
           System.out.println("Numbers of words that start with L is " + numWords + " words"); 
        }
        
    }
    
}
