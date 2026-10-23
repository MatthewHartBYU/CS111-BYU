/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessing.game;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] cities = {"Cape Town", "Pretoria", "Johanesburg", "Bloemfontein", "Gqeberha"};
        System.out.println("Here is a list of cities located in South Africa");
        for(String curCity: cities){
            System.out.print(curCity + ", ");
            if(curCity.equals("Gqeberha")){
                System.out.print(curCity + ".");
            }
        }
        System.out.println();
        System.out.println("Using my magical powers, I will pick a random value from this list, and you have 3 tries to guess it.");
        String cityChosen = cities[(int)(Math.random() * cities.length-1)]; 
        System.out.println("Enter your guess:");
        String userGuess = keyboard.next();
        int numGuesses = 2;
        while(numGuesses > 0){
            if(userGuess.equals(cityChosen)){
                System.out.println("Good job! You guessed the city correctly!");
                System.out.println("City chosen - " + cityChosen);
                System.out.println("Your guess - " + userGuess);
                System.out.println("You have good guessing skills!");
                break;
            }
            else{
                System.out.println("Sorry, you guessed the wrong place! Try again");
                numGuesses--; 
                userGuess = keyboard.next();
            }
            
        } 
        if(numGuesses == 0){
            System.out.println("All out guesses! Better luck next time.");
        }
        
        
    }
    
}
