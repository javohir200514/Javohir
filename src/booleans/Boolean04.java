package booleans;

import java.util.Scanner;

public class Boolean04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A va B larni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A>2&&B<=3;
        System.out.println(n);
    }
}
