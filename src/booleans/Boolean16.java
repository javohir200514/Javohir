package booleans;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Son kiriting=");
        int a=sc.nextInt();
        boolean n=a>=10&&a<=99&&a%2==0;
        System.out.println(n);
    }
}
