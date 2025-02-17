package fors;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter a:");
        int a=sc.nextInt();
        System.out.println("Entter b:");
        int b=sc.nextInt();
        int count=0;
        for(int i=b;i>=a;i--){
            System.out.print(i+" ");
            count++;
        }
        System.out.println("a and b between numbers:"+count);
    }
}
