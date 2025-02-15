package booleans;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x va y larni kiriting=");
        int x=sc.nextInt(),y=sc.nextInt();
        boolean n=(x+y)%2==0;
        System.out.println(n);
    }
}
