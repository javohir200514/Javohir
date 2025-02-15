package ifs;

import java.util.Scanner;

public class IfElse15 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three number:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),min,max,middle;
        if(a<b&&a<c) min=a;
        else if(b<a&&b<c) min = b;
        else min = c;
        if(a>b&&a > c) max=a;
        else if(b>a&&b>c) max = b;
        else max = c;
        middle=a+b+c-min-max;
        System.out.println(" sum of two largest number value:"+(middle+max));
    }
}
