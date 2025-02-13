package Integers;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Kunni raqamini kiriting:");
        int K=sc.nextInt();
        System.out.println("Kunni kiriting:");
        int N=sc.nextInt();
        int n=(K+N-2)%7+1;
        System.out.println(n);
    }
}
