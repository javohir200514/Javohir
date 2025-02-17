package fors;

import java.util.Scanner;


public class For15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        System.out.println("Entter A:");
        int a=sc.nextInt();
        int pow=1;
        for(int i=1;i<=n;i++) {
            pow*=a;
        }
        System.out.print(" "+pow);
    }
}
