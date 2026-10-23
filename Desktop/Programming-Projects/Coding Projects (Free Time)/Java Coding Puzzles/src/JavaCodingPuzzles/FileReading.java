package JavaCodingPuzzles;
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner;             // Import the Scanner class to read text files
import java.util.Map;
import java.util.HashMap;
public class FileReading {
    public static void main(String[] args) {
        File myObj = new File("src/JavaCodingPuzzles/Nonsense.txt");
        int numEs = 0;
        Map<String, Integer> scores = new HashMap<>();
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                for(int i = 0; i < data.length(); i++){
                    if(Character.toLowerCase(data.charAt(i)) == 'e'){
                        numEs++;
                    }
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Number of e's and E's in the file is: " + numEs);
    }
}
