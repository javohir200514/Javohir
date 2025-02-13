package IfElse;

import java.util.Scanner;

public class IfElse25 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        double y;
        if(x<-2||x>2){
            y=2*x;
        }
        else y=-3*x;
        System.out.println("value of y:"+y);
    }
}
