package functions;

import java.util.Scanner;

public class FunSimple11 {
    public static void   Minmax(int x,int y){
        int min,max;
        if(y>x){
            min=x;
        }else min=y;
        if(x>y){
            max=x;
        }else max=y;
        x=min;y=max;
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number A:");
        int a=sc.nextInt();
        System.out.print("Enter number B:");
        int b=sc.nextInt();
        System.out.print("Enter number C:");
        int c=sc.nextInt();
        System.out.print("Enter number D:");
        int d=sc.nextInt();
        Minmax(a,b);



    }
}
