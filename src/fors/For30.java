package fors;

import java.util.Scanner;

import static java.lang.Math.sin;


public class For30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter A:");
        int a=sc.nextInt();
        System.out.println("Entter B:");
        int b=sc.nextInt();
        double step=b/(double)(b/a),function;
        System.out.println(step);
        for(double i=a;i<=b;i+=step) {
            function=1-sin(i);
            System.out.println(function+" ");
        }
    }
}
