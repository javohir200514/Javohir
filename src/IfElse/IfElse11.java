package IfElse;

import java.util.Scanner;

public class IfElse11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two real number:");
        int A=sc.nextInt(),B=sc.nextInt(),result;
        if(A!=B){
            if(A>B) result=A;
            else result=B;
            A=result;
            B=result;
        }
        else{
            A=0;B=0;
        }
        System.out.println("value of A:"+A+"   "+"value of B:"+B);
    }
}
