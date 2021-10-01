/*20cs040
shubhangi nakrani
 */
package Exercise05;
import java.util.Scanner;

public class Exercise05_4
{
    public static int reverse(int num)
    {
        int a=0,r;//variable counter and reminder
        while (num!=0)
        {
            //logic for reverse number
            r = num % 10;
            a = a * 10 + r;
            num = num/ 10;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        System.out.println("Reverse of given number is "+reverse(n));
    }
}
/*Enter number
3456
Reverse of given number is 6543

Process finished with exit code 0
*/
/*
Enter number
5698
Reverse of given number is 8965

Process finished with exit code 0

 */