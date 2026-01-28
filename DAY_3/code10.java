package DAY_3;

import java.util.Scanner;

public class code10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements present in the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter elements in the Array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        //Default value of boolean array is false
       boolean[] Visited = new boolean[n];
       System.out.println("item : count");

       for(int i=0;i<n;i++)
       {
            if(Visited[i])
            {
                continue;
            }

            int count = 1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    Visited[j] = true;
                }
            }
            System.out.println(arr[i] + " : " + count);
       }

    }
}
