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