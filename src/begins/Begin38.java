package begins;

import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A ni kiriting");
        double A=sc.nextDouble();
        System.out.println("B ni kiriting");
        double B=sc.nextDouble();
        double x;
        x=-B/A;
        System.out.println("x=" + x);
    }
}
