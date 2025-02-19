package procedures;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class FunSimple20 {
    public static void   TriangleP(double a,double h){
        double b;
        b=sqrt(a*a/2+h*h);
        System.out.println("Perimetr of Triangle:"+(2*b+a));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter a:");
            double a = sc.nextDouble();
            System.out.println("Enter h:");
            double h = sc.nextDouble();
            TriangleP(a,h);
    }
}
