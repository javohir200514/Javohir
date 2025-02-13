package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Qayiq tezligini kiriting=");
        double V=sc.nextDouble();
        System.out.println("Oqim tezligini kiriting=");
        double U=sc.nextDouble();
        System.out.println("Qayiqni oqim bo'ylab yurgan vaqtini  kiriting=");
        double T1=sc.nextDouble();
        System.out.println("Oqimga qarshi yurgan vaqtini  kiriting=");
        double T2=sc.nextDouble();
        double S=(U+V)*T1+(V-U)*T2;
        System.out.println("S="+S);
    }
}
