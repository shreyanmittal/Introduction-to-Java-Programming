/*
 * @author Shreyan Mittal 
 * ID 20CS037
*/
/*
 * Question: (Find the largest n such that n3 6 12,000) Use a while loop to find the largest integer n such that n3 is less than 12,000. 
 */

public class Exercise_04_13{

    
    public static void main(String[] args) {
        int n = 0;
        int nCubed = (int) (Math.pow(n, 3));
        
        while (nCubed < 12000) {
            n++;
        }
        System.out.println("The highest integer below 12000 is " +n);
    }
}
    
}