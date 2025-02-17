package fors;

import java.util.Scanner;


public class For14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter N:");
        int n=sc.nextInt();
        int squart=0 ;
        for(int i=1;i<=n;i++) {
            squart+=(2*i-1);
            System.out.print(" "+squart);
        }
    }
}
