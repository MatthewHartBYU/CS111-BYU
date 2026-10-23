/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgstatic.method.practice;

import java.util.ArrayList;


/**
 *
 * @author Matthew
 */
public class StaticMethodPractice {

    /**
     * @param args the command line arguments
     */
    public static String reversePhrase(String phrase){
        String reversedPhrase = "";
        for(var i = phrase.length()-1; i>=0; i--){
            reversedPhrase += phrase.substring(i, i+1);
        }
        return reversedPhrase;
    }
    public static String scramblePhrase(String phrase){
         phrase = phrase.replaceAll(" ","");
         ArrayList<String> letters = new ArrayList<String>();
         String scrambledString = "";
         //add each letter of the string to an arraylist
         for(var i = 0; i<phrase.length(); i++){
             String curLetterString = "";
             char curLetter = phrase.charAt(i);
             curLetterString = String.valueOf(curLetter);
             letters.add(curLetterString);
         }
         //get random value from arrayList and add it to the new string. once you have a letter, remove it to avoid duplicates
         for(var i = 0; i<phrase.length(); i++){
             int randomNum = (int)(Math.random() * letters.size());
             String curLetter = letters.get(randomNum);
             scrambledString += curLetter;
             letters.remove(curLetter);                 
        }
        return scrambledString;
    }
    public static void printPhrase(String phrase){
        System.out.println(phrase);
    }

    public static void main(String[] args) {
        String ReversedPhrase = reversePhrase("My math homework was a piece of cake");
        String ScrambledPhrase = scramblePhrase("Math homework is good practice"); 
        printPhrase(ScrambledPhrase);
        printPhrase(ReversedPhrase);
    }
    
}
