package booleans;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" uchburchak tomonlarini  kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=a+b>c&&b+c>a&&a+c>b;
        System.out.println(n);
    }
}
