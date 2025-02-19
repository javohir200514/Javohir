package arrays;

import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=(2*i+1);
        }
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }

    }
}
