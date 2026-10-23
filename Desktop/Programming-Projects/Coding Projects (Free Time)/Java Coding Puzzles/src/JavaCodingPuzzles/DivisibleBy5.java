/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class DivisibleBy5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 15;
        System.out.println(canDivide(num));
    }
    public static boolean canDivide(int num){
        return num % 5 == 0;
    }
}
