package DAY_3;

import java.util.Scanner;

public class code9 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        /* for(int i=0;i<n-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                System.out.print("Array is not Sorted.");
                break;
            }
            if(i == n-2)
            {
                System.out.println("Array is Sorted.");
            }
        } */

        boolean isSorted = true;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }
        }

        if(isSorted) {
            System.out.println("Array is Sorted.");
        }
        else
        {
            System.out.println("Array is not sorted.");
        }

    }
}
