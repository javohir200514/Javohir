package IfElse;

import java.util.Scanner;

public class IfElse9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two real number:");
        int A=sc.nextInt(),B=sc.nextInt(),min,max;
        if(B>A) max=B;
        else max=A;
        if(A>B) min=B;
        else min=A;
        A=min;
        B=max;
        System.out.println("A="+min+"    "+"B="+B);
    }
}
