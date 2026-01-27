package DAY_3;

import java.util.Scanner;

public class code3 {
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

        int min = arr[0];
        for(int i=1;i<n;i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        System.out.println("Minimum element of the array : " + min);
    }
}
