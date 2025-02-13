package Booleans;

import java.util.Scanner;

public class Boolean6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        boolean n=A<=B&&B<=C;
        System.out.println(n);
    }
}
