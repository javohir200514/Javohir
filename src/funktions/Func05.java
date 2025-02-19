package funktions;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Func05 {
    public static double Triangle(double a,double h){
     double b=sqrt(a*a/4+h*h);
     return 2*b+a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=sc.nextDouble();
        System.out.println("Enter h: ");
        double b=sc.nextDouble();
        System.out.println("peremetr of triangle"+Triangle(a,b));
    }
}
