package Integers;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Yilni kiriting:");
        int year=sc.nextInt();
        int asr=(year-1)/100+1;
        System.out.println(asr);

    }
}
