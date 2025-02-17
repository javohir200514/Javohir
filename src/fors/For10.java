package fors;

import java.util.Scanner;


public class For10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=(double)(1.0/i);
        }
        System.out.print("value of sum :"+sum);
    }
}
