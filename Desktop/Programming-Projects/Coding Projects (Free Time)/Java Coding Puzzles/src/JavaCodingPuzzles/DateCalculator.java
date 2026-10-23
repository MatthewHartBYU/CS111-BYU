package JavaCodingPuzzles;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateCalculator {
    public static void main(String[] args){
        System.out.println("Enter a time zone (e.g., America/New_York, Asia/Kolkata):");
        System.out.println("Enter the Continent and the City in that format above.");
        Scanner keyboard = new Scanner(System.in);
        try{
            String countryName = keyboard.nextLine();
            ZonedDateTime myObj = ZonedDateTime.now(ZoneId.of(countryName));
            System.out.println("Date in " + countryName.substring(countryName.indexOf("/")+1, countryName.length()) + ": " + myObj.toLocalDate());
            System.out.println("Time in " +  countryName.substring(countryName.indexOf("/")+1, countryName.length()) + ": " + myObj.toLocalTime());
        }
        catch(Exception e){
            System.out.println("Oops, an error occurred: " + e);
        }
    }
}
