/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class ObjectPuzzle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shoe myShoe = new Shoe();
        myShoe.setBrand("Adidas");
        myShoe.setColor("Red");
        System.out.println(myShoe.brand + " " + myShoe.color);
        myShoe.wear();
        System.out.println("Is this shoe being worn? " + myShoe.isWearing);
        BasketballShoe myShoe1 = new BasketballShoe();
        System.out.println(myShoe1.getDunkHeight("15 feet"));
        myShoe1.tie();
    }
    
}
