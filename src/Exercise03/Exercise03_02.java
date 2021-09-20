/*
 * @author: MEET S. BUTANI  (20CS010)
 * @email: 20CS010@charusat.edu.in
 * 
 * (Game: add three numbers) The program in Listing 3.1 generates two integers and
 * prompts the user to enter the sum of these two integers. Revise the program to
 * generate three single-digit integers and prompt the user to enter the sum of 
 * these three integers.
 * 
 */

package Exercise03;
import java.util.Scanner;                                                               // Importing Scanner class

public class Exercise03_02
{
    public static void main(String[] args)                                              // Main method
    {
        Scanner sc = new Scanner(System.in);                                            // Creating object of Scanner class
        int num1 = (int)(System.currentTimeMillis() % 10);                              // Generating 1st random number "num1"
        int num2 = (int)(System.currentTimeMillis() / 7 % 10);                          // Generating 2nd random number "num2"
        int num3 = (int)(System.currentTimeMillis() / 5 % 10);                          // Generating 3rd random number "num3"
        int sum = num1 + num2 + num3;                                                   // Calculating the sum of above 3 random variables

        System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + "?");      // Displaying the addition question
        System.out.print("Enter your answer: ");                                        // Asking the user to enter the sum
        int ans = sc.nextInt();                                                         // Inputting answer from the user using Scanner object
        sc.close();                                                                     // Closing scanner object
        
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + ans + " is " + (sum == ans));     // Evaluating the user's answer and printing it
    }
}