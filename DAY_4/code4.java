package DAY_4;

import java.util.Scanner;

public class code4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String[] words = str.trim().split(" ");
        System.out.println(words.length);
    }
}
