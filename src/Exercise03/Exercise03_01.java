package Exercise03;

/*
* @author Khush Bhalodiya (20CS007)
*/

import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {

		double a, b, c, Dis, x, y, z;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values a, b, and c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		Dis = (b * b) - (4 * a * c);

		if (Dis > 0) {
			x = (-b + Math.pow(Dis, 0.5)) / (2 * a);

			y = (-b - Math.pow(Dis, 0.5)) / (2 * a);

			System.out.println("The roots are " + x + "and " + y);
		}

		else if (Dis == 0) {
			z = -b / 2;

			System.out.println("The root is " + z);
		}

		else {
			System.out.println("The equation has no real roots ");
		}
	}
}
