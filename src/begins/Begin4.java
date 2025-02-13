package begins;

import java.util.Scanner;

public class Begin4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Diametr enter=");
        int d=sc.nextInt();
        double L;
        L=2*3.14*d;
        System.out.print("Length="+L);
    }
}
