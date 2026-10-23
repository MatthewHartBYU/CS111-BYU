/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
public class Shoe {
    String brand;
    String color;
    boolean isWearing;
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public static void tie(){
        System.out.println("Your shoe is now tied!");
    }
    public void wear(){
        this.isWearing = true;
    }
}
