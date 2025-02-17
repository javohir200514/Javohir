package whiles;

import java.util.Scanner;

public class While23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt(),i=1,gcd=0;
        while(i<=a){
            if(a%i==0&&b%i==0){
            gcd=i;}
             i++;
        }
        System.out.println(gcd);
    }
}
