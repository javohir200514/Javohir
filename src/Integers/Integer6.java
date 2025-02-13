package Integers;

import java.util.Scanner;

public class Integer6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("2 xonali son kiriting=");
        int a=sc.nextInt();
        System.out.println("O'nlar xonasi=" + a / 10 % 10);
        System.out.println("Birlar xonasi="+a%10);

    }
}
