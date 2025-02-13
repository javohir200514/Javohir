package Booleans;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Boolean38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=x1+y1==x2+y2||abs(x2+y2-x1-y1)%2==0;
        System.out.println(n);
    }
}
