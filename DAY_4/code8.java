package DAY_4;

import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        System.out.print("Which character you want to replace : ");
        String ch = sc.next();
        System.out.print("Replacable character : ");
        String anotherCh = sc.next();

        String result = str.replaceAll(ch, anotherCh);;
        System.out.println("String after replaceing the character : " + result);
        
    }
}
