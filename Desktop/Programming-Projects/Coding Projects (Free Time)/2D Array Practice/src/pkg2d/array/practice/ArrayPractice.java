/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2d.array.practice;

/**
 *
 * @author Matthew
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a[][] = {     
                        {1, 2, 3},  
                        {4, 5, 6},  
                        {7, 8, 9}  
                    };  
            
          //Calculates number of rows and columns present in given matrix  
          
        //Calculates sum of each row of given matrix   
          
        //Calculates sum of each column of given matrix  
        int[] colHeader = {3,6,9};
        int[] rowHeader = {2,4,6,8};
        int[][] matrix = calcMagicMath(rowHeader, colHeader);
        for(int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
     
  }
    public static void sumColumn(int[][] a, int column){
        int sumCol = 0; 
        for(int rows = 0; rows <a.length; rows++){             
           sumCol += a[rows][column];              
        }
        System.out.println("Sum of " + column +" column: " + sumCol);  
    }
    public static int[][] calcMagicMath(int[] rowH, int[] colH){
        int[][] mathMatrix = new int[rowH.length][colH.length];         
        for(int col = 0; col<colH.length; col++){
            for(int row = 0; row<rowH.length; row++){
               mathMatrix[row][col] = colH[col] * rowH[row];
            }
        }
        return mathMatrix;
    }
}
