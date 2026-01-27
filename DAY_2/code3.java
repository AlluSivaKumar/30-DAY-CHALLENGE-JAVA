package DAY_2;

import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("The sum of digits of " + n + " is " + DigitsSum(n));
    }

    public static int DigitsSum(int n)
    {
        int sum = 0;

        while (n > 0) 
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }

        return sum;
    }
}
