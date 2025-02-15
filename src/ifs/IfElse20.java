package ifs;

import java.util.Scanner;

import static java.lang.Math.abs;

public class IfElse20 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of three number:");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        if(abs(A-B)<abs(A-C)){
            System.out.println("B point and between of them  distanse:"+abs(A-B));
        }
        else System.out.println("C point and between of them  distanse:"+abs(A-C));
    }
}
