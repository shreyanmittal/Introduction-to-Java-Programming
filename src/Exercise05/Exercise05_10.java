/*
    @author: Abhishek Kayasth
    Id- 20CS025
    email - 20cs025@charusat.edu.in
*/
/*
|------------------------------------Exercise05_10------------------------------------|
    (Use the isPrime Method) Listing 5.7, PrimeNumberMethod.java, provides the
    isPrime(int number) method for testing whether a number is prime. Use this
    method to find the number of prime numbers less than 10000.
*/
package Exercise05;

public class Exercise05_10 
{
    public static void main(String[] args) 
    {
        // Print output
        System.out.println("Number of prime numbers less than 10000: " + CountPrime(10000));
    }

    // Counts Prime numbers less than n
    static int CountPrime(int n)
    {
        int count = 0; // To store count
        for(int i = 2; i <= n; i++) // loop from i = 2 because 1 is neither prime or complex
        {
            // Check if it is prime 
            if(isPrime(i))
            {
                count++; // If it is prime raise count
            }
        }

        return count; // return count
    }

    // Returns true if it is prime number
    static boolean isPrime(int number)
    {
        // Loop through and check if it is dividable with divisors
        for(int divisor = 2; divisor <= number / 2; divisor++)
        {
            if(number % divisor == 0)
                return false; // if it can be divided return false
        }

        return true; // if it cannot be divided return true
    }
}
