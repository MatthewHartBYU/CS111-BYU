/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.practice;

/**
 *
 * @author Matthew
 */
public class Person {

    private String myName;
    private String mySchool;
    public Person (String name, String school){
        myName = name;
        mySchool = school;
    }
    public void printData(String name, String school){
        System.out.println("Their name is " + name + " and they go to " + school + ".");
    }
    public static void main(String args[]) {
        Person personOne = new Person("Matthew", "Viera");
        Person personTwo = new Person("Jacob", "BYU");
        Person personThree = new Person("Hannah", "UCF");
        Person personFour = new Person("Shelby", "Columbia");
        Person personFive = new Person("Benson", "Stanford");
        Person personSix = new Person("Adam", "VCS");
        personOne.printData("Matthew", "Viera");
        personTwo.printData("Jacob", "BYU");
        personThree.printData("Hannah", "UCF");
        personFour.printData("Shelby", "Columbia");
        personFive.printData("Benson", "Stanford");
        personSix.printData("Adam", "VCS");
    }
    
}
