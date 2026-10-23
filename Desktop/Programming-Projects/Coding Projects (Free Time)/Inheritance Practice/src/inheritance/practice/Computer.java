/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.practice;

/**
 *
 * @author Matthew
 */
public class Computer {
    private String brand;
    private int cost;
    public Computer(String brand, int cost){
        this.brand = brand;
        this.cost = cost;
    }
    public String getBrand(){
        return brand;
    }
    public int getCost(){
        return cost;
    }
    public String totalCost(){
        return cost + " " + brand;
    }
}
