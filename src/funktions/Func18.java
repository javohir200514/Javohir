package funktions;

import java.util.Scanner;

public class Func18 {
    public static double   RadToDeg(double r) {
        double result;
        result=(180/Math.PI)*r;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radian:");
        double r = sc.nextDouble();
        System.out.println(RadToDeg(r));
    }
}
