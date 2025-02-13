package begins;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Begin29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Burchakni kiriting=");
        int burchak=sc.nextInt();
        double radian= PI/180*burchak;
        System.out.println("Radian="+radian);

    }
}
