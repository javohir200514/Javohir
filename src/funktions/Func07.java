package funktions;

import java.util.Scanner;

public class Func07 {
    public static double Calc(double a,double b,int op){
        double result=0.0;
        if(op==1) result=(a-b);
        else if(op==2) result= (a*b);
        else if(op==3) result=(a/b);
        else if(op==4)  result= (a+b);
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b= sc.nextDouble();
        System.out.println("Enter operation:");
        int op= sc.nextInt();
        System.out.println("result=:"+Calc(a,b,op));
    }
}
