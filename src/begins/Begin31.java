package begins;

import java.util.Scanner;

public class Begin31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("T_F=");
        double T_F=sc.nextDouble();
        double T_c=(5*(T_F-32))/9;
        System.out.println("Tc="+T_c);
    }
}
