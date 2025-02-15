package ifs;

import java.util.Scanner;

public class IfElse18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of three number:");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        if(A==B){
            System.out.println(3);
        }
        else if(A==C){
            System.out.println(2);
        }
        else System.out.println(1);
    }
}
