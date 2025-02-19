package funktions;

import java.util.Scanner;

public class Func22 {
    public static double  PowerA3(double a) {
        return a*a*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println(PowerA3(a));
    }
}
