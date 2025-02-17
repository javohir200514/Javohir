package fors;

import java.util.Scanner;


public class For34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        double a1=1;
        double a2=2;
        double k;
        System.out.println(a1);
        System.out.println(a2);
        for(int i=3;i<=n;i++) {
            k=(double)((a1+2*a2)/3);
            System.out.println(k);
            a1=a2;
            a2=k;
        }
    }
}
