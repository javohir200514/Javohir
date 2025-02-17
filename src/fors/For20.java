package fors;

import java.util.Scanner;


public class For20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        int factorial=1,sum=0;
        for(int i=1;i<=n;i++) {
            factorial*=i;
            sum+=factorial;
        }
        System.out.println("sum="+sum);
    }
}
