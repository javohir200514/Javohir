package funktions;

import java.util.Scanner;

public class Func04 {
    public static double RingS(double r1,double r2){

        return Math.PI*(r1*r1-r2*r2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Enter radius of circle: ");
        double r1=sc.nextDouble();
        System.out.println("2-Enter radius of circle: ");
        double r2=sc.nextDouble();
        System.out.println("area:"+RingS(r1,r2));
    }
}
