import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        @SuppressWarnings("unused")
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        else if(n == 2)
        {
            return true;
        }
        else
        {
            int i =2;

            while (i*i <= n) 
            {
                if(n % i == 0)
                {
                    return false;
                } 
                i++;  
            }
            return true;
        }

    }
}
