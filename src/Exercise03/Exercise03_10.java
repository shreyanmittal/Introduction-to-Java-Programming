package Exercise03;
import java.util.Scanner;

public class Exercise03_10 {

			public static void main(String[] args) {
				// Generate a random int from 0 to 1 * 100 then cast to integer
		        int n1 = (int) (Math.random() * 100); 
		        int n2 = (int) (Math.random() * 100);

		        System.out.print("What is " + n1 + " + " + n2 + "? ");

		        Scanner input = new Scanner(System.in);
		        int userAnswer = input.nextInt();

		        //check the answer with user
		        if (n1 + n2 == userAnswer)
		            System.out.println("Your answer is correct!");
		        else {
		            System.out.println("Your answer is wrong.");
		            System.out.println(n1 + " + " + n2 + " should be " + (n1 + n2));
		            input.close();
		        }
		}

}
