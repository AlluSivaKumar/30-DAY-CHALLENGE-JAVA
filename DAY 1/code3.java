import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum is : " + sum);
    }
}
