package DAY_4;

import java.util.Scanner;

public class code5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        /* String[] words = str.trim().split(" ");

        String finalWord = "";
        for(int i=0;i<words.length;i++)
        {
            finalWord = finalWord + words[i];
        }
        System.out.println(finalWord); */

        str = str.replaceAll(" ", "");
        System.out.println(str);
    }
}
