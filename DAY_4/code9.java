package DAY_4;

import java.util.Arrays;
import java.util.Scanner;

public class code9 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String str2 = sc.nextLine();

        char[] string1 = str1.toCharArray();
        Arrays.sort(string1);
        char[] string2 = str2.toCharArray();
        Arrays.sort(string2);
        
        if(string2.equals(string2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Angram");
        }
    }
}
