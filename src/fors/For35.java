package fors;

import java.util.Scanner;


public class For35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        double a1=1;
        double a2=2;
        double a3=3;
        double k;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        for(int i=4;i<=n;i++) {
            k=(a1+a2-2*a3);
            System.out.println(k);
            a1=a2;
            a2=a3;
            a3=k;
        }
    }
}
