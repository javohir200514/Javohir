package IfElse;

import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Erter integer number:");
        int number=sc.nextInt();
        if(number>0){
            System.out.println(++number);
        }else if(number<0){
            System.out.println(number-2);
        }
        else{
            number=10;
            System.out.println(number);
        }
    }
}
