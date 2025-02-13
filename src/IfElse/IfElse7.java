package IfElse;

import java.util.Scanner;

public class IfElse7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int number1=sc.nextInt(),number2=sc.nextInt(),min;
        if(number1>number2) min=number2;
        else min=number1;
        System.out.println("Smaller value:"+min);
    }
}
