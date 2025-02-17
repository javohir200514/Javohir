package fors;

import java.util.Scanner;

public class For06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter price of 1 kg sweet::");
        int a=sc.nextInt();
        for(double i=1.2;i<=2.0;i+=0.2){
            System.out.println(i+" kg -->"+(i*a)+" ");
        }
    }
}
