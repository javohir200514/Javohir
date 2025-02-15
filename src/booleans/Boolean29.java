package booleans;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x va y kordinotalarni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        System.out.println("x1 va y1 kordinotalarni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 kordinotalarni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=(x2>x&&x>x1)&&(y1>y&&y>y2);
        System.out.println(n);
    }
}
