package fors;

import java.util.Scanner;


public class For17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        System.out.println("Entter A:");
        double a=sc.nextInt();
        double pow=1,sum=0;
        for(int i=1;i<=n;i++) {
            pow*=a;
            sum+=pow;

            System.out.println(i+"-power -----> "+pow);
        }
        System.out.println("sum="+sum);
    }
}
