package ifs;

import java.util.Scanner;

public class IfElse27 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        int y;
        if(x<0){
            y=0;
        }
        else if(x%2==0) y=1;
        else y=-1;
        System.out.println("value of y:"+y);
    }
}
