package booleans;

import java.util.Scanner;

public class Boolean12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A>0&&B>0&&C>0;
        System.out.println(n);
    }
}
