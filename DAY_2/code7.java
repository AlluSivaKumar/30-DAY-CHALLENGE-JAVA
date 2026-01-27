package DAY_2;

import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int base = sc.nextInt();
        System.out.print("Enter exponent number : ");
        int exponent = sc.nextInt();

        int power = power(base, exponent);
        System.out.println(exponent + " to the Power of " + base + " is : " + power);
    }

    public static int power(int b , int e)
    {
        int pow = 1;
        for(int i=0;i<e;i++)
        {
            pow = pow * b;
        }
        return pow;
    }
}
