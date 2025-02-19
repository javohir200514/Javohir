package procedures;

import java.util.Scanner;

public class FunSimple10 {
    public static void  Swap(int x,int y){
    int a;
    a=x;
    x=y;
    y=a;
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
        Swap(a,b);
        Swap(c,d);


    }
}
