package IfElse;

import java.util.Scanner;

public class IfElse26 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        double y;
        if(x<=0){
            y=-x;
        }
        else if(x>0&&2>x) y=-x*x;
        else y=4;
        System.out.println("value of y:"+y);
    }
}
