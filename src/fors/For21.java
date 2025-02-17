package fors;

import java.util.Scanner;


public class For21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        double factorial=1,sum=0;
        for(int i=1;i<=n;i++) {
            sum+=1.0/factorial;
            factorial*=i;
        }
        System.out.println("sum="+sum);
    }
}
