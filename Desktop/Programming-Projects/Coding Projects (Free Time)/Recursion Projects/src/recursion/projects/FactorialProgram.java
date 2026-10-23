/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion.projects;

/**
 *
 * @author Matthew
 */
public class FactorialProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use this program to find the factorial of a number 
        System.out.println(findFactorialViaLoop(5));
        System.out.println(findFactorialViaRecursion(5));
    }
    public static int findFactorialViaLoop(int num){
        int factorial = 1;
        for(int i = 1; i<= num; i++){
            factorial *= i;
        } 
        return factorial;
    }
    public static int findFactorialViaRecursion(int num){
        if(num == 0){
            return 1;
        }
        return num * (findFactorialViaRecursion(num - 1));
    }
    
}
