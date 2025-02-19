package procedures;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class FunSimple03 {
    public static void Mean(double x,double  y){
         double aMean,gMean;
        aMean=(x+y)/2;
        gMean=sqrt(x*y);
        System.out.println(x+" and "+y);
        System.out.println("Arithmetical mean: "+aMean);
        System.out.println("Geometrical mean: "+gMean);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("A:");
        double a=sc.nextDouble();
        System.out.print("B:");
        double b=sc.nextDouble();
        System.out.print("C:");
        double c=sc.nextDouble();
        System.out.print("D:");
        double d=sc.nextDouble();
        Mean(a,b);
        Mean(a,c);
        Mean(a,d);
    }
}
