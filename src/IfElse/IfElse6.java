package IfElse;

import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int number1=sc.nextInt(),number2=sc.nextInt(),max;
        if(number1>number2) max=number1;
        else max=number2;
        System.out.println("larger value:"+max);
    }
}
