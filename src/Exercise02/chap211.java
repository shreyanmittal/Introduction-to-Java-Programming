import java.util.Scanner;
class chap211
{
    public static void main( String []args)
    {
        long population = 312032486, count=0;
        System.out.println("Current population is: " + population);
        
        // there are 365*24*60*60 = 31536000 seconds in a year
        final long SECONDS = 31536000;
        // one birth every 7 seconds
        count += SECONDS/7;
        
        // one death every 13 seconds
        count -= SECONDS/13;
        
        // one new immigrant every 45 seconds
        count += SECONDS/45;
        
        //population increase in a year is count value
        
        Scanner input = new Scanner(System.in);
        int years;
        System.out.print("Enter number of years: ");
        years = input.nextInt();
        
        System.out.println("Population after " + years + " years will be: " + (population+(years*count)));
    }
}
