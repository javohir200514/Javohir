package ifs;

import java.util.Scanner;

public class IfElse29 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of integer number:");
        int a=sc.nextInt();
        if(a>0&&a%2!=0) System.out.println("positive odd number:");
        else if(a<0&&a%2==0) System.out.println("negative even number:");
        else System.out.println("zero number:");
    }
}
