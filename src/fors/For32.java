package fors;

import java.util.Scanner;


public class For32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        int a_0=1;
        double a_k,a_k_1;
        a_k_1=a_0;
        for(int i=1;i<=n;i++) {
           a_k=(a_k_1+1)/i;
            System.out.println(a_k);
           a_k_1=a_k;
        }
    }
}
