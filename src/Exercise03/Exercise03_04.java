package Exercise03;

/*
 * @author Kevin Colaco (20CS013)
 * 
 * (Game: learn addition) Write a program that generates two integers under 100
 *  and prompts the user to enter the sum of these two integers. The program then
 *  reports true if the answer is correct, false otherwise.
 */

import java.util.Scanner;

public class Exercise03_04 {
    public static void main(String[] args) {
        // Generating random numbers between 1 and 100
        // We have used int to convert the double value returned from random() to an integer
        int randomNumber1 = (int)(Math.random() * 100);
        int randomNumber2 = (int)(Math.random() * 100);

        // Printing the question for program
        System.out.print("Give the answer for " + randomNumber1 + " + " + randomNumber2 + ": ");

        // To get answer from user
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // Condition to check if answer is right or wrong
        if (randomNumber1 + randomNumber2 == answer) {
            System.out.println("Your answer is correct, you have won the game");
        }

        else {
           System.out.println("Your answer is wrong");
           System.out.println("The correct answer of " + randomNumber1 + " + " + randomNumber2 + " is " + (randomNumber1 + randomNumber2));
           System.out.println("Better luck next time");
        }
    }
 }

