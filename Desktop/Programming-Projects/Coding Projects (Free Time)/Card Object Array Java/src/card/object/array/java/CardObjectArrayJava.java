/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package card.object.array.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matthew
 */
public class CardObjectArrayJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        ArrayList<Card> deck = new ArrayList<Card>();
        String[] suits = {"hearts", "clubs", "diamonds", "spades"};
        String[] values = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "king", "queen"};
        for(int i = 0; i<suits.length; i++){
          for(int j = 0; j<values.length; j++){
              Card myCard = new Card(values[j], suits[i]);
              deck.add(myCard);
          }   
        }
        for(Card curCard: deck){
            System.out.println(curCard.getValue() + " of " + curCard.getSuit());
        }
    }
    
}
