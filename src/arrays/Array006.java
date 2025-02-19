package arrays;

import java.util.Scanner;

public class Array006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        int [] array=new int[n];
        array[0]=a;
        array[1]=b;
        int sum=a+b;
        for(int i=2;i<n;i++){
            array[i]=sum;
            sum+=array[i];
        }
        for (int i =0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
