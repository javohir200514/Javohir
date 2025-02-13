package Integers;

import java.util.Scanner;

public class Integer27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kunni raqamini kiriting:");
        int K=sc.nextInt();
        int n=(K+5)%7+1;
        System.out.println(n);
    }
}
