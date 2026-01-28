package DAY_4;

import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();


        char[] string = str.toCharArray();

        boolean[] visited = new boolean[str.length()];

        for(int i=0;i<string.length;i++)
        {
            if(visited[i])
            {
                continue;
            }

            int count = 1;

            for(int j=i+1;j<string.length;j++)
            {
                if(string[i] == string[j])
                {
                    visited[j] = true;
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.println("The first Non repeating character is : " + string[i]);
                break;
            }

        }
    }
}
