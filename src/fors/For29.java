package fors;

import java.util.Scanner;


public class For29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter A:");
        int a=sc.nextInt();
        System.out.println("Entter B:");
        int b=sc.nextInt();
        double step=(double)(b/a);
        for(double i=a;i<=b;i+=step) {
            System.out.println(" "+i);
        }
    }
}
