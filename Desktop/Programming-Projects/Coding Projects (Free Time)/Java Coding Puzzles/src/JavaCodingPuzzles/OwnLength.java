/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class OwnLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getLength("dogs are nice"));
    }
    public static int getLength(String word){
       int length = 0;
       for(int i = 0; i<word.length(); i++){
           if(word.charAt(i) != ' '){
               length++;
           }
       }
       return length; 
    }
    
}
