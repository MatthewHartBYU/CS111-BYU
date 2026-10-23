/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class BasketballShoe extends Shoe {
    String dunkHeight;
    public String getDunkHeight(String dunkHeight){
        Shoe.tie();
        return "The shoes have been tied and you went ace on the court, your dunk height was " + dunkHeight + "!";       
    }
}
