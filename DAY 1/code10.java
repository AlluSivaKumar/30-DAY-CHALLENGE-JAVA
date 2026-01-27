import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter any two numbers you want to operate : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter the opeator '+' for addition \n '-' for subraction \n '*' for Multiplication \n '/' for division : ");
        String op = sc.next();

        switch (op) {
            case "+":
                int c =  a + b;
                System.out.println("Addition : " + c);
                break;
            case "-":
                int d =  a - b;
                System.out.println("Subraction : " + d);
                break;
            case "*":
                int e =  a * b;
                System.out.println("Multiplication : " + e);
                break;
            case "/":
                int f =  a / b;
                System.out.println("Division : " + f);
                break; 
            default:
                break;
        }
    }
}
