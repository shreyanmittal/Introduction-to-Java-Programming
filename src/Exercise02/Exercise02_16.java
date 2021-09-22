/*
 * @author SamirAli Mukhi 
 * S.ID: 20CS038
 * Email: 20cs038@charusat.edu.in
 */

/*Exercise 2.16 (Geometry: area of a hexagon) 
  Write a program that prompts the user to enter the side of a hexagon and displays its area.*/

import java.util.Scanner;

class Exercise02_16 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in); //Object of Scanner

        System.out.print("Enter the side: ");
        double side = input.nextDouble();  //Object called
        double constant = (3 * 1.732) / 2; 
        double area = (constant*side*side);  //The formula for computing the area of a hexagon
        System.out.println("\nThe area of the hexagon is " + area);
    }
}
