package DAY_3;

import java.util.Arrays;
import java.util.Scanner;

public class code7 {
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

        //INPLACE SORTING ALGORITHM 
        
        int start = 0;
        int end = arr.length-1;

        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("REVERSED ARRAY");
        System.out.println(Arrays.toString(arr));
    }
}
