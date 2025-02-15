package booleans;

import java.util.Scanner;

public class Boolean05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A ni kiriting=");
        int A=sc.nextInt(),B=sc.nextInt();
        boolean n=A>=0||B<-2;
        System.out.println(n);

    }
}
