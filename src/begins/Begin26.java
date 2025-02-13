package begins;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Begin26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("x ni kiriting=");
        int x=sc.nextInt();
        double y;
        y=4*pow(x-3,6)-7*pow(x-3,3)+2;
        System.out.println("y="+y);

    }
}
