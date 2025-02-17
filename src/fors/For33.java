package fors;

import java.util.Scanner;


public class For33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        int f_k;
        int f_k_2=1,f_k_1=1;
        System.out.println(f_k_1);
        System.out.println(f_k_2);
        for(int i=3;i<=n;i++) {
            f_k=f_k_2+f_k_1;
            f_k_1=f_k_2; f_k_2=f_k;
            System.out.println(f_k);
        }
    }
}
