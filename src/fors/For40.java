package fors;

import java.util.Scanner;


public class For40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter A:");
        int a=sc.nextInt();
        System.out.println("Entter B:");
        int b=sc.nextInt(),count=1;
        for(int i=a;i<=b;i++) {
            for(int j=1;j<=count;j++){
                System.out.print(i);
            }
            System.out.println();
            count++;
        }
    }
}
