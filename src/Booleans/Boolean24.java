package Booleans;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        double D=pow(B,2)-4*A*C;
        boolean n=D>=0;
        System.out.println(n);
    }
}
