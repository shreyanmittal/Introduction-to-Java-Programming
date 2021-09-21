package Exercise02;

import java.util.Scanner;
/*
* @author Ruhi Kansagara (20CS022)
  Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
  For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and
  $11.5 as total.
*/
public class Exercise02_05 {
    public static void main(String[] args) {

        double subTotal;
        double gratuityRate;
        double total;
        double gratuity;
        Scanner sc = new Scanner(System.in);                      //Input from user
        System.out.println("Enter subtotal and gratuity rate: ");
        subTotal = sc.nextDouble();                               //Scanning user input subTotal and gratuityRate
        gratuityRate = sc.nextDouble();
        gratuity = (gratuityRate * subTotal)/100;                 //Calculating gratuity
        total = subTotal + gratuity;                              //Calculating total
        System.out.println("The gratuity is: $"+gratuity);        //Printing the value of gratuity
        System.out.println("The total amount is: $"+total);       //Printing the value of total
    }
}

