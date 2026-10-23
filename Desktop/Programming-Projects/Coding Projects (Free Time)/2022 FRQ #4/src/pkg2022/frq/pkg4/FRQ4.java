/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2022.frq.pkg4;

/**
 *
 * @author Matthew
 */
public class FRQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]values = new int[3][3];
        final int max = 90;
        populateArray(values, max);
        printArray(values);
    }
    public static int[][] populateArray(int[][]values, int max){
        for(int r = 0; r<values.length; r++){
            for(int c = 0; c<values[0].length; c++){
                int num = (int)(Math.random() * max) + 1;
                while(num % 10 != 0 || num % 100 == 0){
                     num = (int)(Math.random() * max) + 1;
                }
                values[r][c] = num;
            }
        }
        return values;
    }
    public static void printArray(int[][] values){
        for(int r = 0; r<values.length; r++){
            for(int c = 0; c<values[0].length; c++){
                System.out.print(values[r][c] + " ");
            }
            System.out.println();
        }
    }
    
}
