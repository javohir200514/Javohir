package ifs;

import java.util.Scanner;

public class IfElse30 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number in the range 1 to 999::");
        int a=sc.nextInt();
        if(a>=1&&a<10&&a%2==0) System.out.println("one digit even number");
        else if(a>=10&&a<100&&a%2==0) System.out.println("two digit even number");
        else if(a>=100&&a<1000&&a%2==0) System.out.println("three digit even number");
        else if(a>=1&&a<10) System.out.println("one digit odd number");
        else if(a>=10&&a<100) System.out.println("two digit odd number");
        else if(a>=100&&a<1000) System.out.println("three digit odd number");
    }
}
