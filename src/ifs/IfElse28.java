package ifs;

import java.util.Scanner;

public class IfElse28 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of year:");
        int year=sc.nextInt();
        if(year%4==0&&(year/100)%4==0){
            System.out.println(366);
        }else System.out.println(365);
    }
}
