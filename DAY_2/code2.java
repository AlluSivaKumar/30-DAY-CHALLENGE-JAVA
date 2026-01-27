package DAY_2;

import java.util.Scanner;

public class code2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is " + fact(n));
    }

    public static int fact(int n)
    {
        int factorial = 1;
        for(int i=n;i>=1;i--)
        {
            factorial = factorial * i;
        }

        return factorial;
    }
}
