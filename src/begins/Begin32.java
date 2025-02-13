package begins;

import java.util.Scanner;

public class Begin32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Konfet og'irligini kiriting=");
        double X=sc.nextDouble();
        System.out.println("Konfet narxini kiriting=");
        double A=sc.nextDouble();
        double narx=A/X;
        System.out.println("Nechi kg kanfet olishingizni kiriting=");
        double Y=sc.nextDouble();
        System.out.println("1 kg konfet narxi=" + narx);
        System.out.println(Y+" "+"kg konfet narxi "+Y*narx);
    }
}
