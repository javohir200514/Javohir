package begins;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Begin28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A ni kiriting=");
        int A=sc.nextInt();
        System.out.println(pow(A, 2));
        System.out.println(pow(A, 3));
        System.out.println(pow(A, 5));
        System.out.println(pow(A, 10));
        System.out.println(pow(A, 15));
    }
}
