package begins;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Begin30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Radianni kiriting=");
        double radian=sc.nextDouble();
        double burchak= (180/PI*radian);
        System.out.println("Burchak="+burchak);
    }
}
