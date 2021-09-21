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

// Importing Scanner class
import java.util.Scanner;

public class Exercise03_02
{
    // Main method
    public static void main(String[] args)
    {
        // Creating an object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Generating the 1st single-digit random number "num1"
        int num1 = (int)(System.currentTimeMillis() % 10);
        // Generating the 2nd single-digit random number "num2"
        int num2 = (int)(System.currentTimeMillis() / 7 % 10);
        // Generating the 3rd single-digit random number "num3"
        int num3 = (int)(System.currentTimeMillis() / 5 % 10);
        
        // Calculating the sum of above 3 generated random numbers
        int sum = num1 + num2 + num3;

        // Displaying the addition question for the user
        System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + "?");
        // Asking the user to enter his/her answer
        System.out.print("Enter your answer: ");
        // Inputting the answer of user using Scanner object
        int ans = sc.nextInt();
        // Closing scanner object
        sc.close();
        
        // Evaluating the user's answer and printing it
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + ans + " is " + (sum == ans));
    }
}
