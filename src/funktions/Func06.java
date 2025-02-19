package funktions;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Func06 {
    public static int SumRange(int a,int b){
        int sum1=0;
        for (int i=a;i<b;i++){
            sum1+=i;
        }

        return sum1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b= sc.nextInt();
        System.out.println("Enter c:");
        int c= sc.nextInt();
        System.out.println("sum of integer numbers range (A,B):"+SumRange(a,b));
        System.out.println("sum of integer numbers range (B,C):"+SumRange(b,c));
    }
}
