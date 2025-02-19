package arrays;

import java.util.Scanner;

public class Array012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int [] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=2;i<n;i+=2){
            System.out.println(a[i]+" ");
        }
    }
}
