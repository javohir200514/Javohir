package procedures;

import java.util.Scanner;

public class FunSimple07 {
    public static void  InvDigits(int k){
         int s=0;
         while(k!=0){
             s=s*10+k%10;
             k/=10;
         }
        System.out.println(k+ " invert value: "+s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number a:");
        int a=sc.nextInt();
        System.out.print("Enter number b:");
        int b=sc.nextInt();
        System.out.print("Enter number c:");
        int c=sc.nextInt();
        InvDigits(a);
        InvDigits(b);
        InvDigits(c);

    }
}
