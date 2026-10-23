/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tic.tac.toe;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        String[][] board = new String[3][3];
        boolean hasWon = false;
        String opponentSymbol = "";
        int computerRow = 0;
        int computerCol = 0;
        Scanner keyboard = new Scanner(System.in);
        //start intro
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Here is the starting gameboard");
        fillBoard(board);
        System.out.println("Choosing O's or X's (type O for O's and type X for X's)");
        String userSymbol = keyboard.next();
        if(userSymbol.equals("X")){
            opponentSymbol = "O";
        }
        else{
            opponentSymbol = "X";
        }
        System.out.println("Looks like you chose " + userSymbol);
        System.out.println("Select the row number to take your shot at ");
        int userRow = keyboard.nextInt();
        System.out.println("Select the column number to take your shot at");
        int userCol = keyboard.nextInt();
        System.out.println("Board updated:");
        updateBoard(board, userRow, userCol, userSymbol);
        displayBoard(board);      
        System.out.println("Computer is taking their turn:");
        computerShot(board, computerRow, computerCol, opponentSymbol, userSymbol, userRow, userCol); 
        System.out.println("Board updated:");
        displayBoard(board);
        while(!hasWon){
           System.out.println("Select the row number to take your shot at ");
           userRow = keyboard.nextInt();
           System.out.println("Select the column number to take your shot at");
           userCol = keyboard.nextInt();
           if(board[userRow][userCol] == userSymbol){
               System.out.println("Try again! There is already a piece there.");
               System.out.println("Select the row number to take your shot at ");
               userRow = keyboard.nextInt();
               System.out.println("Select the column number to take your shot at ");
               userCol = keyboard.nextInt();
           }
           System.out.println("Board updated:");
           updateBoard(board, userRow, userCol, userSymbol);
           displayBoard(board);      
           System.out.println("Computer is taking their turn:");
           computerShot(board, computerRow, computerCol, opponentSymbol, userSymbol, userRow, userCol); 
           System.out.println("Board updated:");
           displayBoard(board);
           hasWon = checkWin(board, opponentSymbol, userSymbol);
        }
        System.out.println("Game over");
        
        
        
    }
    public static void fillBoard(String[][] gameBoard){
        for(int row = 0; row<gameBoard.length; row++){
            for(int col = 0; col<gameBoard[row].length; col++){ 
                gameBoard[row][col] = "-";
                System.out.print(gameBoard[row][col] + " ");
            }
            System.out.println();
        }       
    }
    public static String[][] updateBoard(String[][] board, int row, int col, String userSymbol){
        board[row][col] = userSymbol;
        return board; 
    }
    public static String[][] computerShot(String[][] board, int rowChoice, int colChoice, String computerSymbol, String userSymbol, int userRow, int userCol){
        rowChoice = (int)(Math.random() * board.length);
        colChoice = (int)(Math.random() * board.length);
        //preventing a winner from getting a vertical win
        if(board[0][0] == userSymbol && board[0][1] == userSymbol){
            rowChoice = 0;
            colChoice = 2;
            board[rowChoice][colChoice] = computerSymbol;
        } 
        else if(board[0][0] == userSymbol && board[0][2] == userSymbol){
            rowChoice = 0;
            colChoice = 1;
            board[rowChoice][colChoice] = computerSymbol;
        }
        else if (board[rowChoice][colChoice] == "-"){
            board[rowChoice][colChoice] = computerSymbol;
        }else{
           while(board[rowChoice][colChoice] == userSymbol || board[rowChoice][colChoice] == computerSymbol){
               rowChoice = (int)(Math.random() * board.length); 
               colChoice = (int)(Math.random() * board.length);
           }
           board[rowChoice][colChoice] = computerSymbol;
        }
        return board; 
        
    }
    public static void displayBoard(String[][] gameBoard){
        for(int row = 0; row<gameBoard.length; row++){
            for(int col = 0; col<gameBoard[row].length; col++){
                System.out.print(gameBoard[row][col] + " ");
            }
            System.out.println();
        }       
    }
    public static boolean checkWin(String[][] gameBoard, String computerSymbol, String userSymbol){
        int userPoints = 0;
        int compPoints = 0;
        
        
        return userPoints == 3 || compPoints == 3;
    }
}
