/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance.practice;

/**
 *
 * @author Matthew
 */
public class TechTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introducing our latest tech devices:");
        Computer pc = new Computer("Windows", 1500);
        Tablet tab = new Tablet("Amazon", 150);
        System.out.println("Computer:");
        System.out.println("Brand: " + pc.getBrand());
        System.out.println("Cost: " + pc.getCost());
        System.out.println("List: " + pc.totalCost());
        System.out.println();
        System.out.println("Tablet:");
        System.out.println("Brand: " + tab.getBrand());
        System.out.println("Cost: " + tab.getCost());
         System.out.println("List: " + tab.totalCost());
    }
    
}
