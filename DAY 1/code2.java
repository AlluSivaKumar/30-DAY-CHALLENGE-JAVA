import java.util.Scanner;

public class code2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Numer : ");
        int n = sc.nextInt();

        EvenOrOdd(n);
    }

    public static void EvenOrOdd(int n)
    {
        if(n%2 == 0)
        {
            System.out.println(n + " is Even");
        }
        else
        {
            System.out.println(n + " is Odd");
        }
    }
}
