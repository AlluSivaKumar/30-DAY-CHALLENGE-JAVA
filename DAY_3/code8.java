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

        if(n < 2) {
            System.out.println("There is no second max element.");
            return;
        }

        int max1=0,max2=0;

        if(arr[0] > arr[1])
        {
            max1 = arr[0];
            max2 = arr[1];
        }
        else
        {
            max1 = arr[1];
            max2 = arr[0];
        }
        
        for(int i=2;i<n;i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1)
            {
                max2 = arr[i];
            }
        }

        System.out.println("Second Largest element is : " + max2);
    }
}
