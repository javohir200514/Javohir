package procedures;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class FunSimple04 {
    public static void Triangle(double a){
         double p,s;
         p=3*a;
         s=a*a*sqrt(3)/4;
        System.out.println("Triangle perimetr: "+p);
        System.out.println("Triangele area: "+s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Triangle side:");
        double a=sc.nextDouble();
        Triangle(a);
    }
}
