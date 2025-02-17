package fors;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter price of 1 kg sweet::");
        int a=sc.nextInt();
        for(double i=0.1;i<=1;i+=0.1){
            System.out.println(i+" kg -->"+(i*a)+" ");
        }
    }
}
