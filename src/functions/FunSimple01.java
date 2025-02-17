package functions;

import java.util.Scanner;

public class FunSimple01 {
    public static void PowerA3(double a){
        System.out.println(a*a*a);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five real numbers:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        PowerA3(a);
        PowerA3(b);
        PowerA3(c);
        PowerA3(d);
        PowerA3(e);


    }
}
