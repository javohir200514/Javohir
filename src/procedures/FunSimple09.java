package procedures;

import java.util.Scanner;

public class FunSimple09 {
    public static void  AddRightDigit(int k,int d){
        int count=0,i=0,a=k;
        while(k!=0){
            count++;
            k/=10;
        }
        int result=1;
        while(count>i) {
            result *=10;
            i++;
        }
        result*=d;
        System.out.println(result+a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number k:");
        int k=sc.nextInt();
        System.out.print("Enter number d:");
        int d1=sc.nextInt();
        AddRightDigit(k,d1);
        System.out.print("Enter number d:");
        int count=0,i=0,a=k;
        while(k!=0){
            count++;
            k/=10;
        }
        int result=1;
        while(count>i) {
            result *=10;
            i++;
        }
        result*=d1;
        int d2=sc.nextInt();
        AddRightDigit(result+a,d2);
    }
}
