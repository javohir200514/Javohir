package fors;

import java.util.Scanner;


public class For23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        System.out.println("Entter X:");
        int x=sc.nextInt();
        double factorial=1.0,sum=0,pow=1.0,a=1,c;
        for(int i=1;i<=2*n;i++) {
            if(i%2!=0){
                c=(a*pow/factorial);
                sum+= c;
                a*=-1;
            }
            pow*=x;
            factorial*=i;

        }
        System.out.println(Math.PI/6);
        System.out.println("sum="+sum);
    }
}
