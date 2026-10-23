/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class DaysOfChristmas {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        String gifts[] = {"A Partridge in a Pear Tree","2 Turtle Doves", "3 French Hens", "4 Calling Birds", "5 Gold Rings", "6 Geese A Laying",
         "7 Swans a Swimming", "8 Maids a Milking", "9 Ladies Dancing", "10 Lords a Leaping", "11 Pipers Piping", "12 Drummers Drumming"
        };
        for(int i = 0; i<12; i++){
            System.out.println("On the " + getOrdinal(i) + " day of Christmas, my true love gave to me");
            for(int j = i; j>= 0; j--){
                if(j == 0 && i !=0 ){
                    System.out.println("And " + gifts[j]);
                }
                else{
                    System.out.println(gifts[j]);
                }
            }
            System.out.println();
        }
    }
    public static String getOrdinal(int num){
        String ordinals[] = {"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th"};
        return ordinals[num];
    }
    
    
}
