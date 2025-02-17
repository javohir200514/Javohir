package fors;

import java.util.Scanner;

public class For02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter a:");
        int a=sc.nextInt();
        System.out.println("Entter b:");
        int b=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
            count++;
        }
        System.out.println("a and b between numbers:"+count);
    }
}
