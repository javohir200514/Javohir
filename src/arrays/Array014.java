package arrays;

import java.util.Scanner;

public class Array014 {
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
        System.out.print("even index:");
        for(int i=1;i<=n;i+=2){
            System.out.print(a[i]+" ");
        }
        System.out.print("Odd index:");
        for(int i=0;i<=n;i+=2){
            System.out.print(a[i]+" ");
        }
    }
}
