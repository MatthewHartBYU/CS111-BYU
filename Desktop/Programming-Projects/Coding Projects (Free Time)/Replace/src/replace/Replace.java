/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg07.math.trick.challenge.program;

/**
 *
 * @author Matthew
 */
public class MathTrickChallengeProgram {

    /**
     * @param args the command line arguments
     */
    /**
	 * 
	 ******  DO NOT USE ARRAYS OR CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Creates a random 3 digit (100-999) number where the first and last digit differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 use modulus to find the last digit and divide by 100 for the first digit.
	//		 calculate the difference, which method can you use so it doesn't matter how the numbers are subtract?
	// 		 while the difference of the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;
                int difference = 0;
		// complete the method		
                num = (int)(Math.random() * 900) + 100;
                firstDigit = (int)num/100;
                lastDigit = (int)num % 10; 
                difference = Math.abs(firstDigit) - Math.abs(lastDigit);
                while(difference < 2){
                    num = (int)(Math.random() * 900) + 100;
                }
		return num;
	}

	// Step 2 & 4) reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		create a new variable to store the reversed number
	//		while the original number > 0
	//		for each digit, multiply the new variable by 10 (to make room for the new digit) 
	//		then add the last digit (remember modulus?) to the new variable
	//		divide the original number by 10 to get rid of the last digit
	//	Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num) {
	
		int reversedNum = 0;
                while(num > 0){
                    int digit = num % 10;
                    reversedNum = reversedNum * 10 + digit;
                    num /= 10;
                }
                return reversedNum;
	}
	
	// Step 7) replace characters in a String according to the chart
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter
	public static String replaceLtr(String str)
	{
                String replacedString = "";
		for(var i = 0; i<str.length(); i++){
                    char curNumChar = str.charAt(i);
                    if(curNumChar == '0'){
                        replacedString += 'Y';
                    }
                    else if(curNumChar == '1'){
                        replacedString += 'M';
                    }
                    else if(curNumChar == '2'){
                        replacedString += 'P';
                    }
                    else if(curNumChar == '3'){
                        replacedString += 'L';
                    }
                    else if(curNumChar == '4'){
                        replacedString += 'R';
                    }
                    else if(curNumChar == '5'){
                        replacedString += 'O';
                        str.replace(curNumChar, 'O');
                    }
                    else if(curNumChar == '6'){
                        replacedString += 'F';
                        str.replace(curNumChar, 'F');
                    }
                    else if(curNumChar == '7'){
                        replacedString += 'A';
                        str.replace(curNumChar, 'A');
                    }
                    else if(curNumChar == '8'){
                        replacedString += 'I';
                    }
                    else{
                        replacedString += 'B';
                    }
                }
                return replacedString;
	}
	
	// Step 8) reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 loop through the original word   
	//		 add one letter at time to the new variable using concatenation and .substring()
	public static String reverseString(String str) {
		String reversedNumString = "";
                for(var i = str.length()-1; i>= 0; i--){
                    reversedNumString += str.charAt(i); 
                }
                return reversedNumString;
	}
    public static void main(String[] args) {
//	        1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
                int randomNum = getRandomNum();
                System.out.println("The starting number: " + randomNum);
//		2.	Now reverse the digits to form a second number.
                int reversedRandomNum = reverseDigits(randomNum);
                System.out.println("The reversed number: " + reversedRandomNum);
//		3.	Subtract the smaller number from the larger one.
                int differenceNums = 0;
                if(randomNum > reversedRandomNum){
                    differenceNums = randomNum - reversedRandomNum;
                }
                else{
                    differenceNums = reversedRandomNum - randomNum;
                }
                System.out.println("The difference is: " + differenceNums);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
                differenceNums = reverseDigits(differenceNums);
                randomNum += differenceNums;
                System.out.println("The reversed number added to the difference: " + randomNum);
//		5.	Multiply by one million.
                randomNum *= 1000000;
                System.out.println("Number multiplied by 1 million: " + randomNum);
//		6.	Subtract 733,361,573.
                randomNum -= 73361573;
//		7.	Convert the number to a string in order to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
                String numString = String.valueOf(randomNum);
                System.out.println("Number subtracted and converted to string: " + numString);
                numString = replaceLtr(numString);
                System.out.println("Replaced String: " + numString);
//		8.	Now reverse the letters in the string to read your message backward.
                numString = reverseString(numString);
                System.out.println("Reversed String: " + numString);
    }
    
}
