package Exercise02;

import java.util.Scanner;

public class Exercise02_06 {
	public static void main(String[] args) {
		
	//printing a line to enter sum of digits 	
	System.out.println("Enter an integer to discover the sum of its digits: ");
		
	//making a scanner object
        Scanner input = new Scanner(System.in);
		
        //taking input integer from the user
        int Number = input.nextInt();           
		
	//calling the function
        System.out.println(sumDigits(Number));
    }
	
	//creating the function called sumdigits
    private static int sumDigits(int a) {
	    
        //initialising the sum variable to default value 0
        int sum = 0;
	    
	//using a while loop to calculate the sum
        while (a > 0) {
        	
            sum += (a % 10);
            a /= 10;    
        }
	    
            //returning the calculated sum of digits
	    return sum;
	}

}
