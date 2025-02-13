package Integers;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Kunni raqamini kiriting:");
        int K=sc.nextInt();
        int n=K%7;
        System.out.println(n);
    }
}
