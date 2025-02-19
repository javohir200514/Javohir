package procedures;

import java.util.Scanner;

public class FunSimple17 {
    public static void   RootCount(double a,double b,double c){
     double discremant=b*b-4*a*c;
     if(discremant>0) System.out.println(2);
     else if(discremant==0) System.out.println(1);
     else System.out.println(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        double a=sc.nextDouble();
        System.out.println("Enter b:");
        double b=sc.nextDouble();
        System.out.println("Enter c:");
        double c=sc.nextDouble();
        RootCount(a,b,c);


    }
}
