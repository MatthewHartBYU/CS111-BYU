/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap.practice;

import java.util.ArrayList;

/**
 *
 * @author Matthew
 */
public class APPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Baseball> baseballs = new ArrayList<Baseball>();
        Baseball ball1 = new Baseball(1941, "Rawlings!");
        Baseball ball2 = new Baseball(2005, "MLB!");
        Baseball ball3 = new Baseball(2022, "Wilson");
        baseballs.add(ball1);
        baseballs.add(ball2);
        baseballs.add(ball3);
        getAverageYear(baseballs);
        System.out.println("Baseballs with an ! in their creator's name!");
        getMakers(baseballs); 
       
    }
     public static void getAverageYear(ArrayList<Baseball> baseballs){
        int sum = 0;
        for(Baseball curBall: baseballs){
            sum += curBall.getYear();
        }
        System.out.println((double)sum/baseballs.size());
    }
     public static void getMakers(ArrayList<Baseball> baseballs){
        //return all baseballs with an ! in their name
        ArrayList<String> makers = new ArrayList<String>();
        for(Baseball curBall: baseballs){ 
            if(curBall.getMaker().indexOf("!") != -1){
                makers.add(curBall.getMaker());
            } 
        }
        for(String curMaker: makers){
            System.out.println(curMaker);
        }
    }
    
        
    
}
