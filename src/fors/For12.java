package fors;

import java.util.Scanner;


public class For12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        double k=1;
        for(double i=1.1;i<=n;i+=0.1){
            k*=i;
        }
        System.out.print("value of product :"+k);
    }
}
