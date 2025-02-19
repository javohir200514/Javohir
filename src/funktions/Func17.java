package funktions;

import java.util.Scanner;

public class Func17 {
    public static double  DegToRad(double d) {
        double result;
        result=Math.PI/180*d;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gradus:");
        double d = sc.nextDouble();
        System.out.println(DegToRad(d));
    }
}
