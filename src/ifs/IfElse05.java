package ifs;

import java.util.Scanner;

public class IfElse05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter three integer numbers:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),count=0,count1=0;
        if(a>0){
            count++;
        }else count1++;
        if(b>0){
            count++;
        }else count1++;
        if(c>0){
            count++;
        }else count1++;
        System.out.println("amount of Positive integer: "+count);
        System.out.println("amount of Negative integer: "+count1);
    }
}
