package DAY_2;

import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ant two positive numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The GCD is : " + gcd(a,b));
    }

    public static int gcd(int a , int b)
    {
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int gcd = a;
        while (gcd > 0) 
        {
            if(a % gcd == 0 && b % gcd == 0)
            {
                return gcd;
            }
            gcd--;
        }

        return 0;
    }
}
