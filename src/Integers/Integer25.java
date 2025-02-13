package Integers;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kunni raqamini kiriting:");
        int K=sc.nextInt();
        int n=(K+3)%7;
        System.out.println(n);
    }
}
