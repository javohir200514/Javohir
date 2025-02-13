package IfElse;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter three integer numbers:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),count=0;
        if(a>0){
            count++;
        }
        if(b>0){
            count++;
        }
        if(c>0){
            count++;
        }
        System.out.println("amount of Positive integer: "+count);
    }
}
