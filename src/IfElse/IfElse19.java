package IfElse;

import java.util.Scanner;

public class IfElse19 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of four number:");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt(),D=sc.nextInt();
        if(A==B&&B==D){
            System.out.println(3);
        }
        else if(A==C&&C==D){
            System.out.println(2);
        }
        else if(B==C&&C==D) System.out.println(1);
        else System.out.println(4);
    }
}
