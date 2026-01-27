package DAY_2;

import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int temp = n;
        int count = Digits(n);
        
        int armNumber = 0;

        
        while (temp > 0) 
        {
            int rem = temp % 10;
            armNumber = armNumber + power(rem, count);
            temp = temp/10;
        }
        
        if(armNumber == n)
        {
            System.out.println(n + " is ArmStrong.");
        }
        else
        {
            System.out.println(n + " is not ArmStrong.");
        }
    }

    public static int power(int n, int b)
    {
        int pow = 1;
        for(int i=0;i<b;i++)
        {
            pow = pow * n;
        }
        return pow;
    }

    public static int Digits(int n)
    {
        int count = 0;

        while (n > 0) 
        {
            count++;
            n = n / 10;
        }

        return count;
    }
}
