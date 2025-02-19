package procedures;

import java.util.Scanner;

public class FunSimple12 {
    public static void  SortInc3(double x,double y,double z ){
        double max,min,middle;
        if(x>y&&x>z){
            max=x;
        }else if(y>x&&y>z){
            max=y;
        }else {
            max=z;
        }
        if(x<y&&x<z){
            min=x;
        }else if(y<x&&y<z){
            min=y;
        }else {
            min=z;
        }
        middle=x+y+z-min-max;
        System.out.println(min+" "+middle+" "+max);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<2) {
            System.out.print("Enter number A:");
            double a = sc.nextDouble();
            System.out.print("Enter number B:");
            double b = sc.nextDouble();
            System.out.print("Enter number C:");
            double c = sc.nextDouble();
            SortInc3(a, b, c);
            i++;
        }

    }
}
