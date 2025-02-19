package arrays;

import java.util.Scanner;

public class Array002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] array=new int[n];
        int pow=1;
        for(int i=0;i<n;i++){
            pow*=2;
            array[i]=pow;
        }
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }

    }
}
