/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaCodingPuzzles;

/**
 *
 * @author Matthew
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
public class ReadFile { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numR = 0;
       int numCount = 0;
       String result = "";
       String target = "Gyming is nice everyday"; 
       try {
            File myObj = new File("C:\\Users\\Matthew\\Desktop\\Coded Things\\Java Coding Puzzles\\Stuff.txt"); 
            Scanner myReader = new Scanner(myObj);
            System.out.println("Data in the file is listed below: \n");
       while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            //now implement a way to print all the words seperately
            result += data + " ";
            int indexSpace = data.indexOf(" ");
            int cursor = 0;            
            while(indexSpace != -1){
               String curWord = data.substring(cursor, indexSpace);
               if(curWord != ""){            
                  if(curWord.equals("are")){ 
                     numCount++;
                  } 
               }
               cursor = indexSpace + 1;
               indexSpace = data.indexOf(" ", cursor);
            }     
            //While loop that locates each character found in the data from the file
            System.out.println(data);
            for(int i = 0; i<data.length(); i++){
                if(data.charAt(i) == 'r'){
                  numR++;
                }
            }
       }
       System.out.println();
       System.out.println("There are " + numR + " r's in your file, Matthew!");
       System.out.println("The word are appears " + numCount + " times in your file, Matthew");
       myReader.close();
       if(result.contains(target)){
           System.out.println("The string " + target + " is contained in the file!");
       }
       else{ 
         System.out.println("The string " + target + " is not contained in the file!");  
       }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace(); 
    }       
   } 
}
