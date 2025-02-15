package ifs;

import java.util.Scanner;

import static java.lang.Math.sin;

public class IfElse24 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        double y;
        if(x>0){
            y=2*sin(x);
        }
        else y=6-x;
        System.out.println("value of y:"+y);
    }
}
