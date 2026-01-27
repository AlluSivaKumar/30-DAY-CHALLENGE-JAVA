package DAY_2;

import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        EvenOddCount(n);
    }

    public static void EvenOddCount(int n){
        int even = 0;
        int odd = 0;

        while (n > 0) 
        {
            if(n % 2 == 0) {
                even++;
            }
            else
            {
                odd++;
            }
            n = n /10;
        }

        System.out.println("Even digits is : " + even);
        System.out.println("Odd digits is : " + odd);

    }
}
