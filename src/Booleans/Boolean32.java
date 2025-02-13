package Booleans;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" uchburchak tomonlarini  kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=(pow(a,2)+pow(b,2))==pow(c,2);
        System.out.println(n);
    }
}
