package DAY_2;

import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println(n + " is Strong number : " + isStrong(n));
    }
    public static boolean isStrong(int n) {
        int temp = n;
        int strong = 0;
        while (n > 0)  
        {
            int rem = n % 10;
            strong = strong + fact(rem);
            n = n / 10;
        }

        if(temp == strong) {
            return true;
        }
        return false;
    }

    public static int fact(int n){
        int factotial = 1;
        for(int i=1;i<=n;i++){
            factotial = factotial * i;
        }
        return factotial;
    }
}
