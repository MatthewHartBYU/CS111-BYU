package JavaCodingPuzzles;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author matth
 */
public class HomeworkChallenge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int peopleLarge = 7;
        int peopleMedium = 5;
        int peopleSmall = 2;
        int numLarge = 0;
        int numMedium = 0;
        int numSmall = 0;  
        int numPeople = 20;       
        System.out.println("Number of People: " + numPeople);
        numLarge = (int)(numPeople/peopleLarge);
        numPeople %= peopleLarge;
        numMedium = (int)(numPeople/peopleMedium); 
        numPeople %= peopleMedium;
        numSmall = (int)Math.ceil((double)numPeople/peopleSmall);
        System.out.println("Large: " + numLarge);
        System.out.println("Medium: " + numMedium);
        System.out.println("Small: " + numSmall);

    }
    
}
