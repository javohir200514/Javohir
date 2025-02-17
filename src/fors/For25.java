package fors;

import java.util.Scanner;


public class For25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        System.out.println("Entter X:");
        int x=sc.nextInt();
        double sum=0,pow=1.0,a=1;
        for(int i=1;i<=n;i++) {
            pow*=x;
            sum+=a*pow/i;
            a=-a;

        }
        System.out.println("sum="+sum);
    }
}
