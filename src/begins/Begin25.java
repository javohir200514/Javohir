package begins;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Begin25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x ni kiriting=");
        int x=sc.nextInt();
        double y;
        y=3*pow(x,6)-6*pow(x,2)-7;
        System.out.println("y="+y);

    }
}
