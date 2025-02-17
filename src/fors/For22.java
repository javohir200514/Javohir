package fors;

import java.util.Scanner;


public class For22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        System.out.println("Entter X:");
        int x=sc.nextInt();
        double factorial=1,sum=0,pow=1;
        for(int i=1;i<=n;i++) {
            sum+=pow/factorial;
            pow*=x;
            factorial*=i;
        }
        System.out.println("sum="+sum);
    }
}
