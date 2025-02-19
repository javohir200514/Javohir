package fors;

import java.util.Scanner;


public class For27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        System.out.println("Entter X:");
        int x=sc.nextInt();
        double sum=0,pow=1.0,k=1,c=1;
        sum+=x;
        for(int i=1;i<=n;i++) {
            pow*=x;
            if(i%2!=0){
                System.out.println(k*pow/(c*(2*i+1)));
                sum+=k*pow/(c*(2*i+1));
            }
            k*=(2*i-1);
            c*=(2*i);
        }
        System.out.println("sum="+sum);
    }
}
