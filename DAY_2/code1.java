package DAY_2;

import java.util.Scanner;

public class code1
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            int prod = n*i;
            System.out.println(n + " * " + i + " = " + prod);
        }
    }
}
