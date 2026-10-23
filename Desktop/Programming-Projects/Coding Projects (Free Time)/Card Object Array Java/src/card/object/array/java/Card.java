/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card.object.array.java;

/**
 *
 * @author Matthew
 */
public class Card {
    private String mySuit;
    private String myValue;
    public Card(String value, String suit){       
        myValue = value;
        mySuit = suit;
    }
    public String getSuit(){
        return mySuit;
    }
    public String getValue(){
        return myValue;
    }
}
