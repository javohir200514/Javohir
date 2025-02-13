package IfElse;

import java.util.Scanner;

public class IfElse16 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of three number:");
        int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
        if(A<B&&B<C){
            System.out.println("A="+2*A+" "+"B="+2*B+" "+"C="+2*C);
        }
        else System.out.println("A="+(-A)+" "+"B="+(-B)+" "+"C="+(-C));
    }
}
