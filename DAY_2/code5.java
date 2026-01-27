package DAY_2;

import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Numer : ");
        int n = sc.nextInt();

        System.out.print("The prime numbers between 1 and " + n + " is : ");
        for(int i=0;i<n;i++)
        {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        int i = 2;
        while (i*i <= n) 
        {
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
