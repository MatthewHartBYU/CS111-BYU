/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion.projects;

/**
 *
 * @author Matthew
 */
public class CountDownNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Shuttle is getting ready to lift off!");
       countDown(3);
    }
    public static void countDown(int num){
            if(num == 0){
                System.out.println(num);
                System.out.println("Lift off!");
            }
            else{
                System.out.println(num + " ");
                countDown(num - 1);
            }
        }
}
