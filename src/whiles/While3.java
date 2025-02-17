package whiles;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        System.out.println("Enter K:");
        int k=sc.nextInt(),count=0;
        while(n>k){
            n-=k;
        }
        System.out.println("quotient= :"+n);
    }
}
