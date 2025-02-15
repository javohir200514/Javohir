package ifs;

import java.util.Scanner;

public class IfElse12 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three number:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),min;
        if(a<b&&a<c) min=a;
        else if(b<a&&b<c) {
            min = b;
        }
        else {
            min = c;
        }
        System.out.print("minimum of value:"+min);
    }
}
