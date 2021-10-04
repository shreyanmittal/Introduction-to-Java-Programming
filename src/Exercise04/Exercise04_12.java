/*
 * @author Shreyan Mittal 
 * ID 20CS037
*/
/*
 * Question: Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest integer n such that n2 is greater than 12,000.
 */
public class Exercise_04_12 {

    public static void main(String[] args) {

        int n = 0;

        while (Math.pow(n, 2) < 12000) {
            n++;
        }

        System.out.println(n + " is the lowest number, such that n^2 is greater than 12,000");
        System.out.println("Proof: " + (n - 1) + "^2 = " + Math.pow(n - 1, 2));
        System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2));

    }
}