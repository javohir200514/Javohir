package begins;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A1,B1 va C1 kofetsientlarni kiriting=");
        double A1=sc.nextDouble();
        double B1=sc.nextDouble();
        double C1=sc.nextDouble();
        System.out.println("A2,B2 va C2 kofetsientlarni kiriting=");
        double A2=sc.nextDouble();
        double B2=sc.nextDouble();
        double C2=sc.nextDouble();
        double D=A1*B2-A2*B1;
        double x=(C1*B2-C2*B1)/D,y=(A1*C2-A2*C1)/D;
        System.out.println("x=" + x);
        System.out.println("y="+y);
    }
}
