package DAY_3;

import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("How how many elements in the Array : ");
        int n = sc.nextInt();

        if(n < 2) {
            System.out.println("Second Largest Element Does not present.");
        }

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int max  = arr[0];

    }
}
