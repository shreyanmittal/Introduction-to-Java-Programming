package Exercise02;

import java.util.Scanner;
/*
* @author Ruhi Kansagara (20CS022)
* Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
* For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and
* $11.5 as total.
*/
public class Exercise02_05 {
    public static void main(String[] args) {

        // to store sub total
        double subTotal;
        // to store gratuity rate
        double gratuityRate;
        // to store total
        double total;
        // to store gratuity rate
        double gratuity;

        //Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subtotal and gratuity rate: ");
        //Scanning sub Total
        subTotal = sc.nextDouble();
        //Scanning gratuityRate
        gratuityRate = sc.nextDouble();
        //Calculating gratuity
        gratuity = (gratuityRate * subTotal)/100;
        //Calculating total
        total = subTotal + gratuity;
        //Printing the value of gratuity
        System.out.println("The gratuity is: $"+gratuity);
        //Printing the value of total
        System.out.println("The total amount is: $"+total);
    }
}

