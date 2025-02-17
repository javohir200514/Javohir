package whiles;

import java.util.Scanner;

import static java.lang.Math.abs;

public class While30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        System.out.println("Enter C:");
        int c=sc.nextInt(),count1=0,count2=0;
        while(a>=c){
             a-=c;
             count1++;
        }
        while(b>=c){
            b-=c;
            count2++;
        }
        System.out.println(count1*count2);

    }
}




