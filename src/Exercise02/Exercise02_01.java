package Exercise02;
/*
 * @author Vatsal Ghoghari (20CS016)
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value  from  the  console,
 * then  converts  it  to  Fahrenheit  and  displays the result.
 * The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9/5 is 1, but 9.0/5 is 1.8
 */
import java.util.Scanner;
public class Exercise02_01 {
	public static void main(String[] args) {
		//creating scanner object to get input from user
		Scanner sc = new Scanner(System.in);

		//prompting user for celsius degree
		System.out.print("Enter a degree in Celsius: ");
		double celsiusDegree = sc.nextDouble();

		//calculating Fahrenheit Degree
		double fahrenheitDegree = (9.0/5) * celsiusDegree + 32; // (In Java, 9/5 is 1, but 9.0/5 is 1.8)

		//displaying output
		System.out.println(celsiusDegree + "° Celsius is " + fahrenheitDegree + "° Fahrenheit");
	}
}