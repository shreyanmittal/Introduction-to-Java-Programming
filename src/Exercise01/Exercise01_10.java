/*
 * @author: MEET S. BUTANI  (20CS010)
 * @email: 20CS010@charusat.edu.in
 * 
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.  (Note that 1 mile is 1.6 kilometers.)
 * 
 */

package Exercise01;
public class Exercise01_10
{
    public static void main(String[] args)                                                   // Main method
    {
        double distance_km = 14;                                                             // double variable distance_km to store distance in km
        double distance_miles = distance_km/1.6;                                             // Converting distance in km to distance in miles
        int time_sec = 2730;                                                                 // 45minutes and 30 seconds in seconds is 2730

        double speed_mph  = (distance_miles * 60 * 60) / time_sec;                           // Calculating average speed in miles per hour
        System.out.println("Average speed of runner in miles per Hour is: " + speed_mph);    // Printing the average speed in miles per hour
    }
}