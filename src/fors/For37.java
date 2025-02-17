package fors;

import java.util.Scanner;


public class For37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        int m=1,sum=0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++){
                m*=i;
            }
            System.out.println(m);
            sum+=m;
            m=1;
        }
    }
}
