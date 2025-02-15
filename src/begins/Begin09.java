package begins;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Begin09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a and b entery=");
        int a=sc.nextInt(),b=sc.nextInt();
        double orta_geometrik;
        orta_geometrik=sqrt(a*b);
        System.out.println("O'rta geometrigi="+orta_geometrik);
    }
}
