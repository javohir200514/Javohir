package begins;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Shokolod umumiy og'rligini kiriting=");
        double X=sc.nextDouble();
        System.out.println("Shokolod umumiy narxini kiriting=");
        double A=sc.nextDouble();
        System.out.println("Konfet umumiy og'rligini kiriting=");
        double Y=sc.nextDouble();
        System.out.println("Konfet umumiy narxini kiriting=");
        double B=sc.nextDouble();
        double narx_shokolod = A / X, narx_konfet = B / Y;
        System.out.println("1 kg shokolod 1 kg konfetdan "+(narx_shokolod-narx_konfet)+" so'm qimmat turadi");

    }
}
