package booleans;

import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("3 xonali son kiriting");
        int son = sc.nextInt(), a = son % 10, b = son / 10 % 10, c = son / 100 % 10;
        boolean n=a>b&&b>c||a<b&&b<c;
        System.out.println(n);
    }
}
