package DAY_4;

import java.util.Scanner;

public class code2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        boolean isPalindrome = true;
        
        int start = 0;
        int end = str.length()-1;
    
        //System.out.println(new StringBuilder(str).reverse());

        while (start < end) 
        {
            if(str.charAt(start) != str.charAt(end))
            {
                isPalindrome = false;
            }   
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is not a Palindrome.");
        }
    }
}
