package Booleans;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("3 xonali son kiriting=");
        int n=sc.nextInt(),a=n%10,c=n/100%10;
        boolean b=a==c;
        System.out.println(b);
    }
}
