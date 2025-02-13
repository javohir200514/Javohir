package begins;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Begin12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("katetlarni kiriting=");
        int a=sc.nextInt(),b=sc.nextInt();
        double c=sqrt(pow(a,2)+pow(b,2));
        double P=a+b+c;
        System.out.println("Gipatenuzasi="+c+"   "+"Peremetri="+P);
    }
}
