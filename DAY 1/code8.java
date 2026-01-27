import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        fibo(n);
    }

    public static void fibo(int n)
    {
        int a = 0;
        if(n >= 0)
        {
            System.out.print( a + " ");
        }

        int b = 1;
        if (n > 1) {
            System.out.print( b + " ");
        }

        int i = 2;
        while (i < n) {
            int c = a + b;
            System.out.print( c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
