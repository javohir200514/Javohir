package Booleans;

import java.util.Scanner;

public class Boolean30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" uchburchak tomonlarini kiriting kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=a==b&&b==c;
        System.out.println(n);
    }
}
