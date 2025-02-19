package procedures;

import java.util.Scanner;

public class FunSimple16 {
    public static void  Sign(double x,double y ){
        int a,b;
        if(x<0){
            a=-1;
        }else if(x==0){
            a=0;
        }else a=1;
        if(y<0){
            b=-1;
        }else if(y==0){
            b=0;
        }else b=1;
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number A:");
            double a = sc.nextDouble();
            System.out.print("Enter number B:");
            double b = sc.nextDouble();

            Sign(a,b);


    }
}
