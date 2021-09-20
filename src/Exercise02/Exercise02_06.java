package Exercise02;

import java.util.Scanner;

public class Exercise02_06 {
	public static void main(String[] args) {
		System.out.println("Enter an integer to discover the sum of its digits: ");
        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();           //taking input from user
        System.out.println(sumDigits(Number));
    }
	
	//method to calculate the sum
    private static int sumDigits(int a) {

        int sum = 0;
        while (a > 0) {
        	
        	sum += (a % 10);
            a /= 10;
            
        }
        return sum;
	}

}
