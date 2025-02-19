package procedures;

import java.util.Scanner;

public class FunSimple22 {
    public static void   Calc(double a,double b, int op){
     if(op==1) System.out.println(a-b);
     else if(op==2) System.out.println(a*b);
     else if(op==3) System.out.println(a/b);
     else if(op==4) System.out.println(a+b);
     else System.out.println("No operation");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter a:");
            double a = sc.nextDouble();
            System.out.println("Enter b:");
            double b= sc.nextDouble();
            System.out.println("Enter operation:");
            int op= sc.nextInt();
            Calc(a,b,op);

    }
}
