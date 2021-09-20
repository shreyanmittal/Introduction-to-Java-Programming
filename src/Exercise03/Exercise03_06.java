package Exercise03;

/*
* @author Dev Desai (20CS015)
*/

import java.util.Scanner;

public class Excercise03_06 {
       
    		public static void main(String[] args) {
    			Scanner input = new Scanner(System.in);

    			System.out.print("Enter weight in pounds: ");//take input form user
    			double weight = input.nextDouble();
    			System.out.print("Enter feet: ");
    			double feet = input.nextDouble();
    			System.out.print("Enter inches: ");
    			double inches = input.nextDouble();
    			
                     final double kg= 0.45359237*weight;
    			
                     final double feets=feet+(inches/12);
    			
                     final double height=feets/3.28;
    			
                     double bmi = kg /(height*height);
    			 
                     System.out.println("bmi is:"+bmi);
    					   			 
}
}
