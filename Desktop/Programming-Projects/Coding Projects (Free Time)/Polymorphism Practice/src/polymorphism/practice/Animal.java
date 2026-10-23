/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.practice;

/**
 *
 * @author Matthew
 */
public class Animal {
    private String breed;
    public Animal(String breed){
        this.breed = breed; 
    }
    public String getBreed(){
        return breed;
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void eat(){
        System.out.println("Eating");
    }
    
}
