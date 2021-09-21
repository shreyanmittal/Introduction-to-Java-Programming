package Exercise03;

/*
* @author Dev Desai (20CS015)
*/

import java.util.Scanner;

public class Exercise03_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// take the weight form the user in pouds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();

		double kg = 0.45359237 * weight;
		double feets = feet + (inches / 12);
		double height = feets / 3.28;
		double bmi = kg / (height * height);

		System.out.println("BMI is: " + bmi);

	}
}
