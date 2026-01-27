package DAY_3;

import java.util.Scanner;

public class code4 {
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

        int sum = 0;

        for(int i=0;i<n;i++)
        {
            sum = sum + arr[i];
        }

        float avg = sum/n;

        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + avg);
    }
}
