package Integers;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("3 xonali son kiriting=");
        int a=sc.nextInt();
        System.out.println("Raqamlari yig'indisi="+(a%10+a/10%10+a/100%10));
    }
}
