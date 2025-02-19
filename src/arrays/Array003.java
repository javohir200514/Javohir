package arrays;

import java.util.Scanner;

public class Array003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter A:");
        double a=sc.nextDouble();
        System.out.println("Enter D:");
        double d=sc.nextDouble();
        double [] array=new double[n];
        for(int i=0;i<n;i++){
            array[i]=a+i*d;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
