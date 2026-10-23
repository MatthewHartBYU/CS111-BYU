/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class SumEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        System.out.println(sumEvens(num));
    }
    public static int sumEvens(int num){
        int sumEvens = 0;
        for(int i = 1; i<=num; i++){
            if(i % 2 == 0){  
                sumEvens += i;
            }
        }
        return sumEvens;
    }
    
}
