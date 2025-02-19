package procedures;

import java.util.Scanner;

import static java.lang.Math.abs;

public class FunSimple05 {
    public static void RectPS(double x1,double  y1,double  x2,double y2){
         double p,s;
         p=2*(abs(x1-x2)*abs(y1-y2));
         s=abs(x1-x2)*abs(y1-y2);
        System.out.println("Rectangle perimetr: "+p);
        System.out.println("Rectangle area: "+s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Rectangle cordinata (x1,y1):");
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        System.out.print("Rectangle cordinata (x2,y2):");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();

    }
}
