package procedures;

import java.util.Scanner;

public class FunSimple08 {
    public static void  AddRightDigit(int k,int d){
        int result;
        result=k*10+d;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number k:");
        int k=sc.nextInt();
        System.out.print("Enter number d:");
        int d1=sc.nextInt();
        AddRightDigit(k,d1);
        System.out.print("Enter number d:");
        k=k*10+d1;
        int d2=sc.nextInt();
        AddRightDigit(k,d2);
    }
}
