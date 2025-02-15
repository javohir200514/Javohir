package booleans;

import java.util.Scanner;

public class Boolean18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" 3 ta son kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=a==b&&b==c||a==b&&b!=c||a!=b&&b==c||a==c&&c!=b;
        System.out.println(n);
    }
}
