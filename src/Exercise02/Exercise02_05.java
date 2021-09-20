package Exercise02;

import java.util.Scanner;
/*
BY - RUHI KANSAGARA
ID - 20CS022
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
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter subtotal and gratuity rate: ");
            subTotal = sc.nextDouble();
            gratuityRate = sc.nextDouble();
            gratuity = (gratuityRate * subTotal)/100;
            total = subTotal + gratuity;
            System.out.println("The gratuity is: $"+gratuity);
            System.out.println("The total amount is: $"+total);

        }

    }

