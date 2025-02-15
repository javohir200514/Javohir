package ifs;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Erter integer number: ");
        int number=sc.nextInt();
        if(number>0){
            System.out.print(++number);
        }else{
            System.out.println(number);
        }
    }
}
