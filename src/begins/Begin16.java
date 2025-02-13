package begins;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Begin16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("2 ta nuqta kiriting=");
        int x1=sc.nextInt(),x2=sc.nextInt();
        int distance=abs(x1-x2);
        System.out.println("Masofa="+distance);
    }
}
