/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class SomeCoolVariablePuzzles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Thanks for coming to my arcade of variable games!");
        System.out.println("First, we will display two values and swap them");
        swapValues(4,1);
        printSecondValue(10);
        System.out.println("The number 10 is even: " + isEven(10));
    }
    public static void swapValues(int x, int y){
        System.out.println("Original Values: X:" + x + " Y:" + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Swapped Values: X:" + x + " Y:" + y);
    }
    public static void printSecondValue(int x){
        System.out.println("Numbers that are divisible by 2 leading up to " + x);
        for(int i = 0; i<x; i++){
            if(i % 2 == 0 && i != 0){  
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static boolean isEven(int x){
        return x % 2 == 0;
    }
    
}
