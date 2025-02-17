package whiles;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt(),count=0;
        while(a>b){
            a-=b;
            count++;
        }
        System.out.println("Length of unused part of A:"+count);
    }
}
