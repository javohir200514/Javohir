package fors;

import java.util.Scanner;

public class For01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entter k:");
        int k=sc.nextInt();
        System.out.println("Entter n:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(k+" ");
        }
    }
}
