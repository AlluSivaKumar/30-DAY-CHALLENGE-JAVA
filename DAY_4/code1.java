package DAY_4;

import java.util.Scanner;

public class code1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String revStr = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr = revStr + str.charAt(i);
        }
        System.out.println(revStr);
    }
}
