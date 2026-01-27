import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource" })
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int count  = 0;
        if(n == 0)
        {
            count = 1;
        }
        else
        {
            if(n  < 0)
            {
                n = n * -1;
            }
            while (n > 0) 
            {
                count++;
                n = n/10;
            }
        }
        System.out.println(count);
    }
}
