package procedures;

import java.util.Scanner;

public class FunSimple19 {
    public static void   RingS(double r1,double r2){

        System.out.println(Math.PI*r1*r1-Math.PI*r2*r2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter r1:");
            double r1 = sc.nextDouble();
            System.out.println("Enter r2:");
            double r2 = sc.nextDouble();
            RingS(r1,r2);
    }
}
