package DAY_4;

import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        int n = str.length();
        boolean[] Visited = new boolean[n];//false

        System.out.println("Character : Visited");
        for(int i=0;i<n;i++)
        {
            if(Visited[i])
            {
                continue;
            }

            int count = 1;
            for(int j=i+1;j<n;j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    Visited[j] = true;
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
