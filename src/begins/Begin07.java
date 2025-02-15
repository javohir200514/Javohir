package begins;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Begin07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Doira radiusini kiriting=");
        int r=sc.nextInt();
        double L,S;
        L=2*3.14*r;
        S=3.14*pow(r,2);
        System.out.print("L="+L+"  "+"S="+S);
    }
}
