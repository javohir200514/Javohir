package fors;

import java.util.Scanner;

import static java.lang.Math.sin;


public class For31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        int a_0=2;
        double a_k,a_k_1;
        a_k_1=a_0;
        for(int i=1;i<=n;i++) {
           a_k=2+1/a_k_1;
            System.out.println(a_k);
           a_k_1=a_k;
        }
    }
}
