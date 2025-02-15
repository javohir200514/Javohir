package booleans;

import java.util.Scanner;

public class Boolean28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x va y kordinotalarni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        boolean n=x>0&&y>0||x<0&&y<0;
        System.out.println(n);
    }
}
