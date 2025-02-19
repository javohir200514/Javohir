package procedures;

import java.util.Scanner;

import static java.lang.Math.abs;

public class FunSimple06 {
    public static void DigitCountSum(int k){
         int c=0,s=0;
         while(k!=0){
             c++;
             s+=k%10;
             k/=10;
         }
        System.out.println("sum of digits: "+s);
        System.out.println("amount of digits: "+c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int k=sc.nextInt();
        DigitCountSum(k);


    }
}
