package Exercise04;

/*
 * @author Kevin Colaco (20CS013)
 * 
 * (Business application: checking ISBN) Use loops to simplify Exercise 3.9.
 */

import java.util.Scanner;

public class Exercise04_36 {
    public static void main(String[] args) {
        // Initializing checksum to zero as we want to calculate the total
        int checksum = 0;

        // Asking the user
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        Scanner input = new Scanner(System.in);

        // Using String to calculate length
        String isbnDigitString = input.nextLine();

        // Checking to see if the entered numbers have length equal to 9 by using the length method from string
        if (isbnDigitString.length() == 9) {
            
            int isbnDigitInteger = Integer.parseInt(isbnDigitString);

            // Looping through the formula to get the final total
            for (int i = 0; i < 9; i++) {
                checksum = checksum + (isbnDigitInteger % 10) * (9 - i);
                isbnDigitInteger = isbnDigitInteger / 10;
            }

            // Using the modulo operator according to the given formula
            checksum = checksum % 11;

            // Replacing the last digit to X if checksum is 10
            if (checksum == 10){
                isbnDigitString = isbnDigitString + "X";
            }
            else{
                isbnDigitString = isbnDigitString + checksum;
            }

            // Showing the answer to the user
            System.out.print("The ISBN-10 number is " + isbnDigitString);
        }

        else {
            System.out.println("Invalid input");
        }
    }
}
