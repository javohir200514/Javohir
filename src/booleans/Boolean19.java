package booleans;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" 3 ta son kiriting=");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        boolean n=(a == -b) || (a == -c) || (b == -c);
        System.out.println(n);
    }
}
