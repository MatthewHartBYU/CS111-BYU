/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class ChessBoardChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getSquares() + " is the number of black squares");
    }
    public static int getSquares(){
        int length = (int)(Math.random() * 98) + 2;
        //we always need an even number, so keep generating
        while(length % 2 == 1){
           length = (int)(Math.random() * 98) + 2;
        }
        System.out.println("Length of chessboard is " + length);
        if(length % 2 == 1){
            System.out.println("Oh man! You did not put in an even number");
        }
       
          return ((int)Math.pow(length, 2))/2;
    }
    
}
