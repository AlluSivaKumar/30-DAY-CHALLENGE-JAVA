import java.util.Scanner;

public class code5 {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(reverse(num));
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
