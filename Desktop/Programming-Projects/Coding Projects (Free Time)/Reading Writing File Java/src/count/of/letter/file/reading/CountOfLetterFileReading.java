/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package count.of.letter.file.reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class CountOfLetterFileReading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String token = ""; 
        File fileName = new File("And.txt"); 
        int totalCharacters = 0;
        int numAppearances = 0;
        Scanner inFile = new Scanner(fileName); 
        //while loop will continue while inFile has a next token to read
        while( inFile.hasNext() )  
        {
                token = inFile.next(); //read next token from file 
                for(var i = 0; i<token.length(); i++){                   
                    if(token.charAt(i) == 'a'){ 
                        numAppearances ++;
                    } 
                }                               
                totalCharacters += token.length();
        }//end whords += token.length();ile 
        System.out.println("Your files contains " + totalCharacters + " letters.");
        System.out.println("It contains the letter a " + numAppearances + " times.");
        //writeToFile();
    }  
    /*public static void writeToFile() throws IOException{
        FileWriter myWriter = new FileWriter("And.txt");
        myWriter.write("Crumbl cookies are very overrated, and I don't know why so many exist here!");
        myWriter.close();
    }*/
}  

