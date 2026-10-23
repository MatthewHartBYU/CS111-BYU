/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author matth
 */
public class HomeworkChallenge {

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
        int numPeople = 31;       
        System.out.println("Number of People: " + numPeople);
        while(numPeople != 0){ 
            if(numPeople >= 7){   
                numLarge = (int)(numPeople/peopleLarge);
                numPeople = numPeople % peopleLarge;  
            } 
            else if(numPeople >=5){
                numMedium = (int)(numPeople/peopleMedium); 
                numPeople = numPeople % peopleMedium;
            } 
            else{    
                numSmall = (int)Math.ceil((double)numPeople/peopleSmall);
                numPeople -= numPeople;                  
            }
        }
        System.out.println("Large: " + numLarge);
        System.out.println("Medium: " + numMedium);
        System.out.println("Small: " + numSmall);
        
        
        
    }
    
}
