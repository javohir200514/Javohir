package arrays;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.round;

public class Array011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter K:");
        int k=sc.nextInt();
        int [] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=k;i<n;i+=k){
            System.out.println(a[i]+" ");
        }
    }
}
