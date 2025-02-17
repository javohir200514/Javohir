package fors;

import java.util.Scanner;

import static java.lang.Math.pow;

public class For09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter a::");
        int a=sc.nextInt();
        System.out.println("Entter b::");
        int b=sc.nextInt();
        int sum=0;
        for(double i=a;i<=b;i++){
            sum+=pow(i,2);
        }
        System.out.println("sum of squares of numbers in range a to b:"+sum);
    }
}
