package begins;

import java.util.Scanner;

public class Begin13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Aylana radiuslarini kiriting=");
        int R1=sc.nextInt(),R2=sc.nextInt();
        double S1=3.14*R1,S2=3.14*R2;
        double S3=3.14*(R1-R2);
        System.out.println("S1="+S1+"  "+"S2="+S2+"   "+"S3="+S3);
    }
}
