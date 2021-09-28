package Exercise03;
import java.util.Scanner;
public class Exercise03_25 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter x1:");
int x1=sc.nextInt();
System.out.println("Enter x2:");
int x2=sc.nextInt();
System.out.println("Enter x3:");
int x3=sc.nextInt();
System.out.println("Enter x4:");
int x4=sc.nextInt();
System.out.println("Enter y1:");
int y1=sc.nextInt();
System.out.println("Enter y2:");
int y2=sc.nextInt();
System.out.println("Enter y3:");
int y3=sc.nextInt();
System.out.println("Enter y4:");
int y4=sc.nextInt();
int a = y1 - y2;
int b =(-1 * (x1 - x2));
int c = y3 - y4;
int d = -1 * (x3 - x4);
int e = (y1 - y2) * x1 - (x1 - x2) * y1;
int f = (y3 - y4) * x3 - (x3 - x4) * y3;
if (a * d - b * c == 0)
{
System.out.println("LINES ARE PARALLEL");
}
else
{
int x = (e * d - b * f) / (a * d - b * c);
int y = (a * f - e * c) / (a * d - b * c);
System.out.println("INTERSECTING POINT= (" + x + ", " + y + ")");
}



}
}
