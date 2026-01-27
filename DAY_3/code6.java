package DAY_3;

import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("How how many elements in the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element : ");
        int tar = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i] == tar)
            {
                System.out.println("Item found at : " + i);
                break;
            }
        }
    }
}
