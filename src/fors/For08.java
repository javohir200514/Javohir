package fors;

import java.util.Scanner;

public class For08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter a::");
        int a=sc.nextInt();
        System.out.println("Entter b::");
        int b=sc.nextInt();
        int sum=1;
        for(double i=a;i<=b;i++){
            sum*=i;
        }
        System.out.println("product of numbers in range a to b:"+sum);
    }
}
