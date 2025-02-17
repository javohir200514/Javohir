package fors;

import java.util.Scanner;


public class For11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(n-1+i)*(n-1+i);
        }
        System.out.print("value of sum :"+sum);
    }
}
