package begins;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Begin14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ayalana uzunligini kiriting=");
        double L=sc.nextDouble();
        System.out.println(" ");
        double R=L/(2*3.14);
        double S=3.14*pow(R,2);
        System.out.println("R="+R);
        System.out.println("S="+S);
    }
}
