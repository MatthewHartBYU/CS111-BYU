/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism.practice;

/**
 *
 * @author Matthew
 */
public class PolymorphismPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal myAnimal = new Cub("Cub");
        Cub myCub = new Cub("Cub"); 
        myCub.eat(); 
        myAnimal.eat();
    }
    
}
