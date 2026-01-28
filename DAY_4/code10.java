package DAY_4;

import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String ans = "";

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
            {
                ans = ans + Character.toUpperCase(ch);
            }
            else
            {
                ans = ans + Character.toLowerCase(ch);
            }
        }
        System.out.println(ans);
    }
}
