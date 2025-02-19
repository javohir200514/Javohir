package procedures;

import java.util.Scanner;

public class FunSimple15 {
    public static void  ShiftLeft3(double x,double y,double z ){
        double a=x,b=y,c=z;
        y=z;
        x=b;
        z=a;
        System.out.println(x+" "+y+" "+z);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number A:");
            double a = sc.nextDouble();
            System.out.print("Enter number B:");
            double b = sc.nextDouble();
            System.out.print("Enter number C:");
            double c = sc.nextDouble();
            ShiftLeft3(a,b,c);


    }
}
