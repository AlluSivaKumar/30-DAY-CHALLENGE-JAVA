package DAY_3;

import java.util.Scanner;

public class code5 {
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

        int even = 0;
        int odd = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 == 0){
                even++;
            }
            else
            {
                odd++;
            }
        }

        System.out.println("Even Numbers : " + even);
        System.out.println("Odd Numbers : " + odd);
    }
}
