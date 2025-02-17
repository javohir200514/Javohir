package fors;

import java.util.Scanner;

public class For07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter a::");
        int a=sc.nextInt();
        System.out.println("Entter b::");
        int b=sc.nextInt();
        int sum=0;
        for(double i=a;i<=b;i++){
            sum+=i;
        }
        System.out.println("sum of numbers in range a to b:"+sum);
    }
}
