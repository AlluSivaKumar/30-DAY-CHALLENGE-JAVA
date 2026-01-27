import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        if(n == reverse(n))
        {
            System.out.println(n + " is a Palindrome");
        }
        else
        {
            System.out.println(n + " is not a Palindrome");
        }
    }

    public static int reverse(int n)
    {
        int num = n;
        int rev = 0;

        while (num > 0) 
        {
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num /10;
        }

        return rev;
    }
}
