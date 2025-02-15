package booleans;

import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x1 va y1 larni kiriting=");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("x2 va y2 larni kiriting=");
        int x2=sc.nextInt(),y2=sc.nextInt();
        boolean n=(x1+y1)%2==0&&(x2+y2)%2==0||(x1+y1)%2!=0&&(x2+y2)%2!=0;
        System.out.println(n);
    }
}
