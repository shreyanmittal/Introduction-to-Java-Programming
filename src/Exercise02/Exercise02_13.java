/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02;

import java.util.Scanner;

/**
 *
 * @author mohit
 */
public class Exercise02_13 {
    
    //Main method
    public static void main(String[] args) {
        
        // Constant variable.
        final double monthly_interest_rate = 0.05/12;
        
        //Input for saving amount.
        Scanner input = new Scanner(System.in);
        System.out.println("The Annual Interest rate is 5% .");
        System.out.println("Enter the saving amount");
        double saving_amount = input.nextDouble();
        
        // Creating first month account value.
        double interest = 100 * (1 + monthly_interest_rate);
        
        // Creating account value from 2nd to 6th month.
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 2nd
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 3rd
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 4th
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 5th
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 6th
        
        //Printing the amount value after six month.
        System.out.println("After 6 months the total value (in percentage) = Rs. "+ interest);
    }

}
