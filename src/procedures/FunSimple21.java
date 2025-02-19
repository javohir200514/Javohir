package procedures;

import java.util.Scanner;

public class FunSimple21 {
    public static void   SumRange(int a,int b,int c){
       int sum1=0,sum2=0;
       for (int i=a;i<b;i++){
           sum1+=i;
       }
       for (int i=b;i<c;i++){
           sum2+=i;
       }
        System.out.println("sum of integer numbers range (A,B):"+sum1);
        System.out.println("sum of integer numbers range (B,C):"+sum2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter a:");
            int a = sc.nextInt();
            System.out.println("Enter b:");
            int b= sc.nextInt();
            System.out.println("Enter c:");
            int c= sc.nextInt();
            SumRange(a,b,c);

    }
}
