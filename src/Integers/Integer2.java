package Integers;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Og'irlikni kiriting=");
        int M=sc.nextInt();
        int tonna=M/1000;
        System.out.println(M+" kg"+"--->"+" "+tonna+" tonna");
    }
}
