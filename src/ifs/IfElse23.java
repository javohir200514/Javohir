package ifs;

import java.util.Scanner;

public class IfElse23 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1-vertic koordinota points:");
        int x1=sc.nextInt(),y1=sc.nextInt();
        System.out.println("Enter 2-vertic koordinota points:");
        int x2=sc.nextInt(),y2=sc.nextInt();
        System.out.println("Enter 3-vertic koordinota points:");
        int x3=sc.nextInt(),y3=sc.nextInt(),x4,y4;
        if(x1==x2) x4=x3;
        else if(x2==x3) x4=x1;
        else x4=x2;
        if(y1==y2) y4=y3;
        else if(y2==y3) y4=y1;
        else y4=y2;
        System.out.println("4-vertic koordinota points:"+"("+x4+","+y4+")");
    }
}
