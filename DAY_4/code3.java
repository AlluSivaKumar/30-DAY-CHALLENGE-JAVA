package DAY_4;

import java.util.Scanner;

public class code3 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        str = str.toLowerCase();
        int vowels = 0;
        int consonats = 0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowels++;
            }
            else
            {
                consonats++;
            }
        }

        System.out.println("Total vowes is : " + vowels);
        System.out.println("Total Consonants is : " + consonats);
    }
}
