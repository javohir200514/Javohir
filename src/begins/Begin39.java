package begins;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Begin39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A,B va C kofetsientlarni kiriting=");
        double A=sc.nextDouble();
        double B=sc.nextDouble();
        double C=sc.nextDouble();
        double diskremant=sqrt(pow(B,2)-4*A*C);
        double x1=(-B+sqrt(diskremant))/2,x2=(-B-sqrt(diskremant))/2;
        System.out.println(A+"x^2+"+B+"x+"+C+"=0 tenglama ildizi="+x1+" va"+" x2="+x2);
    }
}
