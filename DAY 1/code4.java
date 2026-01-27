import java.util.Scanner;

public class code4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.println(a + " is Grater");
        }
        else if (b > c &&  b > a) {
            System.out.println(b + " is Greater");
        } else {
            System.out.println(c + " is Greater");
        }
    }
}
