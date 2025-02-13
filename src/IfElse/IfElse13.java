package IfElse;

import java.util.Scanner;

public class IfElse13 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three number:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),min,max;
        if(a<b&&a<c) min=a;
        else if(b<a&&b<c) min = b;
        else min = c;
        if(a>b&&a > c) max=a;
        else if(b>a&&b>c) max = b;
        else max = c;
        System.out.print("between minimum and maxsimum  value :"+(a+b+c-min-max));
    }
}
