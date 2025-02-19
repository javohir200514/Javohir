package arrays;

import java.util.Scanner;

public class Array005 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        double [] array=new double[n];
        array[1]=1;
        array[2]=1;

        for(int i=2;i<n;i++){
            array[i]=array[i-1]+array[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
