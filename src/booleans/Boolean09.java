package booleans;

import java.util.Scanner;

public class Boolean09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A va B sonlarni kiriting:");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A%2!=0||B%2!=0;
        System.out.println(n);
    }
}
