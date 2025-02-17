package whiles;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        while(a>b){
            a-=b;
        }
        System.out.println("Length of unused part of A:"+a);
    }
}
